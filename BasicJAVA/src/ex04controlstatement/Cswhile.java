package ex04controlstatement;

public class Cswhile {

	/*
	 while문 : 반복의 횟수가 정해져 있지 않을 때 주로 사용하는 반복문이다. 반복의 횟수가 명확 할 때는 for문을 주로 사용한다.
	 형식]
	 	변수의 초기값;
	 	while(반복의 조건){
	 		조건이 true일 때 실행 될 문자;
	 		증감식; <- 탈출의 조건을 만들기 위해
	 				++ 혹은 --와 같은 연산을 진행
	 	}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//누적합을 구하기 위한 변수. 증가하는 i를 누적해서 더함.
		int sum = 0;
		// 1.반복을 위한 변수의 초기화
		int i = 1;
		// 2. 반복의 조건식.
		while(i<=1000) {
			// 증가되는 i를 누적하여 sum에 더함. (1+2+3....)
			sum += i;
			
			//3. 증가식. while문을 탈출하기 위한 조건을 만듬
			i++;
		}
		System.out.println("1~10까지의 합은: " + sum);
		System.out.println("===========================");
		
		/*
		 시나리오] 1~100까지의 정수 중 3의 배수이거나 5의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
		 단, while문을 사용해야 한다.
		 */
		// 1. 100번 반복하는 while문 작성
		
		int j = 1;
		int total = 0;
		
		while(j<=1000) {
			System.out.println("j: "+j);
			
			if(j%4==0||j%7==0) {
				total += j;
			}
			j++;
		}
		System.out.println("1~1000사이 4의 배수이거나 7의 배수의 합: "+ total);
		System.out.println("=============================================");
		
		/*
		 시나리오] 구구단을 출력하는 프로그램을 작성하시오.
		 단 while문을 이용하시오.
		 */
		
		int dan = 2;
		
		while(dan <=9) {
			
			int su =1;	
			System.out.println(dan+ "단");
			while(su<=9) {
//				System.out.printf("%-1d*%-1d=%2d ",dan,su,(dan*su));
				System.out.print(dan+"*"+su+"="+dan*su+"\t");
				su++;
			}
			
		System.out.println();
		dan ++;
		}
		System.out.println("\n=============================================");
		System.out.println("=============================================");
		System.out.println("=============================================\n");
		/*
		 시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
		 출력결과
		 1 0 0 0
		 0 1 0 0
		 0 0 1 0
		 0 0 0 1
		 */
		
		int m = 1; // 바깥쪽 while문을 위한 변수
		
		while(m<=4) {
			
			int n = 1;
			
			while(n<=4) {
				
				if(m==n) {
				System.out.print("1 ");	
				}
				else {
				System.out.print("0 ");
				}
				n++;
				
			}
			System.out.println();
			m++;
		}
		
	}

}
