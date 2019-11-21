package ex10accessmodifier;

//판매자 클래스
class FruitSeller6 {
	
	private int numOfApple; // 판매자의 사과 보유 갯수
	private int myMoney; // 판매수익(보유 금액)
	private final int APPLE_PRICE; 
	
	public FruitSeller6(int myMoney ,int numOfApple, int APPLE_PRICE) {
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
class FruitBuyer6 {
	
	private int myMoney;//보유금액
	private int numOfApple;//보유한 사과의 갯수
	
	public FruitBuyer6(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
		
	}
	
	public void buyApple(FruitSeller6 s, int money) {
		numOfApple += s.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+myMoney);
		System.out.println("[구매자]사과갯수: "+numOfApple);
	}
	
}

//메인 클래스
public class FruitSalesMain6 {

	public static void main(String[] args) {
		
		//판매자1
		FruitSeller6 seller1 = new FruitSeller6(0, 100, 1000);
		//판매자2
		FruitSeller6 seller2 = new FruitSeller6(0, 80, 500);
		//구매자
		FruitBuyer6 buyer = new FruitBuyer6(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 멤버변수가 private으로 선언되었으므로 외부 클래스에서는 접근이 불가능해진다. 따라서
		 아래 5번에서의 코드는 에러가 발생된다.
		 */
		
//		seller1.myMoney +=1000; //판매자1에게 천원을 지불하고
//		seller1.numOfApple -= 100; //사과 100개를 구매한다.
//		
//		seller2.myMoney +=500;// 판매자2에게 500원을 지불하고
//		seller2.numOfApple -=90; // 사과 90개를 구매한다.
		
		/*
		 판매자 1, 2 에게 각각의 금액을 지불하고 금액에 해당하는 사과를 정상적으로 구매함.
		 
		 정보은닉을 통해 판매의 규칙이 지켜지게 되었음.
		 */
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 3000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
			
	}

}
