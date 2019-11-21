package ex10accessmodifier;

/*
 DAO(Data Access Object)
 	: 데이터베이스에 데이터접근을 위한 객체
 	주로 DB접근을 하기 위한 로직과 비즈니스로직을 분리하기 위해 사용 MVC패턴에서는 M에 해당한다.
 	
 	해당 예제에서는 DB접속을 위한 모적은 아니고 DTO클래스에 저장된 데이터를 가공/처리하는 로직을 
 	구현하기 위한 목적으로 제작
 	
 	-초기화 로직
 	-입금 로직
 	-출금 로직
 	-통장정보 출력 로직
 */
public class AccountDAO {
	//멤버변수
	private AccountDTO capsule = new AccountDTO();

	//멤버메소드
	
	//초기화
	public void init(String name,String accNumber, int balance) {
		capsule.setName(name);
		capsule.setAccountNumber(accNumber);
		capsule.setBalance(balance);
	}
	
	public void deposit(int money) {
		capsule.setBalance(capsule.getBalance()+money);
		System.out.println(money+"원이 입금되었습니다.");
		printAccount();
	}

	public void withdraw(int money) {
		if(capsule.getBalance()< money) {
			System.out.println("잔액부족합니다.");
			return;
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money+"원이 출금되었습니다.");
		printAccount();
	}
	
	public void printAccount() {
		System.out.printf("[%s님의계좌정보]\n",capsule.getName());
		System.out.printf("계좌번호:%s\n", capsule.getAccountNumber());
		System.out.printf("잔액:%d\n", capsule.getBalance());
	}
}
