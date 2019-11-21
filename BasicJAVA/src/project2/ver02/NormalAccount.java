package project2.ver02;

public class NormalAccount extends Account{

	private int rate;

	public NormalAccount() {
		super();
	}

	public NormalAccount(String accountNumber, String owner, int balance, int rate) {
		super(accountNumber, owner, balance);
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate/100;
	}
	
	@Override
	public String getAccountNumber() {
		return super.getAccountNumber();
	}

	@Override
	public void setAccountNumber(String accountNumber) {
		super.setAccountNumber(accountNumber);
	}

	@Override
	public String getOwner() {
		return super.getOwner();
	}

	@Override
	public void setOwner(String owner) {
		super.setOwner(owner);
	}

	@Override
	public int getBalance() {
		return super.getBalance();
	}

	@Override
	public void setBalance(int balance) {
		super.setBalance(balance);
	}

	@Override
	void showAccInfo() {
		super.showAccInfo();
		System.out.println("기본이자: "+ getRate()+"%");
	}
	
	@Override
	void deposit(int money) {
		setBalance(getBalance()+(getBalance()*rate/100)+money);
	}
}
