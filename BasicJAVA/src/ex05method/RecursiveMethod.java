package ex05method;

/*
 재귀함수
 	하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식으로 주어진 문제를 해결하는 방법이다.
 	재귀호출이라고도 한다.
 */

public class RecursiveMethod {

	static int factorial(int number) {
		int result = 1;
		
		if(number==1) {
			result = 1;
		}
		else {
			result = number * factorial(number -1);
		}
		System.out.println("계산과정:number= "+ number+ ", result= "+ result);
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4fac: "+ factorial(4));
		System.out.println("10fac: "+ factorial(10));
		
	}
	
}
