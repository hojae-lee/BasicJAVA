package ex02variable;

public class JunsuType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 규칙]
		 1. 큰 자료형과 작은 자료형의 연산결과는 항상 큰 자료형을 따른다.
		 즉, 실수 + 정수 = 실수
		 
		 2.동일자료형끼리의 연산결과는 동일자료형이 된다.
		 단, int보다 작은 자료형 (byte, short, char) 의 연산결과는 int형이 된다.
		 즉 byte+byte=int 가 된다는 것에 주의해야 한다.
		 */
		
		byte b1;
		b1 = 127;
		System.out.println("b1="+ b1);
		
		//b1 = 128;[에러발생] byte의 표현범위는 -128~127
		b1 = (byte)128;
		System.out.println("형변환후 b1="+ b1);
		/*
		 byte에 담을수 업는 128을 byte형으로 형변환 후 자료를 저장함. 단, 이때는
		 자료의 손실이 발생하여 -128이 출력됨.
		 
		 ※형변환(Type Casting) : 현재자료형을 다른자료형으로 변환하는 행위를 말함. 단, 작은 자료형을
		 큰 자료형에 대입하는 경우 자료의 손실이 발생할 수 있음.
		 */
		
		byte b2=20, b3=30;
		/*
		 byte와 byte의 연산의 결과는 int이므로 아래문장은 에러발생됨.
		 위에서 설명한 규칙2에 해당됨.
		 */
		//byte b4 = b2 + b3;
		int b5 = b2+ b3;
		System.out.println("byte형끼리 연산결과="+ b5);
		
		/*
		 규칙]
		 3. 정수형에서 int형보다 큰 자료형(int,long)끼리의 연산결과는 기본규칙을 따른다.
		 int+int = int
		 long+long = long
		 int+long = long -> 큰족을 따라감
		 */
		
		int num2=100, num3=200;
		long lng1=1000, lng2=2000;
		
		int num4 = num2 + num3;
		System.out.println("int끼리 연산 num4="+ num4);
		
		long lng3 = lng1 + lng2;
		System.out.println("long끼리 연산 lng3="+ lng3);
		
		long lng4 = num2 + lng1;
		System.out.println("int와 long의 연산 lng4="+ lng4);
		
		//long lng5 = 2200000000;[에러발생]out of range
		long lng5 = 2200000000L;/* 
			자바컴파일러는 정수를 기본적으로 int형으로 간주하기 때문에
			위와같은 경우에는 접미사(L or l)을 붙여서 인트형이 아닌 long형이라는 것을
		 	컴파일러에게 알려줘야 에러가 발생하지 않는다.
		*/
		
		System.out.println("lng5="+lng5);
		/*
		 long타입의 자료를 인트타입으로 형변환 했으므로
		 에러는 없어졌으나 자료의 손실이 발생됨.
		 마이너스 결과 출력됨.
		 */
		
		int num7 = (int)2200000000L;
		System.out.println("형변환 후 num7="+num7);
		
	}

}
