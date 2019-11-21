package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제1
		System.out.println("==while문을 이용한 구현==");
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		/*
		 연습문제] 위의 코드를 for문으로 변경해보시오.
		 */
		System.out.println("==for문을 이용한 구현==");
		
		for(int x=1; x<=5; x++) {
			for(int y =1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}