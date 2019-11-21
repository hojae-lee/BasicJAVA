package quiz;

public class Quest {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(((2*i)+(4*j)) ==12) {
					System.out.println("x="+i+","+"y="+j);
				}
			}
		}
		
	}

	
}
