package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((heroName == null) ? 0 : heroName.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
//		return result;
//	}
	
	@Override
	public int hashCode() {
		int hc1 = name.hashCode();
		int hc2 = heroName.hashCode();
		int hc3 = weapon.hashCode();
		//Set컬렉션이 자동호출 하는 시점확인
		System.out.println(hc1+" "+hc2+" "+hc3);
		int result = hc1+ hc2+ hc3;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Avengers avengers = (Avengers)obj;
		//Set컬렉션이 자동호출 하는 시점 확인
		System.out.println("중복 제거용 equals() 메소드 호출");
		if(avengers.name.equals(this.name)&& avengers.heroName.equals(this.heroName)&& avengers.weapon.equals(this.weapon)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("중복 제거용 equals() 메소드 호출");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Avengers other = (Avengers) obj;
//		if (heroName == null) {
//			if (other.heroName != null)
//				return false;
//		} else if (!heroName.equals(other.heroName))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (weapon == null) {
//			if (other.weapon != null)
//				return false;
//		} else if (!weapon.equals(other.weapon))
//			return false;
//		return true;
//	}
	
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤: ");
		String searchName = sc.nextLine();
		
		Iterator<Avengers> itr = set.iterator();
		
		while(itr.hasNext()) {
			Avengers avs = itr.next();
			
			if(avs.name.equals(searchName)) {
				System.out.println(avs.toString());
				System.out.println("요청하신 정보를 찾았습니다.");
				break;
			}
		}
		
//		Iterator itr = set.iterator();
//		
//		while(itr.hasNext()) {
//			Object object = itr.next();
//			
//			if(object instanceof Avengers) {
//				if(((Avengers) object).name.equals(searchName)) {
//					System.out.println(object.toString());
//					System.out.println("요청하신 정보를 찾았습니다.");
//				}
//			}
//			
//		}

	}
}

