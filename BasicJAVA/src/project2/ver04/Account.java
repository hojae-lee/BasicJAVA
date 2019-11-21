package project2.ver04;

import java.io.Serializable;

public abstract class Account implements Serializable{
	
	private String accountNumber;
	private String owner;
	private int balance;

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
	
	void showAccInfo() {
		
		System.out.println("계좌번호: "+getAccountNumber());
        System.out.println("고객이름: "+getOwner());
        System.out.println("잔고: "+ getBalance());
	}
	
	void deposit(int money) {}
	
	void withdraw(int money) {}
	
	void withdrawsame(int money) {}
	
}


