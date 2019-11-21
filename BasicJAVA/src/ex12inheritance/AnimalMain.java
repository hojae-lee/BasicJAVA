package ex12inheritance;

public class AnimalMain {

	public static void main(String[] args) {

		AnimalDog dog = new AnimalDog("포유류",2,"수컷","포메라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("======================================");
		dog.bark();
		System.out.println("======================================");
		dog.showDog();
		
	}

}
