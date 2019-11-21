package ex13interface;

//추상클래스1 - 추상메소드가 없는 추상클래스
abstract class NoHavingAbsMethod{
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	int instanceVar;
	static int staticVar;
	
	void instatnceMethod() {}
	static void staticMethod() {}
}

class NoHavingChild extends NoHavingAbsMethod{
	int newVar;

//	@Override
//	void instatnceMethod() {
//		//강제사항아님
//	}
	
}

//추상클래스2 - 추상메소드를 포함한 클래스
//abstract 를 interface로 바꿀수 있따........
abstract class HavingAbsMethod{
	
	/*
	 추상메소드를 멤버로 포함한 클래스는 반드시 abstract로 정의해야한다.
	 클래스 앞에 abstract를 지우면 에러가 발생된다.
	 */
	abstract void absMethod(int number);
}

class HavingChild extends HavingAbsMethod{
	/*
	 의무적으로 오버라이딩한 메소드로 만약 오버라이딩하지 않으려면 해당
	 클래스를 abstract로 정의해야 한다.
	 그럴 경우 해당 클래스로 객체를 생성할 수 없게 되므로 오버라이딩 하게 된다.
	 */
	
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩한 메소드");
	}
	
	void newMethod() {
		System.out.println("새롭게 확장한 메소드");
	}
	
}

public class AbstractBasic {

	public static void main(String[] args) {

		//추상클래스는 인스턴스를 생성 할 수 없다.
//		NoHavingAbsMethod nham = new NoHavingAbsMethod(); //에러발생
		
		//추상클래스를 상속한 하위클래스는 객체생성이 가능하다.
		NoHavingChild nhc = new NoHavingChild();
		
		/*
		 추상클래스로 인스턴스 생성은 할 수 없지만 참조변수로 사용하는것은 가능하다.
		 부모클래스의 참조변수로 자식클래스의 인스턴스를 참조하는 '이질화'의 형태이다.
		 */
		
		HavingAbsMethod ham = new HavingChild();
		ham.absMethod(100);
		
		/*
		 자식객체에 접근하기 위해 다운캐스팅 진행 후 접근한다.
		 */
		((HavingChild)ham).newMethod();
			
		/*
		 추상클래스내 선언된 정적멤버는 오버라이딩의 대상이 될 수 없으므로 
		 static이 가진 기본규칙을 따른다.
		 클래스명으로 접근이 가능하다.
		 */
		
		NoHavingAbsMethod.staticMethod();
		NoHavingChild.staticMethod();
		
	}

}
