package ex13interface;

/*
 두개의 인터페이스를 동시에 구현하고 있따.
 여러개의 인터페이스를 구현할떄는 , 콤마로 구분한다.
 */
public class Circle implements Figure, Drawable{

	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다.");
	}

	//Math.PI 상수형태로 원주율 저장해놈.
	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적(r*r*PI): "+radius*radius*Math.PI);
	}	
	
}
