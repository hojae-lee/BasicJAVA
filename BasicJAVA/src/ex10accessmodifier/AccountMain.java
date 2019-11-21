package ex10accessmodifier;

public class AccountMain {

	public static void main(String[] args) {

		//DAO객체 생성
		AccountDAO cap = new AccountDAO();
		
		//데이터 초기화를 통해 DTO객체 생성
		cap.init("홍길동", "1234-56789-0", 10000);
		//통장정보출력
		cap.printAccount();
		//출금처리
		cap.withdraw(20000);
		cap.withdraw(3000);
		//입금처리
		cap.deposit(10000);
		//통장정보출력
		cap.printAccount();
		
		System.out.println("====================");
		
		cap.init("장보고", "456-78912-1", 20000);
		cap.printAccount();
		cap.withdraw(20000);
		cap.withdraw(3000);
		cap.deposit(10000);
		cap.printAccount();
		
	}

}
