package ex09package.kosmo.area;

public class Circle {
	
	double r;
	final double PI;
	
	public Circle(double r) {
		this.r = r;
		PI = 3.14159;
	}

	public double getArea() {
		
		return r*r*PI;
	}
}
