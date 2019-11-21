package fianlreview.r10inheritance;

public class SportsCar extends Car {

	String carName;
	BlackBox box;

	public SportsCar() {}
	public SportsCar(String owner, String carNumber, int speed, int fuel, String carName) {
		super(owner, carNumber, speed, fuel);
		this.carName = carName;
	}
	public SportsCar(String owner, String carNumber, int speed, int fuel, String carName,String mCap) {
		super(owner, carNumber, speed, fuel);
		this.carName = carName;
		
		//메모리용량이 공백문자가 아니라면 블랙박스 객체 생성
		if(!mCap.equals("")) {
			box = new BlackBox(mCap);
		}
	}
	
	//정보 출력
	@Override
	public void showCarInfo() {
		//부모의 메소드를 오버라이딩 해서 정의함.
		super.showCarInfo();
		System.out.println("스포츠카 이름:"+carName);
		
		//블랙박스가 장착
		if(box ==null) {
			System.out.println("블랙박스가 없습니다.");
		}
		else {
			box.showBoxInfo();
		}
	}


}
