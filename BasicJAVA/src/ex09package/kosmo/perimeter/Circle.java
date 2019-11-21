package ex09package.kosmo.perimeter;

public class Circle {
	
	double r;
	final double PI;
	
	public Circle(double r) {
		this.r = r;
		PI = 3.14159;
	}

	public double getArea() {
		
		return 2*r*PI;
	}
}
