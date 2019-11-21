package ex05method;

import java.io.IOException;
import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		int sum = fine1(num1,num2);
		System.out.println("덧셈결과-> "+ sum);
		
		int subtract = fine2(num1,num2);
		System.out.println("뺄샘결과-> "+ subtract);
		
		int multiplication = fine3(num1,num2);
		System.out.println("곱셈결과-> "+ multiplication);
		
		int quo = fine4(num1,num2);
		System.out.println("나눗셈 몫결과-> "+quo);
	
		int mod = fine5(num1,num2);
		System.out.println("나눗셈 나머지결과-> "+mod);
	
	}
			
		static int fine1(int num1, int num2) {
			int sum = num1+num2;
			return sum;
		}
		
		static int fine2(int num1,int num2) {
			int subtract = num1 - num2;
			return subtract;
		}
		
		static int fine3(int num1,int num2) {
			int multiplication = num1 * num2;
			return multiplication;
		}
		
		static int fine4(int num1,int num2) {
			int quo = num1/num2;
			return quo;
		}
		
		static int fine5(int num1,int num2) {
			int mod = num1%num2;
			return mod;
		}

}
