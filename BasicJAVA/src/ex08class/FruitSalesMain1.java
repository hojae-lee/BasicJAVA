package ex08class;

//판매자 클래스
class FruitSeller {
	
	int numOfApple = 100; // 판매자의 사과 보유 갯수
	int myMoney =0; // 판매수익(보유 금액)
	final int APPLE_PRICE = 1000; // 사과의 단가(상수로 표현)
	
	/*
	 클래스에서 상수로 선안하는 경우 선언과 동시에 초기화해야한다. 만약
	 선언과 초기화를 별도로 하게되면 에러가 발생하게된다.[규칙]
	 */
	
	public int saleApple(int money) {
		//1 금액을 받는다
		//2 금액에 해당하는 사과의 갯수를 구한다.
		int num = money / APPLE_PRICE;
		//3 사과의 갯수만큼 차감한다.
		numOfApple -= num;
		//4. 금액만큼 보유액이 증가한다.
		myMoney += money;
		//5. 구매자에게 판매한 사과의 갯수를 반환한다.
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: "+numOfApple);
		System.out.println("[판매자]판매수익: "+myMoney);
	}
	
}

//구매자 클래스
class FruitBuyer{
	
	int myMoney = 5000;//보유금액
	int numOfApple = 0;//보유한 사과의 갯수
	
	/*
	 사과를 구매하는 행위를 구현한 멤버메소드
	 1. 판매자에게 금액을 지불한다.
	 */
	
	public void buyApple(FruitSeller seller, int money) {
		//2. 판매자가 금액에 해당하는 사과를 반환한다. 반환한 갯수만큼보유한사과가증가한다.
		numOfApple += seller.saleApple(money);
		//3. 판매자에게 지불한 금액만큼 차감된다.
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수: "+numOfApple);
	}
	
}

//메인 클래스
public class FruitSalesMain1 {

	public static void main(String[] args) {

			FruitSeller seller = new FruitSeller();
			FruitBuyer buyer = new FruitBuyer();
			
			System.out.println("구매행위가 일어나기전의 상태");
			seller.showSaleResult();
			buyer.showBuyResult();
			
			/*
			 구매자가 판매자에게 5000원을 지불하고 사과를 구매한 행위를
			 코드로 표현함.
			 */
			buyer.buyApple(seller,5000);
			
			System.out.println("구매행위가 일어난 후의 상태");
			seller.showSaleResult();
			buyer.showBuyResult();
		
	}

}
