package ex14innerclass;

/*
 익명클래스(Anonymous Class)
 -이름이 없는 클래스를 말한다.
 -내부클래스처럼 GUI프로그램에서 많이 사용된다.
 -부모클래스의 메소드를 오버라이딩 하는 것이 주된 목적이다.
 -마치 클래스 정의하는 형태가 메소드를 정의하는것과 비슷하다.
 
 형식] 
 	부모클래스명 인스턴스변수 = new 부모클래스명(){
 		클래스의 실행부
 	};
 	=> 새로운 객체를 생성하는 형태이므로, 문장의 끝에 반드시 ;(세미콜론)을 붙여줘야 한다. 
 */
class Person{
	String name;
	public Person(String n) {
		name = n;
	}
	void printInfo() {
		System.out.println(String.format("이름:%s", name));
	}
}
class Student extends Person{
	String stNumber;
	public Student(String n, String stNum) {
		super(n);
		stNumber = stNum;
	}
	String getInfo() {
		//문자열 서식에 맞춰서 반환 해주는 메소드
		return String.format("학번:%s", stNumber);
	}
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(getInfo());
	}
	
}
//추상클래스
abstract class AbstractClass{
	abstract void abstractMethod();
}
//인터페이스
interface InterFace{
	void abstractMethod();
}

public class AnonymousClass {

	public static void main(String[] args) {

		//이름이 있는 자식클래스의 일반적인 참조형태
		Person person = new Student("문재인", "2016");
		person.printInfo();//오버라이딩 되었으므로 자식쪽 메소드 호출
		
		//person.stNumber = "2015"; [에러발생]
		((Student)person).stNumber = "2015";//다운캐스팅
		System.out.println(((Student)person).getInfo());
		/*
		 상위클래스의 참조변수로 하위크랠스의 멤버변수를 접근할수 없으므로
		 다운캐스팅해야함.
		 */
		
		/*
		  Person클래스를 상속받은 익명클래스 정의 및 생성
		 : Person타입의 인스턴스 변수에 Person을 상속받은 익명클래스를 생성해서
		 그 주소를 할당한다.
		 
		 new Perosn(){}; ==> 익명 extends Person{}; 의 형태라 생각하면 된다.
		 
		 이름이 없기 때문에 부모클래스의 이름을 빌려서 생성했다고 생각하자.
		 */
		Person anonyPerson = new Person("이낙연") {

			//익명클래스에서 새롭게 확장한 멤버
			int newVar;
			
			void newMethod() {
				System.out.println("익명클래스에서 새롭게 확장한 메소드");
			}
			
			//오버라이딩 하여 재정의한 메소드
			@Override
			void printInfo() {
				System.out.println("newVar= "+ newVar);
				newMethod();
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		anonyPerson.printInfo();
//		anonyPerson.newMethod(); //접근불가 에러발생
		
		//Student클래스를 상속받아 정의한 익명클래스
		Student anonyStudent = new Student("김경수", "2017") {
			
			int age = 1;
			
			@Override
			String getInfo() {				
				return super.getInfo()+", 나이:"+age;
			}
			@Override
			void printInfo() {
				System.out.println("이름:"+name+","+getInfo());
			}
		};
		System.out.println("[Student클래스를 상속받은 익명클래스]");
		anonyStudent.printInfo();
//		anonyStudent.age =100; //에러발생
//		((Student)anonyStudent).age =100; // 익명클래스는 다운캐스팅자체가 불가능
		
		/*
		 다운캐스팅은 자식클래스명부모타입의 인스턴스변수 형태로 형변환하여 하위클래스의
		 멤버에 접근하기 위한 수단이다. 그러나 익명클래스는 클래스명이 없기 때문에
		 위와 같이 다운 캐스팅이 불가능하다. 즉 익명클래스에서는 새롭게 정의한 멤버변수에 접근
		 할 수 없다. 따라서 익명클래스는 오버라이딩의 목적으로만 사용해야한다.
		 */
		
		//추상클래스를 상속받은 익명 클래스
		AbstractClass ac = new AbstractClass() {
			
			@Override
			void abstractMethod() {
				System.out.println("추상메소드 오버라이딩");
			}
		};
		ac.abstractMethod();
		
		//인터페이스를 구현한 익명클래스
		InterFace in = new InterFace() {
			
			@Override
			public void abstractMethod() {
				System.out.println("인터페이스의 추상메소드 오버라이딩");
			}
		};
		in.abstractMethod();
	}

}
