package ex11static;
/*
 싱글톤 디자인 패턴
 	: 클래스를 설계하는 디자인패턴의 하나로써 하나의 인스턴스 즉 하나의 메모리를 생성해
 	이를 공유해서 사용하고자할 때 사용하는 패턴이다.
 	사용예 java.util패키지이 Calendar클래스
 	
 	방법]
 	1.생성자의 접근지정자를 private로 한다.
 	2. 정적 메소드로 해당 클래스의 객체를 반환하도록 정의한다.
 	3. new 연산자를 통해 객체를 생성 할 수 없다.
 */

class NoSingleTone{
	int instVar;
	/*
	 JVM에 의해 프로그램이 로드 될 때 객체가 생성되어 메소드영역에 할당되므로 객체는 한번만
	 만들어지게된다.
	 */
	public NoSingleTone() {
		//나는 기본 생성자
	}
}

class SingleTone{
	int shareVar;
	private static SingleTone single = new SingleTone();
	//생성자가 privat로 선언되어 외부에서 new 연산자를 통해 객체를 생성할 수 없게 된다.
	private SingleTone() {
		//기본생성자
	}
	/*
	 정적 메소드로 해당 클르새의 객체를 외부로 반환하도록 정의됨.
	 */
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}

public class SingleToneDesignPattern {

	public static void main(String[] args) {

		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1="+nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2="+nst2);
		
		//생성자가 private으로 선언되었기 떄문에 접근불가능
		//SingleTone st1 = new SingleTone();
		
		//getInstance() 메소드를 통해서만 참조변수를 반환 받을 수 있따.
		
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		System.out.println(String.format("st2의주소:%s", st2));
		System.out.println(String.format("st3의주소:%s", st3));
		
		System.out.println(String.format("st2의 sharevar:%d", st2.shareVar));
		System.out.println(String.format("st3의 sharevar:%d", st3.shareVar));
	}

}
