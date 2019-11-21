package ex08class;

public class Ex {

	public static void main(String[] args) {

		Exx ex = new Exx();
		
		ex.drive("아무나","티코");
		
		ex.init("티코", 2017);
		ex.showCarInfo();
		
	}

}

class Exx {
	
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	String name;
	String carGear = MANUAL;
	String carModel; 
	int carYear;
	
	void drive(String name, String carModel) {
		
		System.out.println(name+"가 "+carModel+"를 운전합니다.");
		
	}
	
	void init(String carModel,int carYear) {
		
		this.carModel = carModel;
		this.carYear = carYear;
		
	}
	
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		System.out.printf("연식:%d\n", carYear);
		System.out.printf("기어:%s\n", carGear);
	}
	
}