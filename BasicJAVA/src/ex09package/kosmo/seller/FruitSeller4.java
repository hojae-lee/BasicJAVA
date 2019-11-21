package ex09package.kosmo.seller;

public class FruitSeller4 {

	int numOfApple;
	int myMoney; 
	final int APPLE_PRICE; 
	
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
