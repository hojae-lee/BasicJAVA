package ex18thread;

/*
 쓰레드로 구현하지 않은 클래스
 */
class NotThread{
	String title;
	public NotThread(String title) {
		this.title = title;
	}
	/*
	 쓰레드로 구현하지 않는 메소드
	 	: 하나의 클래스가 작업을 끝내야 다음 클래스이 작업을 진행할 수 있따.
	 */
	void notThreadMethod() {
		for(int i=1; i<=10; i++) {
			System.out.println(String.format("%s]i=%d",title,i));
		}
	}
}

/*
 도긻쓰레드
 	: 메인쓰레드와 working쓰레드를 일컫는 것으로 메인쓰레드가 종료되어도 계속 실행되며 Dead상태가 되어야
 	실행이 종료되는 쓰레드를 말한다.
 	해당 쓰레드를 실행하게 되면 main메소드 종료 이후에도 실행되는 것을 볼 수 있따.
 */
class YesThread extends Thread{
	
	public YesThread() {
		
		
	}
	/*
	 Thread클래스의 생성자를 호출할 때 전달하는 매개변수를 통해 해당 쓰레드의 이름을 지정할 수 있다.
	 지정된 이름은 getName()메소드를 통해 반환할 수 있따.
	 */
	public YesThread(String threadName) {
		super(threadName);
	}
	void threadMethod() throws InterruptedException{
		for(int i=1; i<=10; i++) {
			System.out.println(String.format("%s]i=%d",getName(),i));
			//쓰레드 실행시 2초씩 Block상태로 들어가게 된다.
			sleep(2000);
		}
	}
	@Override
	public void run() {
		try {
			threadMethod();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

/*
데몬스레드는 메인이 죽으면 죽기때문에 일반적으로 무한루프형태로 만든다.
*/
/*
 종속쓰레드
 	: 모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드를 말한다. 주로 프로그램의 보조역할을 담담한다.
 	예로 배경음악, 자동저장 등 프로그램이 종료될 때 자동으로 종료되므로 주로 무한루프로 구성한다.
 	특정 쓰레드를 Daemon Thread로 만들려면 setDaemon(true) 로 설정한다.
 */
class DaemonThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(String.format("[쓰레드명:%s]Jazz가 흘러요~]", getName()));
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장!!");
			} catch (InterruptedException e) {
				System.out.println("자동저장시 오류발생 ㅜㅜ");
			}
		}

	}
}

public class Thread03Daemon {

	public static void main(String[] args) {

		/*
		 쓰레드로 구현하지 않은 클래스의 작업
		 	: 첫번쨰 클래스가 완전히 작업을 마친 후 두번째 클래스가 실행된다.
		 */
		NotThread nt1 = new NotThread("첫번쨰 클래스");
		nt1.notThreadMethod();
		
		NotThread nt2 = new NotThread("두번쨰 클래스");
		nt2.notThreadMethod();
		
		/*
		 독립쓰레드 실행
		 	start() : 쓰레드를 Runnable상태로 만들어준다.
		 	setName() : 쓰레드의 이름을 지정한다.
		 	방법1 : Thread클래스의 생성자를 호출하여 지정
		 	방법2 : setName()메소드를 이용하여 지정
		 	setPriority(): 쓰레드의 우선순위를 지정한다.
		 */
		YesThread yt1 = new YesThread("1st 쓰레드");
		yt1.setName("첫번쨰쓰레드");
		yt1.start();
		
		YesThread yt2 = new YesThread("2st 쓰레드");
//		YesThread yt2 = new YesThread();/* 쓰레드의 이름을 지정하지 않으면 JVM이 자동으로 이름을 부여한다.*/
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
		
		DaemonThread dt = new DaemonThread();
		dt.setName("난 데몬쓰레드");
		dt.setDaemon(true);
		dt.start();
		
		System.out.println("현재활성화된상태의 쓰레드수"+ Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명:"+ Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위:"+Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Thread)종료");
		
		
		
	}

}

