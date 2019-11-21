package ex13interface;

public class FigureDrawableMain {

	public static void main(String[] args) {

		//이질화 : 부모클래스의 참조변수로 자식클래스 인스턴스 참조.
		Figure figure = new Circle(30);
		figure.area("원");
		((Circle)figure).draw("나도 원");
		
		Figure fig1 = new Rectangle(100,90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("사각형");
		
		Drawable draw = new Triangle(100,90);
		draw.draw("삼각형");
		((Triangle)draw).draw("삼각형");
		
		//동질화
		Circle circle = new Circle(40);
		circle.draw("원");
		circle.area("나도 원");
		
	}

}
