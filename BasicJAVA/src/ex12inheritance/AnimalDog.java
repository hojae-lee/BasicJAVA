package ex12inheritance;

/*
 강아지를 표현한 클래스
 Dog is a Animal이 성립
 멤버변수 
 강아지의 종류 푸들, 포매라라니안 등 -> dogKind
 이름 - > name
 멤버메소드 
 bark()  짖는것
 출력결과 이름이xx이고 종이 yy인 강아지가 짖는다.
 showDog() 강아지의 현재상태를 출력하는 메소드
 인자생성자
 부모클래스까지 초기화 할수 있또록 구성할것.
 */
public class AnimalDog extends Animal{

	String dogkind;
	String name;
	
	public AnimalDog(String species, int age, String gender, String dogkind, String name) {
		super(species,age,gender); //부모의 생성자를 먼저 호출하여 초기화한다.
		this.dogkind = dogkind;
		this.name = name;
	}
	
	public void bark() {
		System.out.println("이름이 "+name+"이고 "+"종이 "+getSpecies()+"인 "
				+ "강아지가 짖는다");
	}
	
	public void showDog() {
		/*
		 부모클래스에 정의된 메소드를 호출할때에도 super를 사용한다.
		 */
		showAnimal();
		System.out.println("이름: "+name+"   |"+" 종: "+dogkind );
	}
	
}
