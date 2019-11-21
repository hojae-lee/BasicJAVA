package ex06array;

public class CallByValue {

	
	/*
	 Call By Value(값에 의한 호출)
	 	메소드 호출과 관련된 개념으로 매개변수를 통해 값을 전달 할 때 메모리의
	 	복사를 통해 값이 전달된다.
	 	그래서 다른 메소드에서 값의 변경이 있더라도 호출한 메소드이 값에는 전혀 영향을 미치지 않는다.
	 	
	 	메모리적 관점으로보면 스택영역만 사용하는 케이스로 메인과 호출된 메소드는 서로 다른 지역이므로 서로에게
	 	영향을 미치지 않는 것이다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//출력1 : f100,s200
		int first = 100, second = 200;
		System.out.println("main메소드안-호출전 "+"first= "+ first+", second= "+ second);
		callByValue(first,second);
		//출력3 : f100,s200
		System.out.println("main메소드안-호출후 "+"first= "+ first+", second= "+ second);
	}

	static void callByValue(int fNum, int sNum) {

		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		//출력2 : f200, s100
		System.out.println("callByValue 메소드 안 "+"fNum="+ fNum+" ,sNum= "+sNum);	
	}

}
