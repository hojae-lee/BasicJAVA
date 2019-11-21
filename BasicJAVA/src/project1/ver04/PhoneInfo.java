package project1.ver04;


//멤버메소드명 
//메뉴출력 : printMenu()
//입력 : dataInput()
//검색 : dataSearch()
//삭제 : dataDelete()
//주소록전체출력 : dataAllShow()


public class PhoneInfo {
	
	String name;
	String phonenumber;
	
	public PhoneInfo() {
	}
	
	public PhoneInfo(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	public void dataAllShow() {
		
		System.out.println("이름:"+this.name);
		System.out.println("전화번호:"+this.phonenumber);

	}
	
	
	

}
