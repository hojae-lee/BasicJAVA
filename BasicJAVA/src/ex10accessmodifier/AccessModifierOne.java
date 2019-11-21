package ex10accessmodifier;
/*
 접근 지정자 : 클래스와 클래스 사이의 멤버간의 접근을 제어하는 기능을 가진 키워드를 말한다.
 
 접근의 범위 비교
 	private < default < protected < public
 	
 	-private : 자신의 클래스 내에서만 접근 가능. 외부 클래스에서는 접근불가
 	-default : 동일 패키지내에서만 접근가능
 	-protected : 상속관계에 있는 클래스에서 접근가능
 	-public : 모든 클래스에서 접근가능
 	
 	접근지정자를 붙일 수 있는곳
 	클래스, 멤버변수, 멤버메소드 모두 가능하나 클래스명 앞에는 public과 default만 붙일 수 있따.
 */

//class를 정의 할 때는 반드시 public과 default만 가능하다. 아래는 에러발생됨.

//private class PrivateClass{
//	void notFunc() {
//		System.out.println("나는 정의할 수 없는 class");
//	}
//}

/*
 접근지정자를 생략했으므로 default클래스로 지정됨.
 해당 클래스는 동일 패키지내에서만 접근가능함.
 */

class DefaultClass{
	//몸체가 없는 default 클랫스
}

public class AccessModifierOne {
	
	//멤버변수 : 각각의 접근지정자를 사용함.
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	//멤버메소드
	private void privateMethod() {
		//클래스내부이므로 private 멤버 접근가능함.
		System.out.println("privateVar="+ privateVar);
		System.out.println("privateMethod()메소드 호출");
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateMethod();
		System.out.println("publicMethod()메소드 호출");
	}

}
