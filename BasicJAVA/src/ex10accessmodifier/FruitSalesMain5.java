package ex10accessmodifier;

//판매자 클래스
class FruitSeller5 {
	
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매수익(보유 금액)
	final int APPLE_PRICE; 
	
	public FruitSeller5(int myMoney ,int numOfApple, int APPLE_PRICE) {
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
class FruitBuyer5 {
	
	int myMoney;//보유금액
	int numOfApple;//보유한 사과의 갯수
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller5 s, int money) {
		numOfApple += s.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수: "+numOfApple);
	}
	
}

//메인 클래스
public class FruitSalesMain5 {

	public static void main(String[] args) {
		
		//판매자1
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		//판매자2
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		//구매자
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의 관계가 전혀 맞지 않는
		논리적 오류가 발생되었다. 즉 코드로 구현한 규칙이 완전히 무너졌다.
		객체지향언어에서는 이런 논리적오류를 범하지 않기 위해  "정보은닉"이라는 개념을 제시하고 있따.
		 */
		
		seller1.myMoney +=1000; //판매자1에게 천원을 지불하고
		seller1.numOfApple -= 100; //사과 100개를 구매한다.
		
		seller2.myMoney +=500;// 판매자2에게 500원을 지불하고
		seller2.numOfApple -=90; // 사과 90개를 구매한다.
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
			
	}

}
