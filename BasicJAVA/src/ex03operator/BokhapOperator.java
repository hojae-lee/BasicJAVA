package ex03operator;

public class BokhapOperator {

	/*
	 복합대입연산자 : 산술연산자와 대입연산자를 붙여놓은 형태로 좌우측의 값을 연산하여 좌측의 변수에 대입한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double e = 3.1;
		e += 2.1;	// 3.1 + 2.1 = 5.2
		e *= 2;		// 5.2 * 2 = 10.4
		e = e + e;	// 10.4 + 10.4 = 20.8
		
		System.out.println("e의 결과값: "+ e);
		
		/*
		 참고] 복합대입연산자의 경우 문법의 구조상 자동형변환이 일어나지 않고 기존의 자료형을 유지한다.
		 */
		int n = 5;
//		n = n * 2.7;[에러발생] int형으로 casting해야한다.
		n *= 2.7; // [정상] 기존의 자료형을 유지한다.
		System.out.println("n의 결과값: "+n);
		
		
	}

}