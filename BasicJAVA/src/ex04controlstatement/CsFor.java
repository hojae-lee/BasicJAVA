package ex04controlstatement;

public class CsFor {

	/*
	 for문: while문과 같은 반복문으로 초기값, 조건식, 증감식이 한 라인에 있어 반복의 횟수를 명확히 알 수 있는 반복문.
	 사용빈도가 가장 높음
	 형식]
	 	for(초기값; 조건식; 증감식){
	 		실행문장;
	 	}
	 실행순서]
	 	초기값 -> 조건식 -> 실행문장 -> 증감식 -> 조건식 ....반복실행됨
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====================================\n");
		for(int i= 1; i<=5; i++) {
			System.out.println("i= "+i);
		}
		
		System.out.println("\n====================================\n");
		
		/*
		 시나리오] 1~100까지의 합을 구하는 프로그램을 for문으로 작성하시오.
		 */
//		for(초기값; 조건식; 증감식)
		
		int sum = 0;
		for(int j=1; j<=100; j++) {
			sum += j;
		}
		System.out.println("1~100까지의 합: "+sum);
		System.out.println("\n====================================\n");
		
		/*
		 연습문제] for문을 이용하여 1~10사이의 정수중 2의 배수의 합을 구하는 프로그램을 작성하시오.
		 */
		
		int total = 0;
		for(int k =1; k<=10; k++) {
			if(k%2==0) {
				total += k;
			}
		}
		
		System.out.println("1~10사이의 정수 2의 배수의 합: "+ total);
		System.out.println("\n====================================\n");
		
		int total_2 = 0;
//		for(int x = 0; x<=10; x=x+2) 아래와 동일한 방법
		for(int x = 0; x<=10; x+=2) {
			total_2 +=x;
		}
		System.out.println("1~10사이의 정수 2의 배수의 합: "+total_2);
		System.out.println("\n====================================\n");
		
		/*
		for문의 초기식에서 선언된 변수 x는 for문이 끝나는 순간 메모리에서 소멸된다. 여기서 사용된 x를 지역변수라한다.
		지역변수는 해당 지역을 벗어나면 소멸되는 특성을 가지고 있다.
		
		System.out.println("위 for문에서 사용한 변수 x값:"+ x);
		*/
		
		/*
		 for문의 초기값을 외부(넓지)에서 선언하게 되면 해당 변수는 for문 안쪽(좁지)에서 사용가능하다.
		 즉 아래에서 선안한 변수 i는 main메소드의 지역변수가 된다.
		 */
		
		int i = 0;
		for(; i<=5; i++) {
			System.out.println("for문 안에서의 i값: "+ i);
		}
		
		System.out.println("for문 밖에서의 i값: "+ i);
		System.out.println("\n====================================\n");
		
		/*
		 for문으로 무한루프 조건을 만들 때는 아래와 같이 한다.
		 하지만 무한루프의 조건을 사용할 때는 while문을 주로 사용한다.
		 for(;;) {
			System.out.println("나는 for문으로 만든 무한루프");
		}
		 */
		
		/*
		 for문의 끝에 ;이 있으면 반복할 문장이 없는경우라 간주한다.
		 */
		
		for(int j = 0; j<=5; j++); {
			//for문과 상관없이 한 번만 실행된다.
			System.out.println("어랏! 나는 누구?");
		}
		System.out.println("\n====================================\n");
		
		/*
		 시나리오] 다음의 출력결과를 보이는 for문을 작성하시오
		 출력결과
		 
		 	0 0 0 1
		 	0 0 1 0
		 	0 1 0 0
		 	1 0 0 0
		 	해법: x와 y를 더해서 5개 될 때 1을 출력한다.
		 */
		System.out.println("==증가연산자 사용으로 구현==");
		for(int x =1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
						
				if(x+y==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==감소연산자 사용으로 구현==");
		for(int x=1; x<=4; x++) {
			for(int y=4; y>=1; y--) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
