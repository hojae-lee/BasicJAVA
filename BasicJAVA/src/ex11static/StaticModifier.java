package ex11static;

/*
정적변수

	-멤버변수 앞에 스태틱 지정자가 붙으면 정적변수가 된다.
	- 정적변수는 JVM에 의해 프로그램이 메모리에 로드되느 ㄴ시점에 초기화 된다.
	- 메인메소드가 실행되기전에 ㅁ이미 초기화 되므로 메인메소드 실행시 별도의 선없어ㅣ 변수를
	사용할수 있다.
	
접근방법
	- 클래스내부
		변수명으로 접근가능
	- 클래스외부
		참조변수.변수명 또는 클래스명.변수명 형태로 접근한다.
*/
	

public class StaticModifier {

	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {}
	static void staticMethod() {}
	
	public static void main(String[] args) {

		/*
		 MyStaitc 클래스의 인스턴스형 멤버변수에 접근하는 방법
		 -> 인스턴스 생성 후 참조변수를 통해서 접근한다.
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar =100;
		System.out.println("myStatic.instanceVar="+myStatic.instanceVar);
		
		/*
		 static 멤버변수 접근방법
		 방법1 클래스명을 통해서 접근 인스턴스 생서없이 바로 접근하는것이 가능하다.
		 */
		
		MyStatic.staticVar =200;
		System.out.println("MyStatic.staticVar="+MyStatic.staticVar);
		
		/*
		 방법2 인스턴스변수처럼 참조변수를 통해 접근이 가능하다. 하지만 이 경우
		 정적변수를 인스턴스변수로 착각할 수 있기 때문에 권장하지 않는 방법이다.
		 */
		myStatic.staticVar =300;
		System.out.println("myStatic.staticVar="+myStatic.staticVar);
		
		/*
		 StaticModifier의 멤버에 접근하기
		 : 정적멤버의 경우 클래스명.멤버 형태로 접근하지만 자신의 클래스안에서 접근할떄는
		 클래스명을 보통 생략한다.
		 즉 알 호출문장은 MyStatic클랫의 멤버가 아니다.
		 */
		
		System.out.println(staticVar);
		staticMethod();
		
		//인스턴스형 변수 : 일바적인 방법을 따름
		StaticModifier sm = new StaticModifier();
		System.out.println(sm.instanceVar);
		sm.instanceMethod();
		/*
		 main메소드는 static으로 선언된 정적메소드 이므로 static이 아닌 메소드의 호출은 허용되지
		 않는다. 단, 객체의 참조변수를 통한 접근은 허용된다.
		 */
//		instanceMethod();
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		/*
		 인스턴스 멤버는 객체별로 각각 존재하므로 아래 초기화된 값은 객체별로 각각 저장된다.
		 따라서 출력결과는 100,1000이 된다.
		 */
		
		ms1.instanceVar= 100;
		ms2.instanceVar= 1000;
		
		System.out.println("ms1.instanceVar="+ms1.instanceVar);//100
		System.out.println("ms2.instanceVar="+ms2.instanceVar);//1000
		
		/*
		 정적멤버는 인스터스화된 객체마다 각각 가지고 있는 멤버가 아니라 메소등역여에 하나만 
		 생성하여 모든 객체가 공유하게 된다. 따라서 900 900이 된다.
		 */
		
		ms1.staticVar =800;
		ms2.staticVar =900;
		
		System.out.println("ms1.staticVar="+ms1.staticVar);//900
		System.out.println("ms2.staticVar="+ms2.staticVar);//900
		
	}

}

class MyStatic{
	
	//멤버변수
	/*
	 인스턴스 멤버변수: 반드시 클래스의 객체(인스턴스)를 생성한 후 참조변수를 통해 접근이
	 가능하다.
	 Ex) MyStatic s = new MyStatic();
	 s.instanceVar = 1000;
	 */
	int instanceVar;
	/*
	 정적 멤버변수 : 인스턴스화 할 필요없이 클래스명으로 바로 접근가능.
	 JVM이 프로그램을 로드할 때 이미 메모리에 생성된다.
	 Ex) 1. 일반적인 인스턴스 멤버변수와 동일
	 	 2. 클래스명으로 직접 접근가능. => MyStatic.staticVar = 100;
	 */
	static int staticVar;
	
	//[멤버메소드]
	/*
	 인스턴스형 메소드
	 	: 인스턴스형 메소드내에서는 모든 멤버를 사용할 수 있따.
	 */
	
	void instanceMethod() {
		System.out.println("instanceVar="+instanceVar);
		System.out.println("staticVar="+staticVar);
		staticMethod();
	}
	
	/*
	 정적메소드
	 	: 정적메소드 안에서는 인스턴스 멤버를 사용할 수 없다.
	 	정적 멤버만 사용이 가능하다.
	 	(※메인메소드에서는 스태틱으로 선언된 메소드만 호출 할 수 있었음을 기억하자)
	 */
	
	static void staticMethod() {
//		System.out.println("instanceVar="+instanceVar); 오류발생
		System.out.println("staticVar="+staticVar);
//		instanceMethod(); 오류발생
	}
	
}