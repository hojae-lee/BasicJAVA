package ex15usebasicclass;

import java.io.CharConversionException;

public class WrapperClass2 {

	public static void main(String[] args) {
		
		//Wrapper클래스의 주요 메소드
		/*
		 1] 숫자형 식의 문자열을 숫자로 변경
		 	static int parseInt(String s)
		 	static Integer ValueOf(String s)
		 */
		
		String strNumber = "1000";
		System.out.println("10+strNumber= "+ (10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경: "+(10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경: "+(10+Integer.valueOf(strNumber)));
		//parseInt int형타입을 반환, valueOf는 Integer객체를 반환
		
		/*
		 문자열을 숫자로 변경할 때는 반드시 숫자형식만 와야한다.
		 원은 숫자가 아니므로 NumberFormatException이 발생됨.
		 */
		String money = "120원";
//		System.out.println("120원"+Integer.parseInt(money));
//		System.out.println("120원"+Integer.valueOf(money));

		/*
		 실수형태 문자열을 실수로 변경할떄 사용함.
		 */
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString));//에러발생
		System.out.println("실수형(float)형으로 변경: "+ Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경: "+ Double.parseDouble(floatString));
		
		//Character 클래스의 주요메소드
		/*
		 static int codePointAt(문자열,인덱스)
		 : 문자열에서 인덱스에 해당하는 한 문자의 아스키코드값을 반환한ㄷ. 인덱스는  0부터시작.
		 */
		System.out.println("ABCD에서 3번쨰 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		/*
		 static boolean isDigit(문자)
		 : 인자로 전달된 문자가 숫자인지 판단하는 메소드 단 이때 주어진 문자가 숫자 혹은 숫자형문자 일떄만 숫자로 판단한다.
		 */
		System.out.println("isDigit()를 통한 숫자판단");
		System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");
		
		/*
		 4] static boolean isLetter(문자)
		 	: 문자여부를 판단하는 메소드로 특수기호나 숫자형은 false를 반환한다.
		 */
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		/*
		 5] static boolean isWhietspace(문자)
		 : 공백문자인지 판단하는 메소드
		 */
		System.out.println("isWhitepace() 메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));//true
		
		/*
		 6] 대소문자를 판단하는 메소드
		 	: 영문자에만 적용되며 알파벳이 아닌 문자에 적용시 false를 반환한다.
		 	isLowerCase : 소문자 판단
		 	isUpperCase : 대문자 판단
		 */
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a')); //true
		System.out.println(Character.isUpperCase('Z')); //true
		System.out.println(Character.isLowerCase('가')); //무조건 false
		
		/*
		 toCharArray()
		 	: 문자열을 char형 배열로 반환해준다.
		 아래는 문자열 안에 몇 개의 공백문자가 있는지 판단하는 프로그램이다.
		 */
		String whiteString = "H E L L O";
		int whiteCount = 0;
		char[] chArr = whiteString.toCharArray();
		for(int i=0; i<chArr.length; i++) {
			if(Character.isWhitespace(chArr[i])) {
				whiteCount++;
			}
		}
		System.out.println("총공백수 : "+whiteCount);
		
	}

}
