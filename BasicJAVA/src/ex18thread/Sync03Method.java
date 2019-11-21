package ex18thread;

/*
 동기화메소드
 	: 여러 쓰레드에 의해 호출되는 공유메소드를 동기화하여 여러 쓰레드가 동시에 접근하지 못하도록 Lock을 거는것을 말한다.
 	
 	형식] 접근지정자 synchronized 반환타입 메소드며ㅑㅇ(){
 				실행문장;
 			}
 */
class MethodSyncClass{
	//공유 메소드를 동기화 처리함.
	synchronized void increase(int seed,int inc) {
		for(int i=1; i<=10; i++) {
			seed += inc;
			System.out.println(String.format("쓰레드명:%s,씨드값:%d",Thread.currentThread().getName(), seed));
			
			/*
			 메소드 자체가 동기화 처리되어있으므로 쓰레드 실행도중에 sleep을만나더라도 다른 쓰레드는 접근이 불가능하다.
			 */
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			}
		}
	}
}

//공유메소드를 호출하는 쓰레드로 정의된 메소드
class MethodSyncThread extends Thread{
	
	MethodSyncClass msc;
	int seed, inc;
	
	public MethodSyncThread(String threadName, MethodSyncClass msc, int seed, int inc) {
		super(threadName);
		this.msc = msc;
		this.seed = seed;
		this.inc = inc;
	
	}
	@Override
	public void run() {
		msc.increase(seed, inc);
	}
}

public class Sync03Method {

	public static void main(String[] args) {
		
		//공유메소드를 가진 클래스를 인스턴스화
		MethodSyncClass msc = new MethodSyncClass();
		
		//2개의 쓰레드를 생성하여 인스턴스를 공유한다.
		MethodSyncThread t1 = new MethodSyncThread("1st쓰레드", msc, 10, 2);
		MethodSyncThread t2 = new MethodSyncThread("2st쓰레드", msc, 10, 5);
		
		/*
		 동기화메소드로 처리되어 있으므로 하나의 쓰레드가 완료되어야 두번 째 쓰레드가 동작하게 된다.
		 */
		t1.start();
		t2.start();
		
	}

}
