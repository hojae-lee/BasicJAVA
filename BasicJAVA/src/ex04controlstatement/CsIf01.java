package ex04controlstatement;

import java.io.IOException;

public class CsIf01 {

	/*
	 if문(조건문, 분기문)
	 	형식1]
	 		if(조건문){
	 			실행문장1;
	 			실행문장2;
	 		}
	 	- if문의 조건문은 반드시 비교식 혹은 논리식이어야한다.
	 	- 즉 결과값이 불리언타입 이어야 한다.
	 	- 실행할 문장이 하나 일 때는 중괄호 생략이 가능하다.
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num = 10;
		
//		아래 문장은 불리언이 아닌 조건식이므로 에러발생됨
//		if(num%2) {
//			System.out.println("잘못된 조건식입니다.");
//		}
//		if(num) {
//			System.out.println("이것도 잘못된 조건식 입니다.");
//		}
		
//		if문의 조건은 반드시 아래와 같이 불리언을반환해야한다.
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		if(num%2==0&&num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다%n", num);
		}
		
		//경우에 따라 무조건 실행되는 if문도 필요함.
		if(true) {
			System.out.println("무조건 실행되는 if문입니다.");
		}
		
		/*
		if(조건식); => 조건식이 참일때 실행할 문장이 없음을 의미하는 코드임. 아래{} 블럭은 조건에 상관없이
		무조건 실행되므로 작성시 주의해야 한다. 
		 */
		if(num%2 != 0); {
			System.out.printf("%d는 홀수 입니다.%n%n", num);
		}
		
		if(num%2 != 0) {
			System.out.printf("%d는 홀수 입니다.", num);
		}
		else {
			System.out.println(num + "은 짝수입니다.");
		}
		
		/*
		 조건 검사 후 실행할 무장이 하나인 경우네는 {}(중괄호) 생략이 가능하다. 조건이 여러개인 경우네는 의도치 않는 결과가 나올 수 있으므로 중괄호는 반드시 붙여주는 것이 안전하다.
		 */
		if(num%2 == 0)
			System.out.println("\n"+ num +"은 짝수이다");
			

		if(num%2 != 0) {
			System.out.println("num은 "+ num + "입니다");
			System.out.println(num+"은 홀수입니다.");

		}
		
		/*
		System.in.read();
		 	: 사용자에게 하나의 문자를 입력받을 때 사용하는 메소드로 입력한 문자를 아스키코드값으로 반환한다.
		 */
//		System.out.print("하나의 문자를 입력하세요: ");
//		int asciiCode = System.in.read();
//		System.out.println("사용자가 입력한 문자의 아스키코드값: "+ asciiCode);
//		System.out.println("사용자가 입력한 문자: "+ (char)asciiCode);
		
		/*
		 시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 작성하시오.
		 */
		System.out.print("문자 하나를 입력하세요: ");
		int ascii = System.in.read();
		
		/* 아스키코드를 알고 있을 때의 구현방법
		 if(ascii >=48 && ascii <=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		 저장될 때는 아스키코드값으로 저장대기 때문에 타입은 상관없다.
		 */
		
		boolean isNumber = (ascii >='0' && ascii <='9');
		if(isNumber) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
	}

}
