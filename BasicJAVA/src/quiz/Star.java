package quiz;

public class Star {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2-i; j++) {
				System.out.print(" ");
			}

			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i>=0; i--) {
			for(int j=0; j<2-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
