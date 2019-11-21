package ex05method;

import java.util.Scanner;

public class MethodType04_1 {

	/*
	 [메소드형식4]
	 	매개변수도 있고 반환타입도 있는 메소드.
	 	4가지 형식 중 가장 활용빈도가 높다
	 */
	
	/*
	 시나리오] 인원수를 매개변수로 전ㄴ달받아 인원수 만큼 나이를 입력받아 그 나이의 합을 반환하는
	 메소드를 작성하시오.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumOfAge = getTotalAge(4);
		System.out.println("입력받은 나이의 합은? "+ sumOfAge);
		
		
	}//end of main

	static int getTotalAge(int personCnt) {
		
		Scanner sc= new Scanner(System.in);
		int sumAge = 0;
		
		for(int i= 1; i<=personCnt; i++) {
			System.out.print(i+"번째 사람의 나이: ");
			int age = sc.nextInt();
			sumAge += age;	
		}
		
		return sumAge;
		
	}//end of getTotalAge
	
}//end of class
