package project2.ver05;

import java.util.Scanner;

public class Account implements MenuChoice{

	AccountDAO accountDAO = new AccountDAO();
	
	private String accountNumber;
	private String owner;
	private int balance;
	
	Scanner sc = new Scanner(System.in);
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account() {}
	
	public Account(String accountNumber,String owner,int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	//메뉴출력
	public void showMenu() {
		
			System.out.println("-----Menu-----");
			System.out.println("1.계좌개설");
			System.out.println("2.입    금");
			System.out.println("3.출    금");
			System.out.println("4.계좌정보출력");
			System.out.println("5.프로그램종료");
	}
	
	//계좌개설을 위한 함수
	public void makeAccount() {
		
		System.out.println("***신규계좌개설***");
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("계좌번호 : ");
        String accountNumber=sc.nextLine();
 
        System.out.print("이름 : ");
        String name=sc.nextLine();
 
        System.out.print("금액 : "); 
        int balance=Integer.parseInt(sc.nextLine());
 
        new AccountDAO().insertExecute(accountNumber, name, balance);
	}
	
	//입금
	public void depositMoney() {
		
		System.out.println("계좌번호와 입금할 금액을 입력하세요.");
	    String number = sc.nextLine();
	    int money = Integer.parseInt(sc.nextLine());

	    new AccountDAO().updateExectue(number, money);
    
	}
	
	//출금
	public void withdrawMoney() {
		System.out.println("계좌번호와 출금할 금액을 입력하세요.");
	    String number = sc.nextLine();
	    int money = Integer.parseInt(sc.nextLine());
	    
    	new AccountDAO().updateExecutetwo(number,money);
	     
	}
	
	//전체계좌정보출력
	public void showAccInfo() {
		accountDAO.selectExecute();
	}
	
}


