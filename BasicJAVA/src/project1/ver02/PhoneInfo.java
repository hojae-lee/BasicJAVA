package project1.ver02;


//멤버메소드명 
//메뉴출력 : printMenu()
//입력 : dataInput()
//검색 : dataSearch()
//삭제 : dataDelete()
//주소록전체출력 : dataAllShow()


public class PhoneInfo {
	
	String name;
	String phonenumber;
	String birthday;
	
	public PhoneInfo() {
	}
	
	public PhoneInfo(String name, String phonenumber, String birthday) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
	}
	
	public void printMenu() {
		
	}
	
	public void showPhoneInfo() {
		System.out.println("이름:"+this.name);
		System.out.println("전화번호:"+this.phonenumber);
		System.out.println("생년월일:"+this.birthday);
	}
	

}
