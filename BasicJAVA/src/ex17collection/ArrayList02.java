package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

import common.Student;

public class ArrayList02 {

	public static void main(String[] args) {
	
		//List계열의 컬렉션 생성새 <T>제네릭 부분 지정함.
		ArrayList<Student> list2 = new ArrayList<Student>();
		//LinkedList<Student> list2 = new LinkedList<Student>();
		
		//개발자가 정의한 Student 인스턴스생성(외부패키지)
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		
		//컬렉션에 인스턴스 추가(저장)
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st2);/*객체의 중복저장 : List계열의 컬렉션은 중복저장을 허용한다.*/
		
		System.out.println("[중복저장후]");
		for(Student st : list2)
			st.showInfo();
		System.out.println();
		
		//인스턴스삭제 : 인덱스가 빠른 하나만 삭제된다. 즉 여기서는 인덱스1의 인스턴스만 삭제된다.
		list2.remove(st2);
		System.out.println("[중복 저장된 객체 삭제후]");
		for(Student st : list2)
			st.showInfo();
		System.out.println();
		
		System.out.println("[반복자 사용]");

		Iterator<Student> it2 = list2.iterator();
		while(it2.hasNext()) {
//			it2.next().showInfo();
			/*
			 위와 동일한 문장임. 즉 next()메소드를 통해서
			 */
			Student student = it2.next();
			student.showInfo();
		}
		System.out.println();
		
		//List계열의 컬렉션은 인덱스로 접근 가능함.
		System.out.println("[일반 for문 사용]");
		for(int i=0; i<list2.size(); i++)
			list2.get(i).showInfo();
		System.out.println();
		
		System.out.println("[확장 for문 사용]");
		for(Student st : list2) {
			st.showInfo();
		}
		
		System.out.println();
		
		//인덱스를 통한 삭제
		System.out.println("삭제된 객체의 이름: "+list2.remove(2).name);
		//인스턴스 참조값을 통한 삭제
		list2.remove(st1);
		System.out.println("[인스턴스 삭제후]");
		for(Student st : list2)
			st.showInfo();

	}
	
}
