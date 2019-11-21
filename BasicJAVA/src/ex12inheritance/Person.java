package ex12inheritance;

public class Person {

	//멤버변수
	private String name;
	private int age;
	
	//생성자
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//getter
	public String getName() {
		return name;
	}
	/*
	 멤버 메소드 정의
	 
	 -4가지의 접근지정자를 사용하여 정의한 멤버메소드
	 */
	private void eat() {
		System.out.println("부모님이 드신다.");
	}
	String sleep() {
		System.out.println("부모님이 주무신다");
		return null;
	}
	protected int walk() {
		System.out.println("부모님이 산책하신다.");
		return 0;
	}
	public void excecise() {
		System.out.println("부모님이 운동하신다.");
	}
	
	/*
	 문자열을 원하는 서식에 맞춰서 반환 할 떄 사용함.
	 */
	
	String getPerson() {
		return String.format("성함:%s, 연세:%d",name,age);
	}
	void printPerson() {
		System.out.println(getPerson());
	}
	//정적메소드 정의
	static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
}
