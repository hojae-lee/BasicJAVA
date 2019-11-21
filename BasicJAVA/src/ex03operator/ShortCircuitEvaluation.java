package ex03operator;

public class ShortCircuitEvaluation {
	
	/*
	 SCE (Short-cicuit Evaluation)
	 	하나의 조건검사만으로 결과를 알 수 있는 경우 자바컴파일러는 뒤의 조건을 수행하지 않고 넘어가게 된다. 이 경우 변수의
	 	값을 변경하는 코드가 있다면 주의해야 한다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =0, num2=0;
		boolean result;
		
		/*
		 &&(논리AND)의 경우 둘 중 하나만 false이면 false를 반환하므로 첫 번째 조건이 false이면 두 번째 조건은 검사(실행)하지 않는다.
		 */
		
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);
		System.out.println("num1="+ num1 + ", num2=" + num2);
				
		/*
		 ||(논리OR)의 경우 둘 중 하나만 true면 true를 반환하므로 첫 번째 조건이 true이면 두 번째 조건은 검사하지 않는다.
		 */
		
		result = (num1+=10)>0 || (num2+=10) >0;
		System.out.println("result="+ result);
		System.out.println("num1="+ num1 +", num2="+ num2);
		
		/*
		 따라서 num2의 결과가 프로그램에 영향을 미치게 된다면 별도의 처리가 필요하므로 주의해야 한다.
		 */
		
	}

}
