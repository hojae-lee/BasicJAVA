package ex15usebasicclass;

/*
 와일드 카드: 패키지를 임포트할 때 보통은 클래스명을 명시하지만 특정패키지의 모든 클래스를
 	임포트하고 싶을때는 *를 사용하면 된다. 
 */
import java.lang.*;
/*
 Object클래스
 -자바에서 최상위 클래스이다.
 -별도의 선언없이 Object클래스에 정의된 모든 메소드를 사용할 수 있다.
 	주로 오버라이딩 처리하여 재정의후 사용한다.
 -개발자가 정의한 모든 클래스를 Object 인스턴스로 참조할수있따.
 예) Object obj = new Person();
 	또는
 	void myFunction(Object obj){
 		실행부;
 	}
 */
class Friends extends Object{
	
	String myName;
	public Friends(String name) {
		myName = name;
	}
	
	@Override
	public String toString() {
		return "제 이름은 "+myName+" 입니다.";
	}
	
}

/*
 toString() 메소드
 - Object클래스에 정의된 메소드로 println()이 문자열을 출력하기 전에 자동으로 호출하는 메소드이다.
 - 인스턴스변수를 문자열 형태로 변환하여 반환해준다.
 - 필요한 경우 클래스 정의시 적절히 오버라이딩하여 정의한다. 단 필수사항은 아니다.
 */
public class ToStringObject {

	public static void main(String[] args) {

		Friends fnd1 = new Friends("이순신");
		Friends fnd2 = new Friends("김유신");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
		
	}

}
