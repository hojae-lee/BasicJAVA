package ex18thread;

public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		DepositThread deposit = new DepositThread(account);
		WithdrawThread withdraw = new WithdrawThread(account);
		
		
		deposit.start();
		withdraw.start();
		
		try {
			deposit.join();
			withdraw.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("잔액: "+account.lookup());
		
	}

}
