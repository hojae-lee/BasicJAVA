package ex08class;

/*
 생성자
 클래스를 객체화 할 때 자동으로 호출되는 메소드 
 자동으로 호출되며 개발자가 임의로 호출할 수 없다.
 반환값이 없다. 즉 특정 연산후 반환을 할 수 없다.
 그외는 메소드가 가진 모든 특징을 가지고 있다.(매개변수 전달, 오버로딩 등)
 
 생성자 내에서 this의 사용법
 1. 동일 클래스내에서 다른 생성자를 호출할때 사용한다.
 단 생성자 내에서만 호출이 가능하다.
 	사용법
 		this(매개변수1,매개변수2.......);
 2. 생성자 내에서 멤버변수와 매개변수의 이름이 동일 할 때 구분을 위해 사용된다.
 		this.변수명 = > 멤버변수
 		변수명 => 생성자의 매개변수
 		단, 멤버변수와 매개변수의 이름이 다르다면 this를 생략해도 무방하다. 명시적 코드를 위해 사용된다.
 */

public class PersonConstructor {
	
	String name;
	int age;
	String addr;
	
	/*
	 디폴트생성자
	 	: 해당 클래스에 생성자를 정의하지 않은 경우에 아래와 같이 매개변수, 몸체가 없는 생성자가 자동으로 삽입된다.
	 	단, 생성자를 하나라도 정의한다면 디폴트 생성자는 삽입되지 않는다.
	 */
	//public Person() {}
	
	public PersonConstructor() {
		name = "이름업음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다.");
		
	}
	
	public PersonConstructor(String name) {
		//멤버변수와 매개변수를 구분하기 위한 용도로 사용
		this.name = name;
		age =1 ;
		addr = "출처불명";
	}
	
	public PersonConstructor(String name, int age) {
		/*
		 this() 는 생성자내에서 다른 생성자를 호출할때 사용한다. 단 생성자내에서만 사용이 가능하다.
		 */
		this(name,age,"미상");
		System.out.println("나는 인자생성자[2]입니다");
	}
	
	public PersonConstructor(String _name, int age, String addr) {
		name = _name;
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3]입니다.");
	}
	
	void initialize(String name, int age, String addr) {
		//해당 코드는 생성자 내에서만 가능함.
		//this(name,age,"미상");
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s님의 정보\n", this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소:%s\n", addr);
	}
	
}
