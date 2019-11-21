package ex13interface;

/*
 클래스의 상속과 인터페이스의 구현을 동시에 하고 있따.
 이를 통해 C++과 같은 다중상속의 효과를 가져올 수 있따.
 단 클래스는 하나만 상속가능하다.
 */
public class Triangle extends FigureData implements Figure,Drawable{

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그립니다.");
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적(가로*세로*0.5): "+(width*height*0.5));
	}

	
	
}
