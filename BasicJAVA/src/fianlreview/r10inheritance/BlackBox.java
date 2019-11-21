package fianlreview.r10inheritance;

public class BlackBox {
	
	String mCapacity;
	
	public BlackBox(String m) {
		this.mCapacity = m;
	}
	
	public void showBoxInfo() {
		System.out.println("블랙박스 메모리용량:"+ mCapacity);
		System.out.println();
	}

}
