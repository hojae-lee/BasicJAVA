package ex05method;

public class RecursiveError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		showHi(3);
		
	
		int[] k = new int[10];
		int sum = 0;
		for(int i=0; i<=k.length; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt="+ cnt);
		
		/*
		 
		 오류코드
		 1. 감소연산자가 후위에 있어 3이 지속적으로 호출된다.
		 2. 조건식의 위치가 잘못되었다.
		 3. 재귀호출을 하기 전 종료 조건을 체크할 수 있도록 수정해야 한다.

		showHi(cnt--);
		if(cnt==1) {
			return;
		}
		*/
		/*
		 스택 오버플로우(stack overflow)
		 : 스택은 함수가 종료되기 전까지의 모든 정보를 저장하는 역할을 하는 메모리
		 유한한 공간이므로 무한루프에 빠지게 되면 저장능력을 초과하여 해당 에러가 발생하게 된다.
		 */
		
		//수정된 코드
		if(cnt==1) return;
		showHi(--cnt);
		
	}
	
	
}
