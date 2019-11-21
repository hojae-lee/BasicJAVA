package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		double r = sc.nextDouble();
		
		double results = circleRound(r);
		System.out.println("원의 둘레는 :"+r+": "+results);
		double result = circleArea(r);
		System.out.println("원의 넓이는 :"+r+": "+result);
	
	}

	static double circleArea(double r) {
		// TODO Auto-generated method stub
		double result = 3.14*r*r;		
//		System.out.printf("원의 넓이는(%.2f): %.2f\n",r,result);
		
		return result;
	}
	
	static double circleRound(double r) {
		
		double result = 2*3.14*r;
		
//		System.out.printf("원의 둘레(%.2f): %.2f\n",r,result);
		return result;
	}
	
}
