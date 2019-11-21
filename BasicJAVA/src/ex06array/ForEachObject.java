package ex06array;

public class ForEachObject {

	public static void main(String[] args) {

		//Stack					Heap
		String str 		= new String("안녕하세요");
		
		String str2 		= "안녕하세요";
//======================================================================================
//		int aaa = "안녕하세요".length();
//		int bbb = str2.length();
		
		/*
		 객체배열(인스턴스배열)
		 	: 배열에 정수 혹은 실수를 저장하게 되면
		 	기본자료형 배열이라고 하고, 객체를 저장하게 되면 객체배열이라고 한다.
		 	객체를 저장한다는 개념이외에 특별히 다른것은 없으나, 실제 저장되는 데이터는 객체자체가
		 	아니라 참조값(주소값)이 된다.
		 */
		
		String[] strArr = new String[] {
				"자바는 재미있다.",
				"자바는 유용하다",
				"그러나 어렵다 ㅜㅜ"
		};
		
		for(String e : strArr) {
			System.out.println(e);
		}
		
	}

}
