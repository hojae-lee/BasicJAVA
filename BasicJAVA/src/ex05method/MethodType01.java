package ex05method;

/*
 Method(메소드) : 객체지향 프로그램에서 행동 또는 동작을 의미한다.
 	즉 어떤일을 처리하는 하나의 모듈(부속품)이라 정의 할 수 있다.
 	- 메소드는 반드시 class안에 정의해야 한다.
 	- 메소드안에 다른 메소드를 정의할 수 없다.
 	- 정의할 때 반드시 반환타입이 있어야 한다. 만약 반환할 값이 없다면 void로 정의해야 한다.
 	- 이름의 규칙은 변수명과 같다 ( 소문자로 시작하는 변형된 camel case) (Ex: simpleFunc, addCalculate 등)
 */

public class MethodType01 {

	/*
	 [메소드형식1] 매개변수도 없고 반환값도 없는 경우
	 	: 해당 형식은 주로 출력을 담당하는 경우 사용된다.
	 	반환타입은 반드시 void로 명시해야 한다.
	 */
	
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세영==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("=====================");
	}
	//동일한 클래스내에서 메소드명의 중복은 불가능하다.
	/*
	 메소드 오버로딩
	 	메소드명은동일하나 매개변수의 갯수 혹은 타입을 달리하여 중복을 허용하는 문법
	 	즉 아래와 같이 완전히 똑같은 형태의 정의는 불가능하다.
	 	
	noParamNoReturn(int a) << 이런식의 형태로 쓰면 가능. 메소드 오버로딩임.
	static void noParamNoReturn() {
		System.out.println("중복된 함수명은 허용될까요?");
	}
	*/
	
	static void noParamNoReturn2() {
		//함수의 몸체가 없는 경우도 있음.
	}
	
	static void noParamNoReturn3() {
		int returnValue = 99;
		System.out.println("[Return문 이전]");
		
//		return;
		/*
		 위와 같이 함수 중간에 return을 쓰게 되면 함수의 종료(소멸)을 의미하므로 그 아래 문장은 절대 실행될 수 없는 코드가 된다.
		 이 경우 Unreachable Code라는 에러를 발생시키므로 주의해야한다.
		 
		 단 아래의 if문은 조건에 따라 결과가 달라질 수 있으므로 이런 경우네는 허용된다.
		 */
		
		if(returnValue%2==0) {
			System.out.println(returnValue+"는 짝수");
			return;
		}
		System.out.println(returnValue+"는 홀수");
		System.out.println("[retunr문 이후]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
