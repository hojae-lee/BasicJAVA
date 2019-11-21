package ex15usebasicclass;
/*
 Wrapper클래스
 	: 기본자료형의 데이터를 인스턴스화 할때 사용하는 클래스
 	
 	-오토박싱 : 기본자료형이 자동으로 참조형으로 변경되는 것을 말함.
 		예] int => Integer
 	-오토언박싱 : 참조형이 기본자료형으로 자동으로 변경되는 것을 말함.
 		예] Integer => int
 	※오토박싱, 오토언박싱은 JDK1.5이상에서 적용된다.
 */
public class WrapperClass1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int result = num1+num2;
		System.out.println("result= "+result);
		
		Integer n10bj = new Integer(10);//Wrapper클래스를 통한
		Integer n20bj = new Integer(num2);//박싱처리
		int result2 = n10bj.intValue() + n20bj.intValue();/*
				Integer인스턴스를 언박싱처리해주는 intValue메소드
		*/
		System.out.println("result2= "+ result2);
		
		Integer result0bj = new Integer(result2);
		System.out.println("결과값을 바이트형 값으로 변경: "+ result0bj.byteValue());
		System.out.println("결과값을 이진수로 변경: "+ Integer.toBinaryString(result2));
		
		//JDK1.5 이후 버전에서의 코딩형태
		Integer num0bj1 =100;//오토박싱 처리됨
		Integer num0bj2 =200;
		int num3 = num0bj1;//토오언박싱 처리됨
		
		/*
		 Wrapper클래스를 사용하는 이점
		 	: Wrapper클래스에 정의된 많은 메소드를 사용할 수 있따.
		 	int형의 최대 최소값 혹은 진법 변환등의 메소드가 있다.
		 */
		System.out.println("int형의 최대값: "+ Integer.MAX_VALUE);
		System.out.println("int형의 최소값: "+ Integer.MIN_VALUE);
		System.out.println("10을 2진수로: "+ Integer.toBinaryString(10));
		System.out.println("10을 8진수로: "+ Integer.toOctalString(10));
		System.out.println("10을 16진수로: "+ Integer.toHexString(10));
		
		/*
		 자바의 모든 클래스는 Object라는 최상의 캘르스로 부터 상속을 받는다.
		 그러므로 아래 메소드를 사용 할 수 있다.
		 
		 toString() : 인스턴스 변수를 출력 시 참조값이 아니라 실제 저장된 값을
		 		문자열 형태로 반환해주는 메소드.
		 hasCode() : 객체를 구별하기 위해 참조값을 고유한 정수값으로 반환해주는
		 		메소드
		 */
		Integer num0bj = new Integer(99);
		System.out.println("num0bj= "+num0bj);
		System.out.println("num0bj.toString= "+num0bj.toString());
		System.out.println("num0bj.hashCode()= "+num0bj.hashCode());
		System.out.println(num0bj+1);//99+1 = 100
		System.out.println(num0bj.toString()+1);// "99" +1 => 991
		
	}

}
