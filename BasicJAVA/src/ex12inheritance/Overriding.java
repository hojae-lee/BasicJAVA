package ex12inheritance;

/*
 오버라이딩
 	클래스가 상속관계에 있을때 하위클래스에서 상위클래스의 멤버메소드를 동일한 이름으로
 	메소도를 재정의 하는것을 말함. 오버로딩과 다른점은 매개변수의 갯수,타입,반환형이
 	완전히 동일한 형태로 정의하는 것.
 	하위클래스에서 오버라이딩한 메소드는 상위클래스의 메소드를 가리게 된다.
 	즉 최하위 클래스에서 재정의한 메소드가 호출되게 된다.
 	오버라이딩 일 때는 무조건 제일 밑에꺼!. 오버라이딩 처리가 되었을 경우.
 */
class Speaker{

	private int volumnRate;
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	/*
	 상속관계에서 오버라이딩을 목적으로 정의된 메소드
	 */
	
	public void showState() {
		System.out.println("스피커의 볼륨크기: "+volumnRate);
	}
	
}

class BaseSpeaker extends Speaker{
	
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	/*
	 @Override : '어노테이션' 이라 부르고 오버라이딩 된 메소드에 붙어서 컴파일러에게
	 알려주는 역할을 한다.
	 */
	@Override
	public void showState() {
		//부모클래스의 멤버메소드를 호출 할 때 사용
		super.showState();
		System.out.println("베이스의 볼륨크기: "+baseRate);
	}
	
}

public class Overriding {

	public static void main(String[] args) {
	
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10); // 볼륨 10으로 설정
		baseSpeaker.setBase(20); // 볼륭20으로 설정
		baseSpeaker.showState();// 하위클래스에 오버라이딩 처리
		
		
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
//		speaker.setBase(40);//[에러발생.]
		/*
		 Speaker 참조변수로 BaseSpeaker 객체를 참조하게 되면 접근범위는 Speaker로 제한된다. 따라서
		 하위 클래스에 정의된 setBase()메소드는 호출 할 수 없다.
		 단, 오버라이딩 처리된 메소드가 있다면 하위클래스의 메소드가 호출되게 된다.
		 */
		speaker.showState();
		
		
	}

}