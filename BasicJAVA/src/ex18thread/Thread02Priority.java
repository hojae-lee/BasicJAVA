package ex18thread;

class MessageSendingThread extends Thread{
	
	String message;
	
	/*
	 생성자1과 2는 오버로딩 되어 정의됨.
	 
	 생성자 1: 멤버변수만 초기화
	 */
	public MessageSendingThread(String str) {
		message = str;
	}
	/*
	 생성자 : 멤버변수와 우선수위까지 초기화
	 */
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	/*
	 setPriority(우선순위) : 쓰레드의 우선순위를 지정할 때 사용하는 메소드
	 getPriority() : 쓰레드의 우선순위를 반환해주는 메소드
	 */
	public void run() {
		for(int i=1; i<=1000; i++) {
			System.out.println(message + "("+getPriority()+")");
			
			/*
			 기본적으로 우선순위가 높은 쓰레드가 먼저 실행 되지만 sleep()메소드를 사용하게 되면
			 실행 중 블럭상태로 전이되어 우선순위가 낮은 쓰레드가 가끔 실행될 수 있는 환경상황이 생기게
			 된다.
			 */
			try {
				//0.001초동안 블럭상태 만듬
				sleep(1);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class Thread02Priority {
	
	public static void main(String[] args) {

		/*
		 1단계
		 	우선순우를 별도로 지정하지 않은 상태로 쓰레드를 생성하면 모두
		 	동일한 우선순위 5를 부여받게 된다. 이때는 어떤 쓰레드가 먼저
		 	동작할지 알 수 없고 CPU가 알아서 작업을 분배한다.
		 */
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		/*
		 2단계
		 	쓰레드의 우선순위를 부여하기 위해 Thread클래스에는 static타입의 상수가 정의되어 있따.
		 	MAX_PRIORITY : 우선순위 10
		 	NORM_PRIORITY : 우선순위 5
		 	MIN_PRIORITY : 우선순위 1
		 	MessageSendingThread tr1 = new MessageSendingThread("첫번째",Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("두번째",Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세번째",Thread.MIN_PRIORITY);
		 	
		 	※ 우선순위가 높다고 무조건 먼저 실행되지는 않는다. 저체적인 확률이 높아지게 도이ㅓ 먼저 실행될
		 	가능성이 높아진다고 생각하면 된다.
		 */
		
		/*
		 3단계
		 static 상수대신에 정수를 사용해도 무방하다.
		 */
		MessageSendingThread tr1 = new MessageSendingThread("첫번째",10);
		MessageSendingThread tr2 = new MessageSendingThread("두번째",5);
		MessageSendingThread tr3 = new MessageSendingThread("세번째",1);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
