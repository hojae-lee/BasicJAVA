package quiz;

public class Plus {

	public static void main(String[] args) {

		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					int sum = i+j;
					System.out.println(i+"+"+j+"="+sum);
				}
			}
		}
		
	}

}
