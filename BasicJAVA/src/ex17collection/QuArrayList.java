package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<Student>();
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println("검색할 이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		int index = -1; //index는 그냥 무조건 초기값 -1
		index = list.indexOf(searchName);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).name.equals(searchName)) {
				System.out.println("[검색되었습니다.]");
				list.remove(i);
				break;
			}
			else {
				System.out.println("[검색할 이름이 없습니다.]");
				break;
			}
			
		}
//		
		
//		for(Student st: list) {
//			if(st.name.equals(searchName)) {
//				index = list.indexOf(st);
//				break;
//			}
//		}
//		
//		if(index == -1) {
//			System.out.println("\n검색된 이름이 없습니다.");
//		}
//		else {
//			System.out.println("\n검색된 이름이 있습니다.");
//			System.out.println("[삭제된 객체 정보출력]");
//			list.remove(index).showInfo();
//		}
		
		System.out.println("[삭제후 정보출력]");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).name+" "+list.get(i).age+" "+list.get(i).stNumber);
		}
		
		
	}


}
