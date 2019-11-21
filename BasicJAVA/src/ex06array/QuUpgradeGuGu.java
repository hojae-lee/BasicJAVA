package ex06array;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int dan = 2; dan <= 9; dan++) {

			for (int i = 1; i <= 9; i++) {
				
				if (i == 1) {
					System.out.println(dan + " X " + i + " = " + dan * i);
				} 
				
				else {
					
					int result = dan;
					System.out.printf("%d", dan);
					
					for (int j = 2; j <=i ; j++) {
						
						result *= dan;
						System.out.printf(" X %d", dan);
						
					}
					System.out.printf(" = %d", result);
					System.out.println();
				}

			}
		
		}
	
	}
}
