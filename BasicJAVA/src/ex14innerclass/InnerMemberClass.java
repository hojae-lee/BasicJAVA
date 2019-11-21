package ex14innerclass;

/*
 내부 멤버 클래스
 	: 클래스 안에 정의된 클래스로 static이 붙지 않는다.
 	
 	-외부클래스의 모든 멤버(정적 또는 인스턴스형)를 사용할 수 있다.
 	-정적멤버를 가질 수 없다. 단 상수는 가능함.
 	-컴파일시 외부클래스명$내부클래스명.class파일이 생성된다.
 	-이벤트 기반 프로그래밍 GUI,윈도우 등 많이 사용된다.
 */
class OuterMember{
	
	int ouberInstatnceVar;
	int sameVar =1000;
	//멤버변수 - 인스턴스형(객체형)
	InnerMember inner;
	
	public OuterMember() {
		/*
		 내부 멤버클래스의 인스턴스를 생성 후 객체할당.
		 */
		inner = new InnerMember();
	}
	
	//정적멤버변수
	static int outerStaticVar;
	
	//멤버메소드
	void outerInstanceMethod() {
		//외부클래스의 멤버변수 접근(같은 멤버이므로 접근가능)
		System.out.println("외부의 sameVar: "+sameVar);
		//내부클래스의 정적변수 접근(static은 클래스명으로 접근가능)
		System.out.println("내부클래스의 상수: "+InnerMember.MAX_INT);
		//내부클래스의 멤버변수 접근(내부클래스의 참조변수를 통해 접근가능)
		System.out.println("내부의 sameVar: "+inner.sameVar);
	}
	
	//정적멤버메소드
	static void outerStaticMethod() {
		//외부클래스의 정적메소드에서 내부클래스의 정적상수에 접근가능.
		System.out.println(InnerMember.MAX_INT);
		//정적메소드에서는 정적멤버만 접근이 가능하므로 접근불가.
//		System.out.println("내부의 sameVar: "+inner.sameVar);//에러발생
	}
	
	class InnerMember{
		int innerInstanceVar;
		int sameVar = 100;
		
		void innerInstanceMethod() {
			
			/*
			 외부 클래스는 내부클래스보다 큰 지역이므로 내부클래에서는 외부의 모든
			 멤버 사용가능함.
			 */
			outerInstanceMethod();
			outerStaticMethod();
			
			this.sameVar = sameVar;
			OuterMember.this.sameVar = sameVar;
		}
		
		/*
		 내부클래스에는 static멤버를 선언할 수 없다.
		 단 상수final인 경우에는 허용된다.
		 */
		static final int MAX_INT = Integer.MAX_VALUE;
	}
}

public class InnerMemberClass {

	public static void main(String[] args) {

		/*
		 외부클래스가 아닌 다른 클래스에서는 내부멤버클래스가 보이지 않으므로
		 직접 인스턴스를 생성할 수 없다.
		 */
		
		//InnerMember innerClass = new InnerMember(); 에러발생.
		
		/*
		 외부클래스의 인스턴스를 먼저 생성한 후 내부클래스의 인스턴스를 생성해야 한다.
		 */
		OuterMember outerClass = new OuterMember();
		/*
		 방법1] 외부클래스의 멤버변수로 접근
		 */
		outerClass.inner.innerInstanceMethod();
		/*
		 방법2] 외부클래스를 이용해서 직접 내부클래스 인스턴스화
		 */
		OuterMember.InnerMember in = outerClass.new InnerMember();
		//방법2-1]
		OuterMember.InnerMember in2 = new OuterMember().new InnerMember();
		
	}

}
