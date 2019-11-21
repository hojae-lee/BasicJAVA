package quiz;

import java.util.Random;

public class Ewwwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int nansu[] = new int[10];
		
		for(int i=0; i<nansu.length; i++) {
			nansu[i] = random.nextInt(99)+1;
			for(int j=0; i<i; j++) {
				if(nansu[j]==nansu[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<nansu.length; i++) {
			System.out.print(nansu[i]+" ");
		}
	}

}
