package ex08class;

/*
 연습문제] 은행계좌를 추상화 해보자
 	멤버변수 : 예금주, 꼐좌번호, 잔고  == (name,accountNumber,balance)
 	
 	멤버메소드 : 입금하다, 출금하다, 계좌잔고 출력하기 == ( deposit() ,withdraw() ,showAccount() )
 	
 	조건1 : 입금은 무제한으로 가능함
 	조건2 : 잔고가부족할 경우네는 출금불능 처리 1000원부터 출금불능.
 */

class Account{
	
	String name;
	String accountNumber;
	int balance;
	int password;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원이 입금완료");
	}
	
	void withdraw(int money, int password) {
	
		if(password==1234) {
			if(balance <money) {
				System.out.println("더 이상 출금안됨.");
				
			}
			else {
				balance -= money;
				System.out.println(money+"원이 출금");
			}
		System.out.println("===========출금 완료===========");
	}
		else {
			System.out.println("패스워드가 틀립니다.");
		}
	}
	
	void showAccount() {
		System.out.println("이름: "+name+"\n"+"계좌번호: "+accountNumber+"\n"+"잔고: "+balance);
	}
	
//	초기화 메소드: 기보적으로 모든 멤버변수를 초기화 할 수 있는 매개변수를 받아 초기화한다.
		
	void initialize(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber  = accountNumber;
		this.balance = balance;
		
	}
	
}

public class AccountMain {

	public static void main(String[] args) {
		
		
		Account ac = new Account();
		
		//초기화메소드호출
		
		ac.initialize("아무나","1111-123-4567",50000000);
		ac.deposit(150000);
		ac.withdraw(2500,1234);
		ac.showAccount();
	
	
	/////////////////////////////////////////////////////////////////////////////
	//두번째 통장 개설
	
		//직접객체생성해서 호출
		Account ac2 = new Account();
	
		ac2.name = "정우성";
		ac2.accountNumber = "123-45-67890";
		ac2.balance = 900000;
		ac2.showAccount();
	
	}

}
