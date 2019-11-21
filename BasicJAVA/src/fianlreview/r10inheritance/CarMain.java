package fianlreview.r10inheritance;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car("정우성", "12가3456", 0, 50);
		Car car2 = new Car("이정재", "98가7654", 0, 90);
		
		for(int i=1; i<=20; i++) {
			car1.accelerator(); //20번주행
		}
		car1.showCarInfo();
		
		for(int i=1; i<=15; i++) {
			car2.accelerator(); //15버주행
		}
		car2.showCarInfo();
		
		/////////////////////////////////////////////////
		SportsCar sCar1 = new SportsCar("재호랑나비", "77가7777", 0, 100, "부가티");
		sCar1.accelerator();
		sCar1.accelerator();
		sCar1.accelerator();
		sCar1.refueling(30);
		sCar1.breaking();
		sCar1.showCarInfo();
		
		SUV sCar2 = new SUV("홍길동", "11나11111", 0, 90, "스포티지", "카카오네비");
		sCar2.showCarInfo();
	}

}
