package ex02variable;

public class CharBooleanType {

	/*
	 아스키코드 : 1byte로 표현할 수 있는 문자 (영문, 숫자)를
	 십진수코드로 정의한 것을 말한다.
	 Ex) A의 아스키코드 : 65(이진수:1000001)
	 	 a의 아스키코드 : 97
	 	 
	 유니코드: 1byte로 표현이 안되는 문자(한글,한자 등)는 2byte가 필요하고
	 이를 16진수로 정의한 값을 말한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 char형 : 하나의 문자를 저장 할 수 있는 자료형(2byte) 값을 저장할 때 하나의 문자를 '(Single Quotation)로 감싼다.
		 "(Double Quotation)으로 감싸면 문자열로 인식하므로 이 때는 String타입으로 선언해야한다.
		 */
		
		char ch1 ='가';
		//char chStr = '가나다라';
		System.out.println("ch1="+ ch1);
		
		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1;
		System.out.println("num2="+ num2);
		
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=>"+ ch3); // 결과값 C
		System.out.println("ch3(아스키코드출력)=>"+ (int)ch3); //결과값 67
		
		char ch4 = '1'; //문자1이므로 아스키코드 49로 저장됨.
		char ch4_1 = 49;
		System.out.println("ch4="+ch4+", ch4_1:"+ ch4_1);
		/*
		 boolean형 : true 혹은 false 두가지의 값만 가질 수 있는 데이터형으로 산술연산(+,-,*,/)이나
		 비교연산(>,<,<=,>=) 에서는 사용이 불가능하다. 단, 논리연산은 가능하다.
		 */
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1="+ bn1 + ", bn2="+ bn2);
		
		/*
		 && : 논리 AND 둘 다 참일 때 참이다.
		 || : 논리 OR 둘 중 하나만 참이여도 참이다. 둘 다 거짓일 때만 거짓이다.
		 */
		
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3="+bn3);
		
		bn3 = '가' > 30000;
		System.out.println("bn3="+bn3);
		
	}

}