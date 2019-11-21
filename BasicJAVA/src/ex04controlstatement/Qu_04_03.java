package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문제3
		
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = kor+eng+math;
		
		double avg = sum / 3;
		
		switch((int)avg/10) {
		case 10: case 9:{
			System.out.println("A");
			break;
		}
		case 8:{
			System.out.println("B");
			break;
		}
		case 7:{
			System.out.println("C");
			break;
		}
		case 6:{
			System.out.println("D");
			break;
		}
		default :{
			System.out.println("F");
			break;
		}
		}

	}

}
