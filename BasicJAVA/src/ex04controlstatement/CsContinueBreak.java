package ex04controlstatement;

public class CsContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 break문
		 	반복문이나 switch문에서 주로 사용되며 문장내에서 만나게 되면 블럭을 탈출한다.
		 continue문
		 	반복문에서 continue문을 만나면 블럭의 처음으로 돌아가서 조건을 확인하게 된다.
		 	따라서 continue문 아래문장은 실행되지 않는다.
		 */
		
		int i = 0;
		while(true) {
			i++;
			System.out.printf("[i가 %d일 때]\n", i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0)continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
			if(i==3) break;
			System.out.println("break이후 출력문");
		}
		
		/*
		 중첩된 반복문 안에서 break문을 만나게 되면 가장 가까운 반복문 하나를 탈출하게 된다.
		 */
		
		for(int x=1; x<=5; x++) {
			System.out.println("x="+x);
			
			for(int y =1; y<=5; y++) {
				System.out.println("y="+ y);
				if(y==3)
					break;//y로 반복되는 for문만 탈출한다.
			}
		}
		
		
		
		
		
		
		
		
	}

}
