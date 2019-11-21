package common;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("이아이",30);
		p1.showInfo();
		
		Person p2 = new Student("이구아나",30,"으억이");
		p2.showInfo();
		
		Person p3 = new Teacher("으악이", 40, "으악으악");
		p3.showInfo();
	}

}
