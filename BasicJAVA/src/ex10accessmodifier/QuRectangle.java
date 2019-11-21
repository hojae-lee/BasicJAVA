package ex10accessmodifier;


class Rectangle {
	
	private int ulx, uly;
	private int lrx, lry;
	private boolean b = true;
	
	public Rectangle() {}
	
	public Rectangle(int ulx, int uly, int lrx, int lry) {
		
		
		if((ulx<0 ||ulx>100) || (uly<0 ||uly>100)) {
			b =false;
			System.out.println("좌상단 좌표가 잘못되었습니다.");
		}
		
		else {
			this.ulx = ulx;
			this.uly = uly;
			
		}
		
		if((lrx<0 || lrx>100) || (lry<0 || lry>100))
			{
			b = false;
			System.out.println("우하단 좌표가 잘못되었습니다.");
			}
		
		else {
			this.lrx = lrx;
			this.lry = lry;
		}
		
		if(ulx>lrx || uly>lry) {
			b = false;
			System.out.println("좌측 우측 지정이 잘못되었습니다.");
		}
		
		else {
			this.ulx = ulx;
			this.uly = uly;
			this.lrx = lrx;
			this.lry = lry;
		}
	}
	
	public void showArea() {
		if(b == false) {
			System.out.println("좌표값 오류로 넓이를 계산할 수 없습니다.");
		}
		else
		System.out.printf("넓이 : %d", (lrx-ulx)*(lry-uly));
		System.out.println();
	}
	
}

public class QuRectangle {

	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle();
		Rectangle rec1 = new Rectangle(1, 1, 10, 10);
		rec1.showArea();
		System.out.println();
		
		Rectangle rec2 = new Rectangle(-2, -2, 101, 101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10, 10, 1, 1);
		rec3.showArea();
	}

}


