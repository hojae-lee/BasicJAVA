package ex10accessmodifier.sub;

import ex10accessmodifier.AccessModifierOne;

public class AccessModifierThree {
	
	/*
	 One클래스와 Three는 다른 패키지에 선언되었으므로 객체 생성을 위해서는 import가 필요하다.
	 */

	AccessModifierOne one;
	
	public void access() {
		
		one = new AccessModifierOne();
		
		System.out.println("[접근가능한 멤버 변수들]");
		/*
		one.privateVar : private 이므로 외부접근불가
		one.defaultVar : 패키지가 다른 경우 default로 선언된 멤버는 외부접근불가
		 */
//		System.out.println("one.defaultVar="+ one.defaultVar);
//		System.out.println("one.publicVar="+ one.publicVar);
		System.out.println("one.publicVar="+ one.publicVar);
		
		System.out.println("[접근가능한 멤버 메소드들]");
//		one.defaultMethod();
//		one.publicMethod();
		
		one.publicMethod();
		
		System.out.println("[디폴트 클래스의 객체생성]");
//		DefaultClass dClass = new DefaultClass();
		/*
		 DefaultClass 클래스는 접근지정자가 default이므로 다른 패키지에서는 보이지 않기 때문에
		 import를 할 수 없다. 만약 다른 패키지에서 사용하게 하려면 반드시 public으로 선언해야 한다
		 */
		
	}
}
