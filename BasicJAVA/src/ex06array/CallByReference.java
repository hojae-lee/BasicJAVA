package ex06array;

public class CallByReference {
	/*
	Call By Reference(참조주소 값에 의한 호출)
		: 메소드를 호출할 떄 참조값을 전달함으로써 서로 다른 지역에서도 동일한 메모리(힙 영역)를 
		참조할 수 있게 하는 호출방법이다.
		메소드의 지역이 서로 다르더라도 참조값을 통해 참조 하므로 A영역에서의 값의 변경을 B영역에서 그대로
		참조할 수 있는 장점이 있다.
		그리고 참조값만 전달하므로 프로그램의 퍼포먼스도 향상된다.
	 */

	public static void main(String[] args) {

		int[] arr = {100,200};
		
		System.out.println("메인메소드 스왑 전- ");
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		callByReference(arr);
		System.out.println("메인메소드 스왑 후- ");
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

	static void callByReference(int[] ar) {

		int temp;
		temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
		
	}

}
