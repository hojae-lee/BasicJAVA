package ex05method;

public class LocalVairable {

	/*
	 지역변수(Local Vairable)
	 - 변수는 사용범위(scope)를 가지고 있고 해당 지역내에서만 사용이 가능하다.
	 - 해당 지역을 벗어나면 즉시 소멸된다.
	 - 기본자료형은 스택이라는 메모리 공간을 사용한다.
	 - 스택은 CPU가 메모리의 생성/소멸을 주관한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean scope = true;
		/*
		 main지역에서 num을 선언하게 되면 그보다 작은 if문의 지역에서는 같은 이름의 변수를 선언 할 수 없게 된다.
		 큰 지역에서 이미 선언하여 메모리상에 상주하고 있기 때문에 그보다 작은지역에서는 선언할 수 없게 되는 것이다.
		 */
//		int num = 9; [에러발생]
		
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역: "+num);
		}
		else {
			int num = 5;
			System.out.println("첫번쨰 if문의 else지역: "+num);
		}
		
		int num = 100;
		
		System.out.println("main메소드 지역: "+ num);
		
		simpleFunc();
		System.out.println("main 메소드 끝");
	}

	static void simpleFunc() {
		/*
		 메인에서 선언한 변수 num 이 아직 메모리상에 남아있지만 같은레벨의 서로다른 지역이므로
		 같은 이름의 변수를 선언하는것이 가능하다.
		 */
		int num = 1000;
		System.out.println("simple메소드지역: "+ num);
	}
	
}
