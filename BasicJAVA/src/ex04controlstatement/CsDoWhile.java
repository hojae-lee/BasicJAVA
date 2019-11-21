package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class CsDoWhile {
	
	/*
	 do ~ while문
	 	: 반드시 한 번은 실행해야 할 경우 사용하는 반복문
	 	즉, 조건의 검사없이 무조건 한 번은 실행된다.
	 	형식]
	 		do{
	 			실행문장;
	 			증감식;
	 		}while(조건식); <- ;로 마무리해야한다.
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//do~while문으로 구현한 1~10까지 합
		
		int i = 1;
		int sum = 0;
		
		do {
			
			System.out.println("i= "+ i);
			sum += i;
			i++;
			
		}while(i<=10);
		System.out.println("sum= "+sum);
		
		System.out.println("=====================================");
		
		/*
		 연습문제] 1~1000까지의 정수 중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
		 단, do~while문을 사용해야 한다.
		 */
		
		int j = 1;
		int total = 0;
		
		do {
			if(j%4==0||j%7==0) {
				total +=j;
			}
			j++;
		}while(j<=1000);
		System.out.println("4의 배수 이거나 7의 배수인 수의 합: "+ total);
	
		System.out.println("\n=====================================");
		System.out.println("=====================================");
		System.out.println("=====================================\n");
		
		int dan = 2;
		int num = 1;
		
		do {
			System.out.println(dan+"*"+num+"= "+dan*num+"\t");
			
			if(num == 9) {
				System.out.println();
				num = 0;
				dan++;
			}	
			num++;

		}while(dan<=9);
		System.out.println("do-while 구구단 종료");
		
	
		System.out.println("\n=====================================");
		System.out.println("=====================================");
		System.out.println("=====================================\n");
		
		
		
		/*
		 시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 AF학점을 판단하여 출력하는
		 프로그램을 작성하시오. 단, 사용자가 X를 입력하면 프로그램이 종료되어야 하며 do while문으로 구현해야한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		double avg = 0;
//		
//		int exitCode;
//		
//		do {
//			
//			System.out.println("국어,영어,수학 점수 순으로 입력하시오.");
//			int kor = sc.nextInt();
//			int eng = sc.nextInt();
//			int math = sc.nextInt();
//			
//			avg = (kor+eng+math)/3;
//			
//			if(avg>=90) {
//				System.out.println("A학점");
//			}
//			else if(avg>=80) {
//				System.out.println("B학점");
//			}
//			else if(avg>=70) {
//				System.out.println("C학점");
//			}
//			else if(avg>=60) {
//				System.out.println("D학점");
//			}
//			else {
//				System.out.println("F학점");
//			}
//			
//			System.out.println("종료하려면 X(x)를 입력하세요.");
//			
//			exitCode = System.in.read();
//		
//		}while(!(exitCode=='X'||exitCode=='x'));
		
		int kor, eng, math, avg;
		
		int exitCode;
		
		do {
			
			System.out.print("국어점수 입력하시오.");
			kor = sc.nextInt();
			System.out.print("영어점수 입력하시오.");
			eng = sc.nextInt();
			System.out.print("수학점수 입력하시오.");
			math = sc.nextInt();
			
			avg = (kor+eng+math)/(3*10);
			
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
			}
			
			System.out.println("종료하려면 X(x)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요");
			
			exitCode = System.in.read();
		
		}while(!(exitCode=='X'||exitCode=='x'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

