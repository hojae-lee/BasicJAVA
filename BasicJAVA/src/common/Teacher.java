package common;

public class Teacher extends Person{

	//선생에서 확장한 멤버변수
	String subject;
	
	public Teacher(String n, int a, String s) {
		super(n,a);
		this.subject = s;
	}
	
	@Override
	public String getInfo() {
		return String.format("%s 과목: %s",super.getInfo(), subject);
	}
	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}
	
}
