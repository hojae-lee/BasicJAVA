package common;

public class Person {

	public String name;
	public int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//정보 반환 메소드
	public String getInfo() {
		return String.format("이름:%s, 나이:%d", name, age);
	}
	//정보 출력 메소드
	public void showInfo() {
		System.out.println(getInfo());
	}

	/*
	 이클립스의 자동생성 메뉴를 이용하여 생성된 오버라이딩 메소드
	 */
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	/*
	 hasCode() : Object클래스에 정의된 메소드로 두 객체가 같은 객체인지 동일성을 비교한다.
	 또한 Set컬렉션과 같이 사용될떄는 컬렉션내에 저장된 객체를 검색하게 된다.
	 */
	@Override
	public int hashCode() {
		return age % 3;
	}
	
	/*
	 equals() : 두 객체간의 동일성을 
	 */
	@Override
	public boolean equals(Object obj) {

		Person comparePerson = (Person)obj;
		
		System.out.println("오버라이딩한 equals()호출됨 :" +name);
		
		if(comparePerson.age == this.age && comparePerson.name.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
}
