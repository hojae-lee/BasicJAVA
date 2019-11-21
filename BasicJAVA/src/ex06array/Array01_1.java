package ex06array;

public class Array01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 자바에서는 배열을 클래스를 통해 새성하게 된다. 생성된 배열은 힙영역에 저장되고 할당된 메모리의 주소값을 반환한다.
		 그래서 배열명(배열변수)는 주소값(참조값)을 저장하게 된다.
		 */
		int[] numArr = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
//		0x1234 와 같은 메모리 주소값이 출력됨
		System.out.println("numArr(배열명)= "+ numArr);
//		2번방에 저장된 20이 출력
		System.out.println("numArr의 2번방의 값: "+ numArr[2]);
		
		int[] arrNumber = new int[4];
		/*
		 배열의 초기화
		 : 배열의 크기를 반환하고자 할 때는 배열명.length를 사용한다.
		 */
		for(int i=0; i<arrNumber.length; i++) {
			arrNumber[i] = i+10;
		}
		for(int i=0; i<4; i++) {
			System.out.println(i+"번방의 값= "+ arrNumber[i]);
		}
		System.out.println("=============================");
		
		String[] strArr = new String[3];
		strArr[0] ="java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("=============================");
		
//		class Person{
//			int age;
//			String Address;
//			String gender;
//			
//		}
//		
//		Person p = new Person();
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1: 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0] = 100;
		System.out.println("initArr[0]= "+ initArr[0]);
		
		System.out.println("방법2 : 선언과 동시에 초기화1");
		/*
		 자바 컴파일러는 초기값의 갯수를 통해 크기를 결정 할 수 있기 때문에 이런 경우 크기는 생략하도록
		 약속되어있다.
		 */
//		int[] initArr2 = new int[3] {1,20,300};
		int[] initArray2 = new int[] {1,20,300};
		
		System.out.println("방법3 : 초기값만으로 선언");
		int[] initArr3 = {11, 13, 17, 19, 23};
		int arrSum = 0;
		for(int x=0; x<initArr3.length; x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의 합은 = "+ arrSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
