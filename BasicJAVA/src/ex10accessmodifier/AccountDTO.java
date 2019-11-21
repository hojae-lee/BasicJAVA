package ex10accessmodifier;

/*
DTO(Date Transfer Object)
	: 데이터 교환을 위한 데이터 객체이다. 스프링에서는 빈이라고 부르기도 한다.
	주로 DTO객체는 로직을 전혀 갖고 있지 않는 순수한 데이터 객체이며 그속성에 접근하기위한
	getter setter 메소드를 가지고 있따.
	VO라고 부르기도 한다.
*/

public class AccountDTO {
	//1.멤버변수 정의
	private String name;//예금주
	private String accountNumber;//계좌번호
	private int balance;//잔고
	//2.기본생성자,인자생성자정의
	
	public AccountDTO() {}
	public AccountDTO(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//3.getter setter 정의
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
