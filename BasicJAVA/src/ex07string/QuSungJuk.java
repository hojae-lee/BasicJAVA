package ex07string;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {

		System.out.println("학생 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int stu = sc.nextInt();
		int [][] junsu = new int[stu][3];
		int[] sum = new int[stu];
		
		for(int i=0; i<stu; i++) {
			System.out.println("국,영,수 점수 입력");
			for(int j=0; j<3; j++) {
				junsu[i][j] = sc.nextInt();
				sum[i] += junsu[i][j]; 
			}
		}
		
		for(int i = 0; i < stu; i++) {
			for(int j =0; j<3; j++) {
			}
			System.out.println();
			
			System.out.println("합 "+sum[i]);
			System.out.println("평균 "+ sum[i]/3.0);
			
		}
		
	}

}
