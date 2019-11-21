package ex12inheritance;
/*
 스태틱 타입의 멤버도 상속이 되고 하위클래스에서 접근할때는 멤버변수의 이름만으로 접근이 가능
 단 클래스 외부에서 접근시 객체생성없이 클래스명을 통해서도 접근이 가능하다.
 즉 스태틱과 동일한 규칙이 적용된다.
 */
public class StaticInheritance {

	public static void main(String[] args) {

		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		
		Adder.val +=5;
		AdderFriend.val +=7;
		
		adFriend.showVal();
		
	}

}

class Adder{
	
	public static int val = 0;
	
	public void add(int num) {
		//val += num;
		Adder.val += num;
		/*
		 static으로 선언된 멤버변수는 실제로는 외부에 로그되어 있으므로 클래스명을 통한 접근이
		 허용된다. 코드레벨에서 보자면 해당 클래스의 멤버변수의 형태 이므로 멤버변수처럼 접근도
		 허용된다.
		 */
	}
	
}

class AdderFriend extends Adder{
	
	public void friendAdd(int num) {
//		val += num;
		Adder.val += num; //가능한 표현
	}
	public void showVal() {
		System.out.println("val="+ val);
		System.out.println("val="+ Adder.val); //가능한 표현
	}
	
}