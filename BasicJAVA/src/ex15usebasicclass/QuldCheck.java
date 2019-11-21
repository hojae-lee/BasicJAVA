package ex15usebasicclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuldCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		boolean flag = true;
		
		while(flag) {
				
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();
			char[] chArr = id.toCharArray();
				
			for(int i=0; i<chArr.length; i++) {
				if(!(Character.isUpperCase(chArr[i])||Character.isDigit(chArr[0]))) {
					flag = false;
					System.out.println("아이디입력완료");
					break;		
				}
				
				else{
					flag= true;
				}
			}
			
			if(flag==true) {
				System.out.println("아이디 기준에 적합하지 않습니다.");
				
			}
		
		}
		
	}

}
