package ex18thread;

class Sum{
	int num;
	public Sum() {
		num = 0;
	}
	//매개변수를 멤버변수에 누적해서 더함.
	public void addNum(int n) {
		num +=n;
	}
	public int getNum() {
		return num;
	}
}
/*
 쓰레드 클래스를 생성하는 두번쨰 방법
 	:다중상속이 지원되지 않으므로 다른 클래스를 상속받아야 한다면 러너블 인터페이스를 구현해서 쓰레드 클래스를 정의한다.
 */
class AdderThread extends Sum implements Runnable{
	int start, end;
	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}
	/*
	 멤버변수 start와 end만큼 반복하면서 부모클래스의 addNum()메소드를 호출하여 누적합을 구한다.
	 */
	public void run() {
		for(int i= start; i<=end; i++) {
			System.out.println(i);
			addNum(i);
		}
	}
}

public class Runnable01 {

	public static void main(String[] args) {

		/*
		 Runnable 인터페이스를 구현한 클래스의 인스턴스를 대상으로 쓰레드를 생성한다. 해당 방법도 결국은 쓰레드 클래스를 통홰
		 쓰레드를 생성하게 된다.
		 */
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		thread1.start();
		thread2.start();
		
		try {
			/*
			 join()메소드 : 생성된 쓰레드가 작업을 완료하기를 기다리는 기능을 가지고 있다.
			 즉 해당 쓰레드가 하나의 작업이 종료되기를 기다렸다가 다음 쓰레드를 실행한다.
			 동시접근을 제한하는 기능을 가지고 있따.
			 */
			thread1.join();
			thread2.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("1~1000까지의 합: "+(at1.getNum()+at2.getNum()));
		
	}

}
