package ex05method;

import java.util.Scanner;

public class MethodBasic {

	//메소드정의 : 매개변수0, 반환값0 형태로 정의
	
	public static int simplefunc(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇인가요??");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		namePrint(name);
	}
	
	/*
	 메소드 정의 : 매개변수x, 반환값x 형태로 정의. 단 반환값이 없는 경우에는 void라고 명시해야 한다.
	 */
	public static void namePrint(String n) {
		System.out.println("제 이름은 "+n+" 입니다.");
	}
	
	/*
	 규칙] JAVA에서 main메소드는 무조건 public static void로 선언하기로 약속되어있다. 그리고 static으로 선언된
	 메소드에서 다른 메소드를 호출하기 위해서는 호출되는 메소드도 반드시 static으로 선언되어야 한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 메소드를 호출할 때는 함수의 원형을 그대로 써주면 된다.
		 매개변수가 있다면 갯수만큼 포함시켜준다.
		 */
		
		/*
		 규칙] 메소드 호출 후 반환값은 항상 호출한 위로 돌려준다.
		  	반환되는 순간 해당 메소드는 메모리에서 소멸된다.
		 */

		int result = simplefunc(1, 2);
		System.out.println("1과 2를 전달한 결과: "+ result);
		System.out.println("10과 20를 전달한 결과: "+ simplefunc(10, 20));
		
		menuPrint();
		
		
	}

}
