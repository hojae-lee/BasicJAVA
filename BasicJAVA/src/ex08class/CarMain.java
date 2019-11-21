package ex08class;

public class CarMain {

	public static void main(String[] args) {
		
		//자동차1 객체 생성 : 초기화메소드1을 호출하여 고정된 값으로 초기화
		Car car1 = new Car();
		System.out.println("[초기화메소드 호출전]");
		System.out.println("car1.owner="+car1.owner);
		/*
		 객체 생성 후 초기화 하지 않은 상태에서 출력을 시도해서 
		 NullPinterException 발생됨.
		 */
//		car1.drive(); <- 에러발생
		
		System.out.println("[초기화메소드 호출 후]");
		car1.initialize(); // 고정된 내용으로 초기화됨
		car1.drive();// 운전하다
		car1.showCarInfo(); // 정보출력부분
		
		System.out.println("=======================");
		
		//자동차2 객체 생성 : 객체생성 후 멤버변수를 직접 접근하여 초기화
		Car car2 = new Car();
		car2.carGear = Car.MANUAL;
		car2.carModel = "밴틀리";
		car2.carYear =2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차 정보와 소유자정보 같이보기");
		car2.showCarInfo();
		
		//세번쨰 자동차 객체생성
		//메소드 이용하여 초기화
		Car car3 = new Car();
		car3.initialize("랜드로버", 2019, "이재호", 26, 3);
		car3.showCarInfo();
	}

}

class Car{
	
	//[멤버상수]
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	//[멤버변수]
	String carGear = AUTO;// 미션의 종류
	String carModel; // 자동차의 모델명
	int carYear;// 연식
	Human owner;// 소유주 - Human 클래스를 기반으로 하는 멤버변수로 초기화를 위해 이름 나이 에너지 세가지값이 필요함.
	
	void drive() {
		/*
		 Car클래스에 멤버변수로 Human객체가 선언된 형태로 접근방법은 동일하게 닷 . 
		 연산자를 이용한다.
		 */
		System.out.println(owner.name + "이()가 "+ carModel + "을 운전한다.");
	}
	
	/*
	 객체의 초기화를 담당하는 메소드로 아래는 항상 같은 값으로만 초기화 된다는 한계를
	 가지고 있다.
	 */
	
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	/*
	 위와 동일한 이름으로 오버로딩에 의해 정의된 메소드로 초기화를 진행하는 것은 동일하나 
	 매개변수를 통해 다양한 초기화가 가능하다.
	 */
	
	void initialize(String model,int year, String name, int age, int energy) {
		carModel = model;
		carYear = year;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		System.out.printf("연식:%d\n", carYear);
		System.out.printf("기어:%s\n", carGear);
		owner.showState();
	}
	
	
}