package ex04controlstatement;

import java.io.IOException;

public class CsIf02 {
	
	/*
	 if문(조건문, 분기문)
	 	형식2]
	 		if(조건문){
	 		조건문이 참 일 때 실행문장;
	 		}
	 		else{
	 			조건문이 거짓일 때 실행문장;
	 		}
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num = 101;
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("------------------");
		/*
		 삼항연산자(조건연산자)
		 	if~else 문과 동일하고 짧은 코드로 표한하고 싶을 때 주로 사용한다.
		 	형식]
		 		변수 = 조건식 ? 참일때 값 : 거짓일때 값;
		 */
		String numbereResult = (num%2 == 0) ? "짝수임":"홀수임";
		System.out.println("숫자 "+num+ "은 " + numbereResult);
		
		System.out.println("------------------");
		
		/*
		 시나리오] 숫자를 짝/홀수인지 먼저 판단한 후 100 이상인지를
		 판단하는 프로그램을 작성하시오.
		 */
		
		int num2 = 120;
		
		if(num2%2 == 0) {
			if(num2 >= 100) {
				System.out.println("짝수이면서 100이상 입니다.");
			}
			else {
				System.out.println("짝수이면서 100미만 입니다.");
			}
		}
		else {
			if(num2 >= 100) {
				System.out.println("홀수이면서 100이상 입니다.");
			}
			else {
				System.out.println("홀수이면서 100미만 입니다.");
			}
		}
		
		
		
	}

}
