package ex15usebasicclass;

/*
 equals()메소드
 -자바에서 인스턴스의 내용비교를 위해 비교연산자(==)를 사용하는 것은 단순히 참조값에 대한 비교
 이므로 실제 내용에 대한 비교는 이루어지지 않는다 인스턴스간의 내용비교를 위해서는 equals()메소드를 적절히 오버라이딩하여 사용
 해야한다.
 String과 같은 기본클래스는 별도의 오버라이딩 없이어도 내용비교가 가능하다.
 
 ※ 아래 IntNumber클래스예제는 equals()가 어떻게 인스턴스간의 내용 비교를 하느지를 설명하기 위한 코드이다.
 */
class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	public boolean isEquals(IntNumber numObj) {
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class ObjectEquals1 {

	public static void main(String[] args) {

		//기본클래스인 String 클래스의 인스턴스 비교
		String str1 = new String("KOSMO51기");
		String str2 = "KOSMOS51기";
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		}
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.isEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.isEquals(num3)) {
			System.out.println("num1과 num3은 동일한 정수");
		}
		else {
			System.out.println("num1과 num3은 다른 정수");
		}
		
	}

}
