package ex05method;

/*
 [메소드형태2] 매개변수는 없고 반환값은 있는 경우
 	: 사용자로부터 입력값을 받은 후 연산을 진행하고 결과를 반환 할 때 혹은 난수생성시 주로 사용된다.
 */
public class MethodType02_1 {
	
	static int noParamYesReturn() {
		int sum = 0;
		for(int i= 1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1~10까지의 합: "+ noParamYesReturn());

		int sum10 = noParamYesReturn(); //변수선언해서 해도댐.
		System.out.printf("1~10까지의 합합합: %d ", sum10);
	}

}
