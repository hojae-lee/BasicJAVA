package ex18thread;

class Increment{
	int num = 0;
	
	//멤버변수를 1증가한다.
	/*
	 1. 동기화 처리가 안된 메소드 : 결과 비정상
	 */
//	public void increment() {
//		num++;
//	}
	
	/*
	 2. 동기화방법1: 동기화메소드
	 	 - 메소드 전체를 동기화한다.
	 */
//	public synchronized void increment() {
//		num++;
//	}
	
	/*
	 3.동기화 방법2 : 동기화블럭
	 -메소드 내에서 필요한 코드만 블럭으로 지정하는 방법이다. 
	 */
	public void increment() {
		synchronized(this) {
		num++;
		}
	}
	
	/*
	 -synchronized(동기화) 선언으로 정확한 결과는 나왔지만 코드 실행 시간이 엄청나게 늘어나게 된다.
	 성능의 감소를 초래하므로 필요한 부분에서만 동기화 처리하는것이 좋다.
	 동기화메소드보다는 동기화블럭이 기본적으로 좋은 성능을 나타낸다.
	 */
	
	public int getNum() {
		return num;
	}
}

class IncThread extends Thread{
	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10000; i++) {
			for(int j=1; j<=10000; j++) {
				inc.increment();
			}
		}
	
	}
}

public class Sync02Longtime {

	public static void main(String[] args) {

		Increment inc = new Increment();
		
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
		
		try {
			it1.join();
			it2.join();
			it3.join();
		} 
		catch (InterruptedException e) {}
		System.out.println(inc.getNum());
	}

}
