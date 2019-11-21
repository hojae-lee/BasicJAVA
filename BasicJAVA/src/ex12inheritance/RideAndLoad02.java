package ex12inheritance;
/*
가변인자
형식
	메소드명(자료형 ... 매개변수){
	실행할내용;
	}
	: 메소드 오버로딩을 대체 할 수 있는 문법으로 하나의 메소드로 여러가지 호출 형식을 대체할 수 있따.
	
	Varargs => Variable Arguments
	-필요에 따라 매개변수를 가변적으로 조정할 수 있는 문법으로 JDK1.5(5.0) 부터 지원한다.
	-매개변수의 갯수에 따라 여러개의 메소드를 정의하지 않아도 되므로 편리하다.
	- 매개변수는 여러개를 받아야 하므로 배열형태로 반환된다.
*/

public class RideAndLoad02 {
	
	/*
	 메소드 오버로딩을 통한 구현
	 	:매개변수의 갯수에 따라 여러개의 메소드를 정의해야한다.
	 */
	
	static int getTotal(int param) {
		int total = 0; 
		total += param;
		return total;
	}
	
	static int getTotal(int param1, int param2) {
		int total = 0; 
		total += param1+param2;
		return total;
	}

	static int getTotal(int param1, int param2, int param3) {
		int total = 0; 
		total +=  param1+param2+param3;
		return total;
	}
	
	static int getTotal(int param1, int param2, int param3, int param4, int param5, int param6) {
		int total = 0; 
		total +=  param1+param2+param3+param4+param5+param6;
		return total;
	}
	/*
	 가변인자를 통한 메소드 정의
	 	:	단 매개변수가 하나의 타입일때만 가능하다.
	 	둘 이상의 타입이라면 정의할 수 없다.
	 */
	static int getTotal(int ...param) {
		int total = 0;
		for(int i=0; i<param.length; i++) {
			total += param[i];
		}
		return total;
	}
	
	public static void main(String[] args) {

		System.out.println("getTotal(args1)호출: "+getTotal(10));
		System.out.println("getTotal(args1,args2)호출: "+getTotal(10,20));
		System.out.println("getTotal(args1,args2,args3)호출: "+getTotal(10,20,30));
		System.out.println("getTotal(매개변수6개)호출: "+getTotal(10,20,30,40,50,60));
		
		//매개변수의 타입이 double로 다르기 때문에 호출불가
//		System.out.println(getTotal(10,20,30.0));
		
		
	}

}
