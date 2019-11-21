package ex09package;

import java.util.Date;

import ex09package.kosmo.util.CommonUtil;

public class PackageMain {

	public static void main(String[] args) {

		
		/*
		 하나의 클래스안에서 패키지는 다르나 같은 이름의 클래스를 사용해야
		 할 때 사용법
		 예]
		 	java.util.Date클래스
		 	java.sql.Date클래스
		 	방법1 : 클래스명 앞에 풀패키지 경로를 써준다.
		 	방법2 : 하나의 클래스는 import하고 다른 하나만 풀경로를 써준다.
		 */
		Date utilDate = new Date();
		System.out.println("utilDate= "+ utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate= "+ sqlDate);
		
		/*
		 ex09package 하위에 ex09package.kosmo.util 패키지가 생성되지만 이 두개는
		 서로 다른 패키지로 인식한다. 따라서 아래처럼 isNumber() 메소드를 호출하기
		 위해서는 ex09package.kosmo.util패키지를 import해야 한다.
		 */
		
		String strValue = "987654321";
		boolean isNum = CommonUtil.isNumber(strValue);
		
		System.out.println("문자열: "+ strValue);
		if(isNum == true) {
			System.out.println("문자열은 숫자입니다.");
		}
		else {
			System.out.println("숫자 이외의 문자가 포함되어있습니다.");
		}
		
		System.out.println(ex09package.kosmo.util.CommonUtil.isNumber("백20"));
		
	}

}
