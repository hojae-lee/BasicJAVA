package ex12inheritance;

public class Student extends Person {
	//멤버변수
	String stNumber;//학번
	
	//생성자
	public Student(String name,int age, String stNumber) {
		super(name,age);
		this.stNumber = stNumber;
	}
	
	//자식 클래스에서 새롭게 확장한 메소드
	void study() {
		System.out.println(getName()+"이(가) 공부한다.");
	}
	/*
	 오버라이딩 아님
	 부모클래스에 private멤버로 선언되었기 떄문에 자식클래스에 보이지 않으므로 오버라이딩의
	 대상이 될 수 없다.
	 즉 해당 메소드는 자식클래스에서 새롭게 확장한 멤버메소드가 된다.
	 */
	private void eat() {
		System.out.println("학생이 먹는다.");
	}

	/*
	 메소드 오버라이딩이 되는 조건
	 - 부모클래스에서 선언될 때와 비교하여 접근범위가 동일하거나 혹은 그보다 접근범위가 넓을때만
	 가능하다.즉 부모쪽에서 default 자식쪽에서 default 라면 오버라이딩 가능함.
	 */
	@Override
	String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	/*
	 오버라이딩 아님.
	 매개변수의 갯수가 부모와 다르므로 이 경우는 오버로딩 형태로 자식클래스에서 확장한 메소드가 된다.
	 */
	int walk(int age) {
		System.out.println("나이가 "+age+"살인 학생이"+ "산책한다.");
		return 0;
	}

	/*
	 오버라이딩 정의됨.
	 
	 super() : 부모클래스의 생성자 호출
	 super.멤버 : 부모클래스에 정의된 멤버변수 혹은 멤버메소드를 호출할 때 사용.
	 */
	@Override
	public void excecise() {
//		super.excecise();
		System.out.println("학생이 운동한다.");
	}
	
	/*
	 static(정적) 메소드는 오버라이딩 불가능함
	 클래스 외부에 존재하므로 오버라이딩의 대상이 될 수 없다.
	 */
	
	static void staticMethod() {
		System.out.println("학생의 정적메소드");
	}
	
	@Override
	String getPerson() {
		return super.getPerson()+", 학번"+ stNumber;
	}

	@Override
	void printPerson() {
		System.out.println(getPerson());
	}

	
	
}
