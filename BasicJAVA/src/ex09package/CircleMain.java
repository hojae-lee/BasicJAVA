package ex09package;

import ex09package.kosmo.area.Circle;

/*
 메인 클래스에서 다른 패키지의 클래스를 import하여 사용하려면 해당 클래스는
 반드시 public으로 선언되어야 한다.
 그렇지 않으면  "not visible"에러가 발생하게 된다.
 */

public class CircleMain {

	public static void main(String[] args) {
		
		Circle circle1= new Circle(6.5);
		System.out.println("반지름이 6.5인 원의 넓이: "+circle1.getArea());
		
		ex09package.kosmo.perimeter.Circle circle2 = new ex09package.kosmo.perimeter.Circle(4.5);
		System.out.println("반지름이 4.5인 원의 둘레: "+circle2.getArea());
		
	}

}
