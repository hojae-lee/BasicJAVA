package ex12inheritance;

class Rectangle{
	
	int i;
	int j;

	public Rectangle(int x, int y) {
		i = x;
		j = y;
	}

	public void ShowAreaInfo() {
		System.out.println("직사각형의 면적: "+ i*j);
	}

} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
	
	//생성자 : 가로 세로가 동일마흐몰 매개변수 1개를 2개로 전달한다.
	public Square(int i) {
		super(i,i);
	}

	//멤버메소드 : 오버라이딩 처리(자동완성)
	@Override
	public void ShowAreaInfo() {
		System.out.println("정사각형의 면적: "+ i*i);
	}

}

public class QuRectangleMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
       	
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();

	}

}
