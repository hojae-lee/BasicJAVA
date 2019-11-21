package quiz;

import java.util.Scanner;

public class SnailArray {
	
	public static void RotateSnail() {
		
		System.out.println("배열의 크기를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int[][] snailarray = new int[input][input];
		int k = 1;
		int c = 0; //행
		int r = -1; //열
		int sw = 1; //형변환 열변환 할 변수.!!
		
		while(true) {
			//행고정 열변화.
			for(int i=0; i<input; i++) {
				r = r+sw;
				snailarray[c][r] = k++;
			}
			
			input = input-1;
			if(input<=0) {
				break;
			}
			
			//행변화 열고정.
			for (int i=0; i<input; i++) {
				c = c+sw;
				snailarray[c][r] = k++;
			}
			sw = sw * (-1);
			
		}
		
		for(int col=0; col<snailarray.length; col++) {
			for(int row=0; row<snailarray.length; row++) {
				System.out.printf("%4d", snailarray[col][row]);
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		RotateSnail();
	}

}
