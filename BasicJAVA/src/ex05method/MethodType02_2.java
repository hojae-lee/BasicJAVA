package ex05method;

import java.util.Scanner;

public class MethodType02_2 {

	private static String getHakjum() {
		
		System.out.println("국,영,수 점수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		double avg = (kor+eng+math) /3;
		//학점반환을 위한 변수 생성
		String hakjum = "";
		
		switch((int)avg/10) {
		case 10: case 9:{
			hakjum ="A";
			break;
		}
		case 8:{
			hakjum ="B";
			break;
		}
		case 7:{
			hakjum ="C";
			break;
		}
		case 6:{
			hakjum ="D";
			break;
		}
		default :{
			hakjum ="F";
			break;
		}
		}
		 
		return hakjum;
	}
	
	public static void main(String[] args) {
		
		/*
		 시나리오] 사용자로부터 국,영,수 점수를 입력받아 평균을 구한 후 학점을 반환하는 메소드를 정의하시오.
		 */
	
		System.out.println("너의 학점은 "+ getHakjum() + " 이얌~!\n");
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s입니다.",h);
	}
	
}
