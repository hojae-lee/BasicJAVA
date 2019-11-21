package ex12inheritance;

public class PrivateInheritanceMain {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(10000);
		
		/*
		 private이므로 상속받은 하위 클래스에서는 접근이 불가능하다.
		 이 떄는 부모의 멤버메소드를 통해서만 접근해야 한다.
		 */
//		sa.money = 100000; // 접근불가
		
		sa.saveMoney(5000);
		sa.showAccountMoney();
		
//		Account ac = new Account(1000); 접근불가
//		ac.money = 1000; 접근불가
		
	}
	
}

//부모클래스
class Account{
	/*
	 멤버변수가 상속관계에 있다 하더라도 private로 선언되면 클래스 내부에서만 접근이 가능하다.
	 즉, 상속받은 하위클래스에서 직접 접근이 불가능하다.
	 */
	
	private int money;//잔고
	
	public Account(int init) {
		money = init;
	}
	//입금처리 : protected이므로 상속관계에서 접근가능.
	protected void depositMoney(int _money) {
		if(_money<0) {
			System.out.println("마이너스 금액은 입금처리 불가합니다.");
			return;
		}
		money += _money;
	}
	//private 멤버변수를 외부클래스로 반환할때 사용
	protected int getAccMoney() {
		return money;
	}
	
}

//자식클래스
class SavingAccount extends Account{
	
	//멤버변수없음
	
	/*
	 인자생성자 : super()를 통해서 부모의 생성자를 호출하여 초기화하고있다. 이 떄 인자가
	 하나인 생성자를 호출하게 된다.
	 */
	
	public SavingAccount(int initVal) {
		super(initVal);
	}
	
	public void saveMoney(int money) {
		/*
		 private로 선언된 money에 직접 접근할 수 없기 때문에 protected로 선언된
		 depositMoney() 를 통해 간접적으로 접근하여 입금을 처리한다.
		 */
		depositMoney(money);
//		money += money;
	}
	
	public void showAccountMoney() {
		System.out.println("지금까지의 누적금액: "+ getAccMoney() );
	}
	
}