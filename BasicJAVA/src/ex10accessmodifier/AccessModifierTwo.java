package ex10accessmodifier;

/*
 AccessModifierOne 클래스와 동일한 패키지에 정의되어 있다.
 멤버변수와 멤버메소드의 기본적인 접근이 혀용된다.
 */

public class AccessModifierTwo {

	//멤버변수 : 두 클래스는 동일 패키지에 있으므로 import 필요없음.
	AccessModifierOne one;
	
	public void access() {
		
		one = new AccessModifierOne();
		
		System.out.println("[접근 가능한 멤버 변수들]");
		
		/*
		 AccessModifyerOne 의 멤버 중 private 접근지정자가 붙은 멤버는 접근이 불가능하다.
		 서로 다른 클래스 이기 때문.
		 
		 ※ private으로 선언된 멤버를 외부클래스에서 접근하기 위해서는 주로 public으로 선언된 멤버메소드
		 를 통해 간접적으로 접근한다.
		 */
		//[호출불가] - private 이므로
//		System.out.println("privateVar="+ privateVar);
		System.out.println("one.defaultVar="+ one.defaultVar);
		System.out.println("one.publicVar="+ one.publicVar);
		
		System.out.println("[접근 가능한 멤버 메소드들]");
//		one.privateMethod(); 호출불가 private이므로
		one.defaultMethod();
		one.publicMethod();
		
		/*
		 One클래스와 Two클래스가 동일한 패키지에 선언되었으므로 객체생성이 가능하다.
		 */
		
		System.out.println("[default 클래스이 객체생성]");
		DefaultClass dClass = new DefaultClass();
	}
	
}
