package project2.ver01;

import java.util.Scanner;

public class Account implements MenuChoice{

	private static Account[] accounts = new Account[50];
	private static int index = 0;
	
	private String accountNumber;
	private String owner;
	private int balance;
	
	Scanner sc = new Scanner(System.in);
	
	//고객정보계좌확인
	public static int checkCustomerInformation(String accountNumber){
		for(int i=0; i<index; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return i;
            }              
        }return -1;
    }
	
	
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
        int balance=sc.nextInt();
 
        accounts[index] = new Account(accountNumber, name, balance);
        index++;
 
        System.out.println("고객 계좌가 개설되었습니다.");
	}
	
	//입금
	public void depositMoney() {
		
		System.out.println("계좌번호와 입금할 금액을 입력하세요.");
	    String number = sc.nextLine();
	    int money = sc.nextInt();
	     
	    int indexs = checkCustomerInformation(number);
        if(indexs != -1){
        	System.out.println(accounts[indexs].getBalance());
        	accounts[indexs].setBalance(accounts[indexs].getBalance()+money);
        }
        else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
	}
	
	//출금
	public void withdrawMoney() {
		System.out.println("계좌번호와 입금할 금액을 입력하세요.");
	    String number = sc.nextLine();
	    int money = sc.nextInt();
	     
	    int indexs = checkCustomerInformation(number);
        if(indexs != -1){
        	accounts[indexs].setBalance(accounts[indexs].getBalance()-money);
        }
        else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
	}
	
	//전체계좌정보출력
	public void showAccInfo() {
		System.out.println("전체고객조회");
		for(int i=0; i<index; i++){
            System.out.println("계좌번호: "+accounts[i].getAccountNumber());
            System.out.println("고객이름: "+accounts[i].getOwner());
            System.out.println("잔고: "+ accounts[i].getBalance());
            System.out.println("=============================");
        }
	}
	
}


