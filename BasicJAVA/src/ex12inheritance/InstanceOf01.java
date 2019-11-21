package ex12inheritance;
/*
 instanceof 연산자
 -두 클래스간에 형변환이 가능한지 판단하는 연산자
 -해당 인스턴스변수가 어떤 타입의 변수인지 판단하는 연산자
 - 두 클래스간에 상속관계가 존재할때 사용이 가능하다.
 - 형변환이 가능하면 true,아니면 false를 반환한다.
 형식]
 	부모의 인스턴스 변수 instanceof 자식의 클래스 타입
 */
public class InstanceOf01 {

	public static void main(String[] args) {
		
		String string = "JAVA";
		StringBuffer buffer = new StringBuffer(" World");
		
		System.out.println(string instanceof String? "string은 String타입이다": "string은 String 타입이 아니다.");
		/*
		 JAVA에서 정의되는 모든 클래스는 Object클래스를 상속하므로 아래 문장은 true를 반환한다.
		 */
		System.out.println(string instanceof Object? "string은 Object타입이다(상속관계가있다.)": "string은 Object 타입이 아니다.");
		System.out.println(buffer instanceof StringBuffer? "buffer은 StringBuffer타입이다": "buffer은 StringBuffer 타입이 아니다.");
		
		/*
		 상속관계가 없을때는 컴파일에러 발생됨
		 */
		/*
		string = buffer;
		buffer = string;
		System.out.println(string instanceof StringBuffer);//에러
		System.out.println(buffer instanceof string); //에러
		*/
		
		/*
		 두 클래스간 상속관계가 존재할 떄
		 1. instanceof 연산자로 선 판단하지 않고 형변환을 시도할 경우, 상속관계는 존재하나 형변환이 불가능하면
		 실행시 ClassCastException 예외가 발생한다.
		 */
		Object object = new Object();
//		String stringObject = (String)object; 예외발생
		System.out.println(object instanceof String);
		
		/*
		 위에서는 instanceof를 통해 형변환이 가능한지 선판단 하지 않았지만 아래는 선 판단후 형변환을 진행하므로
		 에러 발생되지 않음.
		 */
		
		if(object instanceof String) {
			String stringObject = (String)object;
			System.out.println("Object형을 String형으로 형변환성공");
		}
		
		object = string;//자동형변환 됨
		
		Object obj = new String("하하");
		
		if(object instanceof String) {
			String stringObject = (String)object;
			System.out.println("Object형을 String형으로 강제적"+" 형변환성공");
			System.out.println(object);
		}
		
		if(obj instanceof String) {
			String stringObject = (String)obj;
			System.out.println("Obj형을 String형으로 강제적"+" 형변환성공");
		}
	}

}
