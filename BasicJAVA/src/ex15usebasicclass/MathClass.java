package ex15usebasicclass;

public class MathClass {

	public static void main(String[] args) {

		System.out.println("원주율: "+Math.PI);
		
		float f = -3.14f;
		double b = -100.9;
		int num = -10;
		
		//절대값
		System.out.println("Math.abs"+Math.abs(f));
		System.out.println("Math.abs"+Math.abs(b));
		System.out.println("Math.abs"+Math.abs(num));
		
		/*
		 올림값 
		 : 소수점에서 큰 수로 가장 가까운 정수를 찾는다.
		 */
		System.out.println("Math.ceil: "+Math.ceil(3.4));
		System.out.println("Math.ceil: "+Math.ceil(-3.4));
		System.out.println("Math.ceil: "+Math.ceil(3.9));
		
		/*
		 내림값
		 	: 소수점에서 작은 수로 가장 가까운 정수를 찾는다.
		 */
		System.out.println("Math.floor: "+ Math.floor(3.4));
		System.out.println("Math.floor: "+ Math.floor(-3.4));
		System.out.println("Math.floor: "+ Math.floor(3.9));
		
		/*
		 반올림
		 	: 무조건 소수점 첫쨰자리에서 반올림 한다.
		 */
		System.out.println("Math.round"+Math.round(3.49999));//버림처리
		System.out.println("Math.round"+Math.round(3.54444));//올림처리
		System.out.println("Math.round"+Math.round(-1.4));
		System.out.println("Math.round"+Math.round(-1.5));
		System.out.println("Math.round"+Math.round(-3.51));
		
		//최대 최솟값
		System.out.println("Math.max:"+Math.max(100, 99));
		System.out.println("Math.min:"+Math.min(100, 99));
		
		//난수생성
		System.out.println((int)(Math.random()*45)+1);
	}

}
