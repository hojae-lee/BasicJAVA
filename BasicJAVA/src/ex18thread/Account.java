package ex18thread;

public class Account {

	int balance;
	public Account() {}
	public Account(int balance) {

		this.balance = balance;
	}
	//입금
	public void deposit(int money) {
		synchronized (this) {
			balance += money;	
		}
		
	}
	//출금
	public synchronized void withdraw(int money) {
		synchronized (this) {
			balance -= money;
		}
	
	}
	
	public int lookup() {
		return balance;
	}
	
}

class DepositThread extends Thread{
	
	Account account;
	
	public DepositThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++) {
			account.deposit(i);
		}
	}
	
}

class WithdrawThread extends Thread{
	
	Account account;
	
	public WithdrawThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=100; i++) {
			account.withdraw(i);
		}
	
	}
}

