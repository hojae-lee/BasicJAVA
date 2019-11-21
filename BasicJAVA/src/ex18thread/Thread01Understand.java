package ex18thread;

/*
 스레드의 생성은 스레드클래스를 상속받는것부터 시작한ㄷ.
 해당 방법은 쓰레드로 생성할 클래스가 다른 클래스를 상속받지 않아도 될떄 사용하는 방식이다.
 만약 다른 클래스를 상속받아야한다면 자바는 다중상속이 불가능하므로 러너블인터페이스를 구현하는 방법을 사용해야한다.
 */
class ShowThread extends Thread{
	
	String threadName;
	
	public ShowThread(String name) {
		threadName = name;
	}
	
	/*
	 run()메소드는 쓰레드의 메인메소드에 해당한다.
	 Thread() 클래스의 run() 메소드를 오버라이딩 한 것으로 해당 메소드는 직접 호출하면 안되고 start()메소드를 통해 간접적으로 호출해야 한다.
	 만약 직접 호출하게 되면 단순한 실행만 될 뿐 쓰레드가 생성되지 않으므로 주의해야 한다.
	 */
	@Override
	public void run() {
		for(int i =1; i<=100; i++) {
			System.out.println("안녕하세요.["+threadName+"]입니다.");
			try {
				/*
				 Thread클래스의 static 메소드로 실행의 흐름을 주어진 시간만큼 Block 상태로 전환시켜 준다. 1000->1초 이므로 아래는 0.01만큼
				 Block상태로 만들어준다.
				 */
				sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread01Understand {

	public static void main(String[] args) {

		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
		
		//쓰레드 객체를 통한 쓰레드 생성(실행)
		st1.start();
		st2.start();
		
	}

}
