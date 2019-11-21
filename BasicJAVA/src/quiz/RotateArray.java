package quiz;

import java.util.Scanner;

public class RotateArray {
	
	public static void Rotatearea() {
		
		System.out.println("원하는 배열크기 입력");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] array = new int[input][input];
		int[][] arraytemp = new int[input][input];
		int k = 1;
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				array[i][j] = k;
				k++;
				System.out.printf("%4d",array[i][j]);
			}
			System.out.println();
		}
		
		while(true) {
			
			System.out.println();
			System.out.println("=====================================================");
			System.out.println();
			
			System.out.println("회전시키겠습니까? 1을 입력해주세요 다른거 입력시 종료");
			int inputNum = sc.nextInt();
			if(inputNum == 1) {
				System.out.println("\n=============90도 회전==========================\n");
				for(int i=0; i<input; i++) {
					for(int j=0; j<input; j++) {
						arraytemp[i][j] = array[input-1-j][i];
						System.out.printf("%4d",arraytemp[i][j]);
					}
					System.out.println();
				}
				
				for(int i=0; i<input; i++) {
					for(int j=0; j<input; j++) {
						array[i][j] = arraytemp[i][j];
					}
				}
				
			}
			else {
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {

		Rotatearea();
		
	}

}
