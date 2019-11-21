package ex03operator;

public class BeekyoOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 20;
		
		/*
		 num1이 클 때 true을 반환한다. 현재 조건은 거짓이므로 else 구문이 실행된다.
		 */
		
		if(num1 > num2) {
			System.out.println("num1이 더 큽니다.");
		}
		else {
			System.out.println("num2가 더 큽니다.");
		}
		
		/*
		 num1과 num2가 다를 때 true를 반환하므로 if구문이 실행된다.
		 */
		
		if(num1 != num2) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}

	}

}
