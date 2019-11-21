package ex07string;

/*
 자바의 전제조건1
 	: 자바의 모든 프로그램은 java.lang 패키지에 포함되게 된다.
 	즉, 아래 import문은 생략이 가능하며 해당 패키지의 모든 클래스를 사용할 수 있다.
 */
import java.lang.*;

/*
 자바의 전제조건2
 	: 자바에서 제공되는 혹은 생성하는 모든 class는 Object클래스를 자동으로 상속받는다.
 	따라서 Object클래스에 정의된 모든 메소드를 사용 할 수 있다.
 */

public class StringBasic extends Object {
	
	public static void main(String[] args) {

		int num1 =10, num2 = 20;
		String numResult = (num1==num2) ? "데이터가 같다": "데이터가 다르다";
		System.out.println("비교결과: "+ numResult);
		
		
		/*
		 String 클래스의 객체생성방법1 : new를 사용한다
		 */
		
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		/*
		 str1,str2는 String 인스턴스(객체)의 참조값을 가지고 있으므로 아래는 참조값에 대한 비교를
		 하고 있다.
		 */
		// == 대상의 주소값의 비교
		
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		// equals 대상의 값 비교
		/*
		 equals() 메소드
		 	: Object 클래스로부터 상속받은 메소드로 실제 저장된 문자열을 비교하도록 만들어진 메소드이다.
		 	즉 아래는 객체에 실제 저장된 문자열에 대한 비교가 이루어진다.
		 */
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
		/*
		 String 클래스의 객체생성방법2: "(더블쿼테이션) 사용
		 */
		String str3 = "KOSMO";
		String str4 = "KOSMO";
		System.out.println("equals()메소드로 문자열비교"+str3.equals(str4));
		/*
		 자바에서 문자열객체를 생성 할 때 new를 사용하지 않고 " 를 사용하게 되면, 동일한 문자열인 경우에는
		 한군데만 메모리를 생성하여 공유한다.
		 */
		if(str3==str4) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		
		
	}

}
