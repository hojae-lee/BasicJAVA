package ex05method;

import java.util.Scanner;

public class MethodType03_2 {

	/*
	 연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
	 무조건 첫번째 입력받는수가 작아야함.
	 입력예]
	 	첫번째 숫자: 3
	 	두번재 숫자: 3
	 	inputGugudan(int sNum, int eNum)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int sNum = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int eNum = sc.nextInt();
		
		inputGugudan(sNum, eNum);
		
	}
	
	static void inputGugudan(int sNum, int eNum) {
		
		if(sNum>=eNum) {
		System.out.println("첫번째 숫자가 더 큽니다. 다시 입력해주세요");	
		}
		else {
		
		for(int i=sNum; i<=eNum; i++) {
			System.out.print("["+i+"]"+"단"+"\t");
		}
		System.out.println();
		
		for(int i = sNum-1; i<=eNum; i++) {
			for(int j = sNum; j<=eNum; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		}
	}

}
