package ex16exception;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasic2 {

	static Date toDay;
	
	public static void main(String[] args) {

		/*
		 2] 런타임에러
		 컴파일는 체크가 안되고 실행시에만 발생되는 에러
		 RuntimeException클래스계열로 NullPointerException이 대표적인 파위클래스이다.
		 mainㅁ소드에서 무시하기 위해 쓰로우 하더라고 오류가 발생되므로 반드시 예외 처리를
		 해줘야한다.
		 예외발생시 JVM은 해당 예외클래스를 인스턴스화 해서 예외객체를 프로그램쪽으로 전달한다.
		 */
		
		/*
		 2-1] ArrayIndexOutOfBoundsException
		 : 배열의 크기를 벗어난 인덱스를 사용할 경우 발생되는 예외
		 */
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은: "+intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은: "+intArr[1]);
			
			intArr[2] = 300; //<- 예외발생지점
			
			//위에서 예외가 발생하므로 해당 문장은 실행되지 않음.
			System.out.println("앗 이방은!?!?!!?!??: "+intArr[2]);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			/*
			 try문에서 발생된 예외를 JVM이 객체화해서 catch쪽으로 던지면 해당 객체를 받아서
			 절하게 예외처리한다.
			 */
			System.out.println("예외가 발생했어요");
			/*
			 e.getMessage() : 예외에 대한 간략한 메세지만 표시함
			 e.printStackTrace() : 예외가 발생할때의 에러메시지를 그대로 화면에 출력해줌
			 개발시 훨씬 더 사용빈도 높음.
			 */
			System.out.println("예외 메시지"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("0번방 재출력: "+intArr[0]);
		System.out.println("==ArrayIndexOutOfBoundsException발생후==");
		/****************************************************************/
		
		/*
		 2-2] NumberFormatException
		 : 숫자형식의 문자열을 int로 변환하는 경우 해당 문자열이 숫자형식이 아니면 발생되는 예외
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("나이를 입력하세요:");
			String strAge = sc.nextLine();
			int ageAgter10 = Integer.parseInt(strAge)+10;
			System.out.println("당신의 10년후 나이는: "+ ageAgter10);
		} 
		catch (NumberFormatException e) {
			System.out.println("나이는 숫자로만 입력해야 합니다.");
			System.out.println("예외메시지: "+e.getMessage());
			e.printStackTrace();
		}
		/*
		 2-3] InputMismatchException
		 : nextInt()를 통해 정수형의 자료를 입력받을 때 문자를 입력하면 발생되는 예외
		 */
		try {
			System.out.print("나이를 입력하세요:");
			int intAge = sc.nextInt();
			int ageAfter10 = intAge+10;
			System.out.println("당신의 10년 후 나이는 : "+ageAfter10);
		} 
		catch (InputMismatchException e) {
			System.out.println("나이를 문자형태로 입력하면 앙데요");
			System.out.println("예외메시지:"+e.getMessage());
			
		}
		
		/********************************************************************/
		
		/*
		 2-4] NullPointerException
		 : 인스턴스 변수에 해당객체의 메모리주소가 저장되지 않은 상태에서 멤버를 호출하면
		 발생하는 예외. 인스턴스변수가 null값을 가지게되면 참조할 객체가 없다는 뜻이므로
		 반드시 객체생성후 참조해야한다.
		 */
		System.out.println("toDay="+ toDay);
		try {
			System.out.println(toDay.getTime());
		} 
		catch (NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메시지:"+e.getMessage());
		}
		
		/*
		 ※ 빈문자열과 null값의 차기
		 "": 빈문자열로 null이 아니다. String객체는 생성되었으나 값이 없는 상태를 말한다.
		 null: 객체 자체가 생성되지 않는 상태를 말한다.
		 */
		String emptyString = "";
		System.out.println("emptyString의 문자열길이: "+emptyString.length());
		String nullString = null;
		try {
			System.out.println("nullString의 문자열 길이:"+nullString.length());
			
		} catch (NullPointerException e) {
			System.out.println("nullString은 null입니다.");
			System.out.println(e.getMessage());
		}
		
		/*********************************************************************/
		
		/*
		 2-5] ArithmeticExceptio
		 숫자 문자
		 */
		int result = 10;
		try {
			result = result /0;
			System.out.println("결과는:"+ result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("예외메세지: "+e.getMessage());
		}
		
		/*********************************************************************/
		
		/*
		 2-6] ClassCastException
		 : 객체의 형변환이 불가능한 경우 발생되는 예외
		 */
		Object object = new Object();
		try {
			String strObject = (String)object;
			
		} catch (ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==ClassCastException발생후==");
		
		/*
		 자바에서 기본적으로 제공되는 클래스에 대해 형변환을 시도하기 위한 참조코드
		 */
		
		String str = "형변환되나요?";
		boolean casfFlag = myClassCast(str);
		if(casfFlag == true) {
			System.out.println("됩니다.");
		}
		else {
			System.out.println("안됩니다.");
		}
		
	}
	//String 객체가 매개변수로 전달되면서 Object로 받기 때문에 여기서 상속관계가 확인된다.
		public static boolean myClassCast(Object str) {
			if(str instanceof String) {
				return true;
			}
			else {
				return false;
			}
		}

}
	