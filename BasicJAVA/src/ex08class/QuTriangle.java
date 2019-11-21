package ex08class;

public class QuTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());

	}

}

class Triangle{
	
	int height;
	int bottom;

	public void init(int height, int bottom) {
		this.height = height;
		this.bottom = bottom;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	
	public double getArea() {
		
		return (height*bottom)/2;
	}
	
	
}