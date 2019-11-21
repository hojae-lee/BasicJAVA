package ex02variable;

/*
 상수: 저장된 값이 절대 변하지 않는 메모리의 한종류
 선언방법 : final 자료형 변수명 = 초기값;
 딱 한 번만 초기화되며 중간에 값을 변경하면 에러발생됨.
 상수는 전체를 대문자로 선언하며 연결된 단어가 있을경우 언더바로 표현한다.
 상수는 주로 코드의 가독성을 높여주기 위해 활용된다.
 */

public class ConstantVar {

	public static void main(String[] args) {

		//상수선언과 동시에 초기화
		final double PI = 3.14;
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		System.out.println("PI(원주율)=" + PI);
		
		//상수는 한 번 초기화되면 값을 변경 할 수 없다.
//		PI = 3.141592;
		final String NICE_NAME;
		//상수가 초기화되지 않았기 때문에 에러 발생됨.
//		System.out.println("우리는" + NICE_NAME);
		NICE_NAME = "코스모51기";
		System.out.println("우리는 "+ NICE_NAME);
		
		
		/*
		 개발자가 가위는 1, 바위는 2 , 보는 3으로 결정했다고 가정....
		 */
		int computer, user;
		
		//1, 3은 개발자 보인만 알 수 있으므로 가독성 떨어짐.
		computer = 1;
		user = 3;
		System.out.println("\"컴퓨터\"가 이겼습니다.");
		
		
		/*
		 PAPER와 같은 단어는 누가보더라도 알 수 있으므로 가독성 높아짐. 즉 명시적인 코드
		 */
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
		
	}

}
