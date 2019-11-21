package ex18thread;

/*
 동기화 블럭을 이용한 데이터 동기화
 */
class DataSyncClass{
	int shareData;
	public DataSyncClass(int sData) {
		this.shareData = sData;
	}
}

class DataSyncThread extends Thread{
	DataSyncClass dsc;
	int inc;
	String threadName;
	
	public DataSyncThread(DataSyncClass dsc, int inc, String threadName) {
		
		super(threadName);
		this.dsc = dsc;
		this.inc = inc;
		this.threadName = threadName;
		
	}
	
	void increase() {
		for(int i=1; i<=10; i++) {
			
			/*
			 동기화 블럭으로 동기화 함.
			 	: 함수내에서 공유객체 때문에 문제가 발생할수 있는 부분만 동기화 해주는 방식.
			 	필요한 부분만 동기화하므로 성능면에서도 동기화메소드보다 좋다.
			 */
			synchronized (dsc) {
				dsc.shareData += inc;
			}
			
			System.out.println(String.format("쓰레드명:%s,공유데이터:%d", getName(), dsc.shareData));
			
			try {
				sleep(1000);
			}
			catch (InterruptedException e) {
			}
			
		}
	}
	
	@Override
	public void run() {
		//데이터 동기화 전
//		increase();
		
		/*
		 동기화 블럭으로 동기화함 이 부분은 메소드 호출 부분을 동기화 했으므로 동기화메소드와
		 별반 다를게 없다.
		 */
		//데이터 동기화 후
//		synchronized (dsc) {
			increase();
//		}
	}
}

public class Sync04Block {

	public static void main(String[] args) {

		
		MethodSyncClass msc = new MethodSyncClass();

		DataSyncClass dsc = new DataSyncClass(10);
		DataSyncThread t1 = new DataSyncThread(dsc, 2, "1st 쓰레드");
		DataSyncThread t2 = new DataSyncThread(dsc, 5, "두번째 쓰레드");
		
		t1.start();
		t2.start();
	}

}
