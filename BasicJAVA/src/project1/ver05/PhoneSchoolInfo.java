package project1.ver05;

public class PhoneSchoolInfo extends PhoneInfo{

	String studentname;

	public PhoneSchoolInfo() {
		super();
	}

	public PhoneSchoolInfo(String name, String phonenumber, String studentname) {
		super(name, phonenumber);
		this.studentname = studentname;
	}
	
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("학년: "+this.studentname);
	}
	
}
