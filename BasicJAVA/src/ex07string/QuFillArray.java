package ex07string;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
 		
		System.out.println("총 정수 10개를 입력하시오");
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for(int j=0; j<array.length; j++) {
			if(array[j]%2==1) {
				System.out.print(array[j]+" ");
			}
		}
		
		for(int k=9; k>0; k--) {
			if(array[k]%2==0) {
				System.out.print(array[k]+" ");
			}
		}
		
	}

}
