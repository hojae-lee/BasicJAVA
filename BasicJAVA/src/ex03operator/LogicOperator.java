package ex03operator;

public class LogicOperator {

	/*
	 논리연산자
	 	&& : 논리 AND. 양 쪽 모두가 true일 때만 true를 반환하고 나머지는 false를 반환한다.
	 	|| : 논리 OR. 한 쪽만 true이면 true를 반환하고, 양 쪽 모두 false일 때만 false를 반환한다.
	 	! : 논리NOT. 반대의 논리를 반환한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10, num2 = 20;
		
		boolean result1 = (num1 == 100 && num2 == 20);
		boolean result2 = (num1 < 12 || num2 >= 30);
		
		System.out.println("result1의 결과: "+ result1);
		System.out.println("result2의 결과: "+ result2);
		
		//num1과 num2가 다를 때 if문 블럭이 실행된다.
		
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
		
	}

}
