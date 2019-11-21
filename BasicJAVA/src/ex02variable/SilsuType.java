package ex02variable;

public class SilsuType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 규칙]
		 1.실수 자료형에서 기본은 double형이다.
		 2. 정수형보다는 실수형이 더 큰 자료형이다. (0과 1 사이에 무수한 실수가 존재하기때문)
		 */

		long ln1 =100;
		float f1 = 200;
		
		/*
		 - long과 float의 연산결과는 float형이다. 별도의 형변환없이 대입이 가능하다.
		 */
		
		float f2 = ln1 + f1;
		System.out.println("long과 float 연산결과 f2 = "+f2);
		
		/*
		 *float와 long의 연산결과를 long으로 받고 싶다면
		 1. float를 long으로 변환 후 연산하거나
		 2. 계산결과 전체를 long으로 변환한다.
		 */
		
		long ln2 = ln1 + (long)f1;
		System.out.println("형 변환 후 연산결과 ln2 = "+ln2);
		long ln3 = (long)(ln1 + f1);
		System.out.println("계산 후 형 변환결과 ln3 = "+ ln3);
		
		/*
		 -실수형에서 기본형은 double이다.
		 -소수점이 붙은 데이터는 무조건 double형으로 인식한다.
		 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		 - 소수점이 있는 데이터를 컴파일러에게 float로 인식하게 하려면 접미사(F, f)를 사용한다.
		 - 형 변환은 권장하지 않는다.
		 */
		
		float f3 = 100;
//		float f4 = 3.14; [에러발생] 3.14 자체를 double로 인식
		
		float f4 = (float)3.14;//형 변환 후 대입(권장사항아님)
		System.out.println("f4="+f4);
		
		float f5 = 3.14f;//자바에서는 접미사 사용을 권장함.
		System.out.println("f5="+ f5);
		
	}

}