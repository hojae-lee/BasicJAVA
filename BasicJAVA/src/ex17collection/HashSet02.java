package ex17collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Person;

public class HashSet02 {

	public static void main(String[] args) {
	
		/*
		 Set<T> 컬렉션은 새로운 객체가 입력될 때 클래스에 오버라이딩된 hasCode(), equals()메소드를 통해 동일한 객체가 있는지를 판단하게 되고, 동일한 객체가 없다고
		 판단 될 때만 add()에 성공하게 된다.
		 */
		HashSet<Person> set = new HashSet<Person>();
		
		Person p1 = new Person("정우성", 30);
		Person p2 = new Person("장동건", 40);
		Person p3 = new Person("정우성", 30);
		
		/*
		 common패키지의 Person클래스에 오버라이딩된 메소드를 생성 or 제거 후ㅅ 테스트 해볼것.
		 */
		set.add(p1);
		set.add(p2);
		System.out.println(set.add(p3)); /*hashCode와 equlals가 오버라이딩 되었다면 false를 반환함.*/
		
		System.out.println("hashCode 오버라이딩 후 데이터 수:"+set.size());
		
		Iterator<Person> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getInfo());
		}
		
	}
	
}
