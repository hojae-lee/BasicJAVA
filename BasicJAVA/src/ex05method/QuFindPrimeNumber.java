package ex05method;

import java.util.Scanner;

public class QuFindPrimeNumber {
// 100이하의 소수를 구하는 문제 자기 자신을 1과 자신으로만 나눌수있다.. 그 사이에 있는 정수로 나누었을경우 나머지가0이
//	되면 소수가 아님.
	public static void main(String[] args) {

		System.out.println("1~100 중 소수를 출력");
		
		for(int su=1; su<=100; su++) {
			if(isPrimeNumber(su)) {
				System.out.println("소수 "+ su);
			}
		}
	}

	
	static boolean isPrimeNumber(int prime) {
			
			boolean cnt = true;
			if(prime ==1){
				cnt = false;
			}
			for(int i =2; i<prime;i++) {
			if(prime%i==0)
			{
			 cnt = false;
			}
			else 
				cnt = true;
			}
			
			return cnt; 
		}
}

