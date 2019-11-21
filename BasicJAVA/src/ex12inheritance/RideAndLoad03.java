package ex12inheritance;

public class RideAndLoad03 {

	public static void main(String[] args) {

		Student student = new Student("홍길동", 20, "00학번");
		
		/*
		 자식 타입의 인스턴스 변수를 통한 메소드 호출
		 즉 오버라이딩으로 정의된 자식쪽의 메소드가 호출된다.
		 */
		System.out.println("[지식타입의 인스턴스변수 - 오버라이딩]");
		student.excecise();
		student.sleep();
		System.out.println(student.getPerson());
		student.printPerson();
		
		System.out.println("[자식타입의 인스턴스변수 - 새롭게 정의]");
		student.study();
		student.walk();//오버로딩 부모쪽 호출
		student.walk(25);//오버로딩 자식쪽 호출
		Student.staticMethod();//정적메소드 - 클래스명으로 호출
		
		Person person = new Student("김유신", 30, "99학번");
		
		/*
		 상속관계에서 오버라이딩 되면 항상 하위클래스에서 재정의한 메소드가 호출된다. 즉, 참조변수의 영향을 받지 않는다.
		 */
		System.out.println("[부모타입의 인스턴스 변수-오버라이딩]");
		person.excecise();
		person.sleep();
		System.out.println(person.getPerson());
		person.printPerson();
		
		System.out.println("[부모타입의 인스턴스변수-새롭게정의]");
//		person.study(); 자식쪽에서 새롭게 확장한 메소드 - 호출불가
		person.walk();
//		person.walk(20); 자식쪽에서 확장한 메소드 - 호출 불가.
		
		/*
		 정적멤버는 오버라이딩의 대상이 될 수 없으므로 해당 클래스의 이름으로 접근가능한 메소드 호출됨.
		 */
		Person.staticMethod();
	}

}
