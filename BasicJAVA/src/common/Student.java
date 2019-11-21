package common;

public class Student extends Person{

	public String stNumber;
	
	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	
	@Override
	public String getInfo() {
		return String.format("%s, 학번: %s",super.getInfo(), stNumber);
	}
	
	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}

	@Override
	public int hashCode() {
		return age % 3;
	}
	
	/*
	 equals() : 두 객체간의 동일성을 
	 */
	@Override
	public boolean equals(Object obj) {

		Student compareStudent = (Student)obj;
		
		System.out.println("오버라이딩한 equals()호출됨 :" +name);
		
		if(compareStudent.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}
