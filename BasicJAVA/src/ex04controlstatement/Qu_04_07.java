package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제 2
		
				int num = 1;
				int total = 0;
				
				while(num<=100) {
					System.out.print(num+"+");
					
					if((num%3==0||num%7==0)&&num%21!=0) {
							total += num;
					}
					num++;
				}
				System.out.println();
				System.out.println("1~100사이 : "+ total);
				
				System.out.println("\n==============================================\n");
				
	}

}
