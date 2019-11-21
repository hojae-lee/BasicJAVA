package ex05method;

import java.util.Scanner;

/*
[메소드형식3]
	매개변수는 있으나 반환값은 없는 경우.
	메소드 실행을 위해 값을 전달받은 후 여산의 결과를 콘솔에 즉시 출력하는 형태의 프로그램에 주로 사용됨.
 */

public class MethodType03_1 {

	/*
	 시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는 수를 모두 더하여 출력하는 프로그램을 작성하시오.
	 	출력결과]
	 		시작값 : 5
	 		종료값 : 9
	 		결과 : 5+6+7+8+9=
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작값: ");
		int s = sc.nextInt();
		System.out.print("종료값: ");
		int e = sc.nextInt();
		yesParamNoReturn(s,e);
		
	}
	
	static void yesParamNoReturn(int s, int e) {
		
		int sum = 0;
		for(int i = s; i<=e; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은 %d",s,e,sum);
	}

}
