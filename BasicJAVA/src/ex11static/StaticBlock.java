package ex11static;

/*
 스태틱블럭
 :동일 클래스안의 메인보다 먼저실행되는 블럭으로 메인메소드에 실행코드가 없더라도 스태틱블럭안의
 코드는 실행된다.
 단, 다른 클래스에 메인이 있는 경우에는 메인이 순차적으로 실행되다가 스새택블럭이 있는 클래스를
 인스턴스화 할때 스태틱블럭이 생성자보다 머저 실행된다.
 형식
 	static{
 		실행코드;
 	}
 스태틱블럭안에서는 정적 맴버만 사용 가능함.
 */

public class StaticBlock {

	//인스터스형 멤버
	int instanceVar;
	void instanceMethod() {}
	
	//정적 멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	//static block
	static {
		//staitc블럭안에서는 정적멤버인 staticVar에 접근가능
		staticVar = 1000;
		
		/*
		 스태틱 블럭안에서만 사용할 수 있는 지역변수 선언.
		 블럭내에서만 제한적으로 허용된다.
		 */
		
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+localVar);
		
		/*
		 스태틱블럭내에서는 인스턴스형 멤버를 사용할 수 없다. 아래문장들은 에러발생
		 */
//		System.out.println("instanceVar="+instanceVar);
//		instanceMethod();
		
		//정적멤버만 사용가능
		System.out.println("staticVar="+staticVar);
		staticMethod();
		System.out.println("===stack block===");
	}
	
	public StaticBlock() {
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자");
	}
	
	public static void main(String[] args) {
		
		/*
		 StaticBlockMain.java에서 실행할 때는 주석처리 후 할 것.
		 */
//		System.out.println("==메인메소드==");
		//Static블럭내에서만 선언된 지역변수로 메인에서 사용불가
//		System.out.println("localVar="+localVar);
		
		StaticBlock sb = new StaticBlock();
	}
	
}
