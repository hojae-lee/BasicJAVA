package ex05method;

import java.util.Scanner;

public class MethodType04_2 {

	/*
	 시나리오] 여러개의 숫자를 입력받은 후 최대값을 구하는 메소드를 정의하시오.
	 단 숫자의 갯수는 매개변수로 전달받고 숫자의 갯수만큼 Scanner클래스를 통해 입력받는다.
	 숫자의 갯수만큼 Scanner클래스를 통해 입력받는다.
	 입력받은 숫자중 최대값을 찾아서 반환하도록 정의한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수값입력 ㄱ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		int maxValue1 = returnMaxNumber(k);
		System.out.println("최대값1: "+ maxValue1);
		//숫자 4개 중에 최대값 찾기
		
//		int maxValue2 = returnMaxNumber(8);
//		System.out.println("최대값2: "+maxValue2);
//		//숫자 8개 중에 최대값 찾기
		
	}
	
	static int returnMaxNumber(int numberCnt) {
		
		Scanner sc = new Scanner(System.in);
		
		int maxVal = 0;
		
		for(int i=1; i<=numberCnt; i++) {
			System.out.print("정수를 입력하세요: ");
			int inputnum = sc.nextInt();
			
			//첫번째 입력받는 값을 기준값으로 설정한다.
			
			if(i==1) {
				maxVal = inputnum;
			}
			else {
				if(maxVal<inputnum) {
					maxVal = inputnum;
				}
			}
		}
		
		return maxVal;
		
	}// end of returnMaxNumber

}// end of class
