package ex09package;

/*
 FruitBuyer4 / FruitSeller4 클래스를 아래 패키지에 생성할 때는 반드시 public으로 선언해야 한다.
 */

import ex09package.kosmo.buyer.FruitBuyer4;
import ex09package.kosmo.seller.FruitSeller4;
//control +shift +o : import자동으로 찾아줌.
/*
 연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 구분하여 정상 실행되도록 변경하시오.
 FruitSeller4 클래스 -> kosmo.seller 패키지에 묶는다.
 FruitBuyer4 클래스 -> kosmo.buyer 패키지에 묶는다.
 
 두 클래스를 적당히 import하여 정상동작 할 수 있도록 FruitSalesMain4클래스를 구성한다.
 
 */

public class FruitSalesMain4 {

	public static void main(String[] args) {
		
			FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
			
			FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
			
			FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
			
			System.out.println("구매행위가 일어나기전의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
			
			System.out.println("\n==================================\n");
			
			buyer.buyApple(seller1, 5000);
			buyer.buyApple(seller2, 5000);
			
			System.out.println("구매행위가 일어난 후의 상태");
			seller1.showSaleResult();
			seller2.showSaleResult();
			buyer.showBuyResult();
			
		
	}

}
