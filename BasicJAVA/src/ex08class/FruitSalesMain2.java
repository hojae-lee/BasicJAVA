package ex08class;

//판매자 클래스
class FruitSeller2 {
	
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매수익(보유 금액)
	int apple_price; // 상수 => 변수
	/*
	 해당 버전에서는 상수사용불가.
	 */
	
	/*
	 첫번째 버전에서는 apple_price를 상수로 선언한 후 초기화했다.
	 하지만 상수는 단 한 번만 초기화되는 특성 때문에 initMembers() 메소드에서는
	 초기화할 수 없다. 이유는 해당 메소드는 개발자가 원할 때 언제든지 
	 호출할 수 있기 때문에 상수의 특성과는 맞지 않기 때문이다.
	 */
	
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: "+numOfApple);
		System.out.println("[판매자]판매수익: "+myMoney);
	}
	
}

//구매자 클래스
class FruitBuyer2 {
	
	int myMoney;//보유금액
	int numOfApple;//보유한 사과의 갯수
	
	/*
	 초기화 메소드
	 	: 멤버변수를 초기화 할 때 사용한다. 2차버전에서는
	 	생성자 대신 사용되고 있으며 객체 초기화시 여러줄에
	 	걸쳐 코딩해야 하는 번거로움을 줄일 수 있따.
	 */
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller2 s, int money) {
		numOfApple += s.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수: "+numOfApple);
	}
	
}

//메인 클래스
public class FruitSalesMain2 {

	public static void main(String[] args) {
		
		/*
		 초기화 메소드에 의해 서로다른 초기값을 가지는 객체를 생성
		 할 수 있게 되었따.
		 아래에서는 판매단가와 재고가 다른 2개의 판매자를
		 생성하였따.
		 */

			FruitSeller2 seller1 = new FruitSeller2();
			seller1.initMembers(0, 100, 1000);
			
			FruitSeller2 seller2 = new FruitSeller2();
			seller2.initMembers(0, 80, 500);
			
			FruitBuyer2 buyer = new FruitBuyer2();
			buyer.initMembers(10000, 0);
			
			System.out.println("구매행위가 일어나기전의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
			
			buyer.buyApple(seller1, 5000);
			buyer.buyApple(seller2, 5000);
			
			System.out.println("구매행위가 일어난 후의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
			
		
	}

}
