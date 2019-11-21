package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class CsSwitch{

	/*
	 switch문 : if문처럼 조건에 따라 분기하는 제어문
	 	형식]
	 		switch(정수식 or 산술식){
	 		case 값1:
	 			실행문1; break;
	 		case 값2:
	 			실행문2; break;
	 		default:
	 		위 모든 조건에 위배될 때 실행되는 문장 = else
	 		}
	 		switch문 내부에서 break문을 만나게 되면 실행이 중지되고 밖으로 빠져나오게 된다.
	 */
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		/*
		 Scanner클래스 : JDK5.0부터 추가된 클래스로 키보드를 통해 사용자로부터 값을 입력받을 때 사용한다.
		 nextLine() : 문자열을 입력받음.
		 nextInt() : 정수를 입력받음.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int iNum = scan.nextInt();
		System.out.println("입력한 숫자는: "+ iNum);
		
//		scan.nextLine();
//		System.out.print("문자열을 입력하시오: ");
//		String iStr = scan.nextLine();
//		System.out.println("입력한 숫자는: "+ iStr);
		
		int remain = iNum % 3;
		/*
		 만약 switch문에 break문을 쓰지 않으면 그 아래에 있는 문장들이 실행되므로 주의해야 한다.
		 */
		switch(remain) {
		case 0:
			System.out.println("나머지는 0");
			break;
		case 1:
			System.out.println("나머지는 1");
			break;
		default:
			System.out.println("나머지는 2");
			break;
		}
		
		/*
		 switch문을 사용할 때 주의할점
		 1. long타입은 사용불가
		 	byte/short/int/char/String 형만 사용가능
		 2/ 비교식이나 논리식 사용불가
		 */
		/*
		 * long타입 오류
		long ln = 100;
		switch(ln) {
		case 100:
			System.out.println("long타입 사용??");
		default:
			System.out.println("안되는군!");
		}
		*/
		
		/*
		 비교식이나 논리식은 사용불가하므로 에러발생됨.
		 
		switch(iNum%3==0) {
		System.out.println("논리식도 안되는군!");
		}
		*/
		
		String title = "자바";
		switch(title){
			case "자바": System.out.println("자바 좋아");
			break;
			case "JAVA": System.out.println("JAVA Gooooood");
			break;
		}
		
		/*
		 여러 case를 동시에 처리 할 때는 break문 없이 case를 나열한다.
		 if문에서 ||로 조건을 연결한 것과 동일하다.
		 */
		int season = 4;
		switch(season) {
		case 4: case 5: case 6:
			System.out.println("4~6 봄입니다.");
			break;
		
		case 7: case 8: case 9: 
			System.out.println("7~9 여름입니다");
			break;
		case 10:
			System.out.println("10 가을입니다.");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("11~2 겨울입니다.");
			break;
		}
		
	}

}
