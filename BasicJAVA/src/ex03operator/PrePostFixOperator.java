package ex03operator;

public class PrePostFixOperator {

	/*
	 증가/감소 연산자 : +1 혹은 -1 한 것과 같은 결과를 반환한다.
	 
	 prefix(전위증가 혹은 감소)
	 	연산자가 변수 앞에 있는 경우로
	 	1. 변수의 값이 먼저 증가한다.
	 	2. 증가한 값이 좌측으로 할당된다.
	 postfix(후위증가 혹은 감소)
	 	연산자가 변수 뒤에 있는 경우로
	 	1. 변수의 값이 좌측으로 할당된다.
	 	2. 할당된 이 후 변수의 값이 증가한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;
		
		/*
		 	1. num1의 값이 1증가됨.
		 	2. 1증가된 num1의 값이 num2에 대입됨.
		 	결과 : num1 = 8, num2 = 8
		 */
		
		num3 = --num1;
		
		/*
		 	1. num1의 값이 1감소됨
		 	2. 1감소한 num1의 값이 num3에 대입됨
		 	결과 : num1 = 7, num3 = 7
		 	
		 	최종결과 : 7, 8, 7
		 */
		
		System.out.println("전위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d%n%n",num1,num2,num3);
		
		////////////////////////////////////////////////////////////////////
		
		num1 = 7;
		
		num2 = num1++;
		/*
		 	1. num1의 값7이 num2에 먼저 할당
		 	2. num1의 값이 1증가됨
		 */
		num3 = num1--;
		/*
		 	1. num1의 값8이 num3에 할당
		 	2. num1의 값이 1감소됨
		 	
		 	최종결과 : 7, 7, 8
		 */
		
		System.out.println("전위증가/감소시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d",num1,num2,num3);
		
	}

}
