package ex12inheritance;
/*
 상속관계 오버로딩 오버라이딩
 
 rideMethod() 오버라이딩
 loadMethod() 오버로딩
 
 오버로딩 : 함수명은 같으나 매개변수의 갯수 타입 순서가 다른 경우를 말한다.
 		즉 서로 다른 함수이므로 상속받은 하위클래스에는 오버로딩된 모든 메소드가 포함된다.
 		
 오버라이딩 : 함수명 매개변수 반환형까지 모두 동일한 함수를 상속관계에 있는 하위 클래스에 재정의 하는것을 말한다.
 		이 경우 하위클래스에서 정의한 메소드가 상위클래스의 메소드를 가지게 되므로 항상 최하위클래스의
 		메소드가 호출되게 된다. ※ 오버라이딩은 참조변수의 영향을 받지 않는다.
 */

class A{
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A{
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}	
}

class C extends B{
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
}

public class RideAndLoad {

	public static void main(String[] args) {

		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();

		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod();//c에 정의된 메소드 호출
		ref2.rideMethod();//c에 정의
		ref3.rideMethod();//메소드호출
		
		System.out.println("오버로딩 처리된 메소드");
		ref3.loadMethod();// 각각의
		ref3.loadMethod(1);// 메소드가
		ref3.loadMethod(1.1);// 호출된다.
		
		//해당 객체를 B형으로 간주하고 참조한다.
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1); 접근불가

		//해당 객체를 A형으로 간주하고 참조한다.
		ref1.loadMethod();
//		ref1.loadMethod(1); 접근불가
//		ref1.loadMethod(1.1); 접근불가

	}

}
