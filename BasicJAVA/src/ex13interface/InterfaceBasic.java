package ex13interface;

/*
 인터페이스(interface)
 
 클래스가 객체의 설계도라면 인터페이스는 클래스의 설계도라 할 수 있다.
 자바는 단일상속을 원칙이나 인터페이스를 통해 다중상속을 구현할 수 있다.
 추상클래스와 동일하게 상속을 목적으로 제작되므로 구현받은 하위 클래스에서는 반드시 오버라이딩 해야
 한다. 멤버로는 추상메소드와 상수로만 구성된다. 
 	메소드는 무조건 public abstract가 붙는다.
 	변수는 무조건 public static final이 붙는다.
 접근지정자는 public과 default만 가질 수 있따. static,final은 가질 수 없다.
 클래스가 인터페이스를 상속받을때는 implements구현 키워드를 인터페이스가 인터페이스를 상속받을때는
 extends상속 키워드를 사용한다. 
 인터페이스는 생성자가 없다.
 */
interface MyInterface1{
	
	/*
	 인터페이스는 객체생성을 목적으로 하지 않는 클래스이므로 생성자를 가질 수 없다
	 */
	//public MyInterface1(){} //->에러발생
	
	/*
	 인터페이스에 선언한 변수는 무조건 public static final로 선언되므로 "멤버상수"라고 표현한다.
	 */
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL  =Double.MAX_VALUE;
	
	/*
	 멤버메소드는 무조건 public abstract로 선언되어 추상메소드가 된다.
	 */
	public abstract void absFunc1();
	void absFunc2();
}

interface MyInterface2{
	void absFunc2();
}

/*
 클래스를 상속하는것은 extends 상속이라고 표현
 인터페이스를 상속하는 것은 implements 구현 이라고 표현
 컴마를 이용하여 여러개의 인터페이스를 구현 할 수 있다.
 */

class MyClass implements MyInterface1,MyInterface2{

	/*
	 인터페이스에 동일한 이름의 추상메소드가 존재하는 경우
	 하나만 오버라이딩 처리하면 된다.
	 */
	@Override
	public void absFunc1() {
		System.out.println("absFunc1()호출됨");
	}

	@Override
	public void absFunc2() {
		System.out.println("absFunc2()호출됨");
		
	}
	
}

public class InterfaceBasic {

	public static void main(String[] args) {

		MyInterface1 my1 = new MyClass();
		my1.absFunc1();
		my1.absFunc2();
		
		MyInterface2 my2 = new MyClass();
		my2.absFunc2();
		
	}

}
