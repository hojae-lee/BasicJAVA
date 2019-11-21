package ex02variable;

public class StringType {

	public static void main(String[] args) {

		/*
		 String 타입 : 참조형 변수로써 기본자료형이 아님.
		 	문자열을 저장 할 수 있는 데이터 타입(클래스)
		 	자바에서는 문자열을 표현할때 "(더블쿼테이션)으로 감싸면 되고, 연결할 때 +를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
		 참조형과 기본자료형 사에서는 형변환이 불가능하다. 서로 사용하는 메모리 공간이 다르기 때문이다.
		 기본자료형 -> 스택(stack)영역 사용
		 참조형(클래스) - > 힙(heap)영역 사용
		 */
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		/*
		 문자열 + 정수 => 문자열
		 문자열에 정수가 연결된 형태로 출력된다.
		 */
		String strNumber = "100";
		System.out.println(strNumber +number);
		
		/*
		 String은 클래스이므로 new 키워드를 이용해서 인스턴스를 생성한 후 문자열을 참조한다. 
		 */
		
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic + " "+ plusString);
		
		/*
		 문자열 +숫자 => 문자열의 형태로 출력된다.
		 따라서 산술연산의 결과를 출력하고 싶다면 괄호를 사용하거나, 미리 계산된 결과의 변수를 사용한다.
		 */
		
		int kor = 100, eng = 99 , math = 98;
		System.out.println("총점: "+kor+eng+math);
		System.out.println("총점: "+(kor+eng+math));
		
		
	}

}
