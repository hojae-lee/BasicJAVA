package ex12inheritance;

public class QuConstructorAndSuper {

	public static void main(String[] args) {

		HybridWaterCar hcar = new HybridWaterCar (10,20,30);
		hcar.showNowGauge();
		
	}

}

class Car {

	int gasoline;
}

class HybridCar extends Car{
	
	int electric;
}

class HybridWaterCar extends HybridCar{
	
	int water;
       	
	public HybridWaterCar(int gasoline, int electric, int water) {
		
		this.gasoline = gasoline;
		this.electric = electric;
		this.water = water;
		
	}



	public void showNowGauge(){
			
		System.out.println("남은가솔린:"+gasoline);
		System.out.println("남은전기량:"+electric);
		System.out.println("남은워터량:"+water);
                 	
       	}

}
