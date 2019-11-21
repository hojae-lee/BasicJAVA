package fianlreview.r10inheritance;

public class Navigation {
	
	String productName;
	
	public Navigation(String p) {
		this.productName = p;
	}
	
	public void showNaviInfo() {
		System.out.println("네비 제조사:"+ productName);
		System.out.println("길안내를 시작합니다.");
	}

}
