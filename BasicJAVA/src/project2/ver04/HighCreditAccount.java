package project2.ver04;

//high일 경우 필요한 것은 기본이자와 신용등급에 맞는 이율.
public class HighCreditAccount extends Account implements CustomSpecialRate{
	
	private String grade;
	private int rate;
	private int graderate;

	public HighCreditAccount() {
		super();
	}

	public HighCreditAccount(String accountNumber, String owner, int balance, int rate, String grade) {
		super(accountNumber, owner, balance);
		this.rate = rate;
		this.grade = grade;
		
		if(grade.equals("A")) {
			this.graderate = A;
		}
		else if(grade.equals("B") ) {
			this.graderate = B;
		}
		else if(grade.equals("C")) {
			this.graderate = C;
		}
		
	}

	public int getGraderate() {
		return graderate;
	}

	public void setGraderate(int graderate) {
		this.graderate = graderate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
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
		System.out.println("신용등급: "+getGrade());

	}
	
	//입금
	@Override
	void deposit(int money) {
		setBalance(getBalance()+(getBalance()*rate/100)+(getBalance()*graderate/100)+money);
	}
	
	//출금
	@Override
	void withdraw(int money) {
		setBalance(getBalance()-money);
	}
	
	@Override
	void withdrawsame(int money) {
		setBalance(getBalance()-getBalance());
	}
	
}
