package ex17collection;

import java.util.ArrayList;

import common.Teacher;

public class TeacherArrayList {

	public static void main(String[] args) {
		
		ArrayList<Teacher> list = new ArrayList<Teacher>();
		
		Teacher tc1 = new Teacher("김선생", 35, "디비");
		Teacher tc2 = new Teacher("이선생", 45, "소공");
		Teacher tc3 = new Teacher("박선생", 25, "넽워");
		Teacher tc4 = new Teacher("최선생", 15, "자바");
		Teacher tc5 = new Teacher("정선생", 35, "전자");

		list.add(tc1);
		list.add(tc2);
		list.add(tc3);
		list.add(tc4);
		list.add(tc5);
		
		for(Teacher tc : list) {
			tc.showInfo();
		}
		System.out.println();
		
		list.remove(2);
		for(Teacher tc : list) {
			tc.showInfo();
		}
		System.out.println();
		
		list.add(tc5);
		for(Teacher tc : list) {
			tc.showInfo();
		}
		System.out.println();
		
		list.add(2, tc1); //인덱스 2에 tc1녀석을 추가. 자동으로 밀려남.
		for(Teacher tc : list) {
			tc.showInfo();
		}
		System.out.println();
		
		System.out.println("삭제된 녀석의 이름: "+list.remove(1).name);
		for(Teacher tc : list) {
			tc.showInfo();
		}
		
	}
	
}
