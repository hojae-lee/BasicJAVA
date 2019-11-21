package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

		int su = 1 ;
		int susu =2;
		System.out.println("\t\twhile문으로 만든 구구단");
		while(susu<=9){
			System.out.print("["+susu+"]"+"단"+"\t");
			susu++;
		}
		
		System.out.println();
		while(su <=9) {
			int dan =2;
			
			while(dan<=9) {
				System.out.print(dan+"*"+su+"="+dan*su+"\t");
				dan++;
			}
			System.out.println();
			su ++;
		}
		
		
		System.out.println("\n==============================================================\n");
		
		
		
		System.out.println("\t\tfor문으로 만든 구구단");
		for(int i=2; i<=9; i++) {
			System.out.print("["+i+"]"+"단"+"\t");
		}
		System.out.println();
		
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
