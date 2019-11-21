package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
 Hashset : set계열의 인터페이스를 구현한 컬렉션으로 
 - 객체가 순서없이 저장된다.
 - 객체의 중복저장을 기본적으로 허용하지 않는다.
 	단, 새롭게 정의한 클래스라면 hasCode, equals 메소드를 적절히 오버라이딩 처리해야한다.
 - List가 배열의 성격을 띈다면 Set은 집합의 성격을 가진다.
 */

public class HashSet01 {

	public static void main(String[] args) {

		/*
		 1] set컬렉션 생성
		 : 생성시 제네릭을 지정하지 않거나 Object로 지정하면 모든 클래스의 인스턴스를 저장할 수 있는 컬렉션이 된다.
		 */
		HashSet<Object> set = new HashSet<Object>();
		
		//2] 다양한 객체 생성
		String strObject1 = "JAVA";
		String strObject2 = new String("KOSMO50기");
		Date dateObject = new Date();
		int number = 100;
		Teacher teacher = new Teacher("김봉두", 55, "체육");
		
		/*
		 3] 컬렉션에 객체 저장 - boolean add(객체)
		 	: 정상적으로 저장되면 true를 한다.
		 */
		System.out.println(set.add(strObject1));
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);
		set.add(teacher);
		
		/*
		 4] 컬렉션에 저장된 객체수 얻기
		 */
		System.out.println("[중복저장전 객체수]:"+set.size());
		
		/*
		 5-1] 중복저장
		 */
		System.out.println(set.add(strObject2) ? "저장성공":"저장실패");
		System.out.println("[중복저장후 객체수]:" + set.size()); //5개
		
		/*
		 5-2] 사용자가 생성한 객체 중복저장
		 */
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)? "성공": "실패");
		System.out.println("[중복(teacher2)저장후 객체수]:"+ set.size()); //6개
		
		/*
		 6] 저장된 객체 꺼내오기 : 순서없이 저장되므로 출력도 순서를 지정할 수 없다.
		 */
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			
			if(object instanceof String) {
				System.out.println("String타입:"+ object);
			}
			else if(object instanceof Date) {
				System.out.println("Date타입:"+ object);
			}
			else if(object instanceof Integer) {
				System.out.println("Integer타입: "+object);
			}
			else if(object instanceof Teacher) {
				System.out.println("Teacher타입: "+((Teacher)object).getInfo());
			}
			else {
				System.out.println("넌 뭐임??");
			}
		}
		
		System.out.println(set.contains(strObject1) ? "strObject1있다" : "strObject1없다.");
		System.out.println(set.contains(number) ? "number있다": "number없다");
		System.out.println(set.contains("JaVa")? "JaVa있따." : "JaVa없다");
		
		System.out.println(set.remove(strObject2) ? "strObject2삭제성공" : "strObject2삭제실패");
		System.out.println(set.remove("Android")? "Android삭제성공" : "Android삭제실패");
		System.out.println("[삭제 후 객체수]:"+set.size());
		
		//set.clear();
		System.out.println("전체삭제"+set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수]:"+ set.size());
		
	}

}
