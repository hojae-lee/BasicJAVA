package project1.ver07;

public class PhoneCompanyInfo extends PhoneInfo{
	
	String companyname;
	
	public PhoneCompanyInfo() {
		super();
	}

	public PhoneCompanyInfo(String name, String phonenumber,String companyname) {
		super(name, phonenumber);
		this.companyname = companyname;
	}
	
	@Override
	public void dataAllShow() {
		super.dataAllShow();
		System.out.println("회사:"+this.companyname);
	}

}
