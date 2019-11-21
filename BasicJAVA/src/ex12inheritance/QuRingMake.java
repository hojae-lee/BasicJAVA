package ex12inheritance;

class Point{
	
   	int xDot, yDot;
   	
   	public Point(int x, int y) {
   		
         xDot=x;
         yDot=y;
         		
   	}
   	
   	public void showPointInfo()	{
   		
         System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
         		
   	}
   	
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	
	int radian;//반지름
	Point center;
	
	public Circle(int radian, int i, int j) {
		this.radian = radian;
		center = new Point(i,j);
	}
	
	public void showPointInfo() {
		System.out.println("반지름: "+radian);
		center.showPointInfo();
	}
	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원

	public Ring(int i, int j, int k, int l, int m, int n) {

		innerCircle = new Circle(i,j,k);
		outerCircle = new Circle(l,m,n);
		
	}

	public void showRingInfo() {
		System.out.println("안쪽 원의 정보");
		innerCircle.showPointInfo();
		System.out.println("바깥쪽 원의 정보");
		outerCircle.showPointInfo();


}
}

public class QuRingMake {

	public static void main(String[] args) {

		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
		
	}

}
