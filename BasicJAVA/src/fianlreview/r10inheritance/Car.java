package fianlreview.r10inheritance;
/*
자동차를 표현하는 클래스
	1.기본속성(멤버변수)
		차주, 차량번호, 속도, 연료 
	 
	2.멤버변수 초기화(생성자)   
	  
	3.기능(멤버메소드)
	  	브레이크 : 속도가 -20줄어든다. 연료소모는 없다. 
	  	엑셀레이터 : 속도가 증가한다. 연료소모는 -20
	  	주유(연료보충) : 전달된 매개변수만큼 보충함.
	4.제한조건(연습문제)
	   속도 : 0~200km/h 즉 음수가 될수없고, 200을 초과할수 없음
	   연료 : 0~100ℓ
	   
	   -멤버메소드 주유, 브레이크, 엑셀에 제한조건을 충족할수
	   있는 조건식을 삽입하시오.
 */

public class Car {
	
	String owner; //차주인
	String carNumber; //차량번호
	private int speed; //속도
	private int fuel; //연료
	
	//문제에서 주어진 제약조건은 정해진 값이므로 상수로 선언한다.
	final int MAX_SPEED = 200;
	final int MAX_FUEL = 100;
	
	//생성자
	
	public Car() {}
	public Car(String owner, String carNumber, int speed, int fuel) {
		
		this.owner = owner;
		this.carNumber = carNumber;
		this.speed = speed;
		this.fuel = fuel;
		
	}
	
	//getter/setter

	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public String getCarNumber() {
		return carNumber;
	}



	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getFuel() {
		return fuel;
	}



	public void setFuel(int fuel) {
		
		this.fuel = fuel;
	}



	public int getMAX_SPEED() {
		return MAX_SPEED;
	}



	public int getMAX_FUEL() {
		return MAX_FUEL;
	}
	
	//멤버메소드
	
	//브레에크: 속도가 줄어듬 연료소모 없다
	public void breaking() {
		speed -= 20; //속도 20감소
		
		if(speed<0) {
			System.out.println("속도는 음수가 될수 없습니다.");
			speed = 0;
			System.out.println("브레이크:속도 0Km/h");
		}
		else {
			System.out.println("브레이크:속도 20Km/h 감소");
		}
	}

	//엑셀레이터 속도 증가 연료소모-20
	public void accelerator() {
		
		//연료가 없다면 주행불가
		if(fuel<=0) {
			System.out.println("연료가 없으므로 주행할수 없습니다.");
			return;
		}
		else {	
			//속도증가, 연료감소
			speed += 20;
			fuel -= 20;
			
			//연료부족시에도 주행불가
			if(fuel < 0) {
				System.out.println("연료가 부족하므로 주행할수 없습니다.");
				speed = 0;
				fuel = 0;
				return;
			}
			
			//현재속도가 최대치를 초과하는지 검증
			if(speed>MAX_SPEED) {
				System.out.println("최대속도를 초과하여 고정됩니다.");
				speed = MAX_SPEED;
			}
			
			System.out.println("엑셀레이터:속도 20Km/h 증가");
			System.out.println("연료 20ℓ 감소");
		}
	}
	
  	//주유(연료보충) : 전달된 매개변수만큼 보충함.
	public void refueling(int amount) {
		
		fuel += amount;
		
		//주유시 최대치를 초과하는지 검증
		if(fuel>MAX_FUEL) {
			System.out.println("연료의 최대치 "+ MAX_FUEL 
					+"을 초과하였습니다.");
			//최대치를 초과한 경우 최대값으로 값을 맞춰준다.
			fuel = MAX_FUEL;
		}
		
		System.out.println(amount +"만큼 주유되었습니다.");
	}

	
	public void showCarInfo() {
		System.out.printf("차주:%s \n차량번호:%s \n연료:%d \n속도:%d \n",owner,carNumber,fuel,speed);
	}
	
	//주유 전달된 매개변수만큼 보충
	//=> setter()메소드로 대체한다.

}
