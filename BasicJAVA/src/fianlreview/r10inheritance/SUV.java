package fianlreview.r10inheritance;

public class SUV extends Car {

	//자식에서 확장한 멤버변수
	String suvName;
	/*
	 차량용품은 자동차와는 is a관계가 성립하는 형태가 아니므로 이런경우는 has a 관계를 적용하여 포함관계로 정의해주는 것이 좋다.
	 */
	Navigation navi;

	public SUV() {}

	public SUV(String owner, String carNumber, int speed, int fuel,String suvName) {
		super(owner, carNumber, speed, fuel);
		this.suvName = suvName;
	}
	
	
	
	public SUV(String owner, String carNumber, int speed, int fuel,String suvName,String pName) {
		super(owner, carNumber, speed, fuel);
		this.suvName = suvName;
		if(!pName.equals("")) {
			navi = new Navigation(pName);
		}
	}

	@Override
	public void showCarInfo() {
		// TODO Auto-generated method stub
		super.showCarInfo();
		System.out.println("SUV명:"+suvName);
		
		if(navi ==null) {
			System.out.println("네이게이션이 장착되지 않음");
		}
		else {
			navi.showNaviInfo();
		}
	}
	
}
