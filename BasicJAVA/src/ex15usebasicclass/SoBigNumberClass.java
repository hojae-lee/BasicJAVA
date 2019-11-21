package ex15usebasicclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SoBigNumberClass {

	public static void main(String[] args) {

		System.out.println("Long형의 최대값: "+Long.MAX_VALUE);
		System.out.println("Long형의 최소값: "+Long.MIN_VALUE);
		/*
		 BIgInteger 클래스
		 	:int형이나 long형으로 표현할수 없는 범위의 큰수를 연산하고자 할 떄
		 	사용한다. 
		 	※ 숫자를 인자로 전달할때는 반드시 string형태로 전달해야한다.
		 */
		
		BigInteger bigValue1 = new BigInteger("1000000000000000000000");
		BigInteger bigvalue2 = new BigInteger("-999999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigvalue2);
		BigInteger subResult = bigValue1.subtract(bigvalue2);
		BigInteger mulResult = bigValue1.multiply(bigvalue2);
		BigInteger divResult = bigValue1.divide(bigvalue2);
		BigInteger remResult = bigValue1.remainder(bigvalue2);
		
		System.out.println("큰 수의 덧셈결과: "+ addResult);
		System.out.println("큰 수의 뺼셈결과: "+ subResult);
		System.out.println("큰 수의 곱셈결과: "+ mulResult);
		System.out.println("큰 수의 나눗셈결과: "+ divResult);
		System.out.println("큰 수의 나머지결과: "+ remResult);
		
		/*
		 BigDecimal클래스
		 	: 실수의 오차없는 표현이나 연산을 위해 사용되는 클래스
		 */
		double dbl1 = 1.6;
		double dbl2 = 0.1;
		
		System.out.println("두 실수의 덧셈결과(오차있음): "+ (dbl1+dbl2));
		System.out.println("두 실수의 곱셈결과(오차있음): "+ (dbl1*dbl2));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.1");
		
		/*
		 위 두 클래스의 사칙연산에 사용되는 메소드는 동일하다.
		 */
		System.out.println("두 실수의 덧셈결과:"+bigDec1.add(bigDec2));
		System.out.println("두 실수의 뺼셈결과:"+bigDec1.subtract(bigDec2));
		System.out.println("두 실수의 곱셈결과:"+bigDec1.multiply(bigDec2));
		System.out.println("두 실수의 나눗셈결과:"+bigDec1.divide(bigDec2));
		System.out.println("두 실수의 나머지결과:"+bigDec1.remainder(bigDec2));
		
	}

}
