package ex05method;

public class Overloading {

	/*
	 메소드 오버로딩
	 : 동일한 이름의 메소드를 두 개 이상 정의하는것을 말한다.
	 - 매개변수의 갯수가 다르거나, 자료형이 다를 때 성립한다.
	 - 매개변수의 갯수와 자료형이 동일하고, 반환타입만 다른 경우는
	 	성립하지 않는다.(주의)
	 -컴파일러는 메소드 호출시 전달하는 파라미터를 통해 호출할 구분한다.
	 */
	
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호: "+juminNum);
		System.out.println("군번: "+ milNum);
	}
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호: "+juminNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person(123456, 7890123);
		System.out.println("=====================");
		person(987654);
		
		
	}

}
