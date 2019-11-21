package ex01start;

/*
 JAVA프로그램은 클래스 단위로 구성되므로 반드시 하나이상의 클래스가 정의되어야 한다.
 */
public class SystemOutPrintln {
	/*
	 항상 프로그램의 출발점은 메인메소드로부터 시작한다.
	 자바런처를 통해 실행하면 자동으로 호출되어 동작하게 된다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 한 문장이 끝날때는 반드시 세미콜론(;)을 써줘야 한다.
		 한글에서 마침표와 같은 역할이라 생각하면 된다.
		 */
		
		System.out.println(7); // 정수로 인식하여 7출력
		System.out.println(3.14); // 실수로 인식하여 3.14출력
		
		//문자열과 숫자(정수 or 실수)를 연결
		System.out.println("3+5="+ 8);
		System.out.println(3.15 + "는 실수입니다.");
		
		//문자열과 문자열을 연결
		System.out.println("3+5" +" 의 연산결과는 8입니다");
		//숫자와 숫자로 인식하여 실제 덧셈연산의 결과를 출력
		System.out.println(3 + 5);
		
		int num=10;
		System.out.println("num 은"+num+" 입니다.");
		
	}

}