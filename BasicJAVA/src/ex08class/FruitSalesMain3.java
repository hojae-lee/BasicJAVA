package ex08class;

//판매자 클래스
class FruitSeller4 {
	
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매수익(보유 금액)
	final int APPLE_PRICE; 
	
	/*
	 상수는 값의 변경이 불가능하고 단 한번만 초기화되기 때문에 일반적인
	 메소드에서는 초기화 할 수 없다.
	 단 생성자메소드에서는 초기화가 가능하다.
	 마음대로 호출할수 없고 단 한번만 호출된다는 특성이 같기 때문에 한번
	 이상 초기화 되지 않음이 보장되기 때문이다.
	 */
	
	public FruitSeller4(int myMoney ,int numOfApple, int APPLE_PRICE) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.APPLE_PRICE = APPLE_PRICE;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
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
class FruitBuyer3 {
	
	int myMoney;//보유금액
	int numOfApple;//보유한 사과의 갯수
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller4 s, int money) {
		numOfApple += s.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수: "+numOfApple);
	}
	
}

//메인 클래스
public class FruitSalesMain3 {

	public static void main(String[] args) {
		
		/*
		생성자를 통해서 객체 생성과 동시에 초기화되므로
		init초기화메소드를 호출할 필요가 없어져서 코드 한줄을 줄일 수
		있따.
		 */

			FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
//			seller1.initMembers(0, 100, 1000);
			
			FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
//			seller2.initMembers(0, 80, 500);
			
			FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
//			buyer.initMembers(10000, 0);
			
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
