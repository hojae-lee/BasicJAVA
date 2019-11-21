package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 ArrayList : List계열의 컬렉션으로
 	-데이터의 중복 저장이 가능하다
 	-데이터의 저장 순서를 보장한다.
 	-데이터에 접근할떄 iterator()혹은 get(index)를 이용한다.
 	-Array라는 이름처럼 배열의 특성을 가지고 있어 인덱스를 통한 접근도 가능하다.
 */
public class ArrayList01 {

	public static void main(String[] args) {

		/*
		 1] List 계열의 컬렉션 객체 생성
		 	: ArrayList<T>와 같이 컬렉션은 제네릭을 기반으로 하지만 아래와 같이 <T>부분을 생략하면 모든 객체를 저장할수 있는
		 	컬렉션이 생서된다. 즉 <Object> 한 것과 같다.
		 */
		ArrayList list = new ArrayList();
		
		/*
		 1-1] 객체저장 : add()메소드
		 	list.add(객체) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여함
		 	list.add(인덱스, 객체) : 인덱스를 직접 부여할 수 있으나, 만약 인덱스를 건너뛰게 되면 예외가 발생한다.
		 	
		 	list.size() : 현재 저장된 객체의 갯수 반환.
		 */
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"소방챀ㅋ");
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "방탄소년단");
		System.out.println("중복 저장전 객체수: " + list.size());
		
		/*
		 1-2] 중복저장
		 	List는 배열의 속성을 가지므로 중복저장이 허용된다.
		 	add()메소드로 입력에 성공하면 true가 반환된다.
		 */
		System.out.println(list.add("트와이스")?"중복저장됨":"중복저장안됨");
		System.out.println("중복 저장후 객체수: "+list.size());
		
		/*
		 1-3] 리스트 컬렉션 출력하기(for, 확장for문)
		 */
		System.out.println("\n[일반for문 사용]");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		
		System.out.println("\n[확장for문 사용]");
		for(Object obj : list) {
			System.out.print(obj+" ");
		}
		
		/*
		 Iterator 사용법
		 - 컬렉션에 저장된 내용을 이터레이터에게 알려준다. 즉 컬렉션과 이터레이터()메소드를 통해 객체를 생성한다.
		 - hasNext()메소드로 반환할 객체가 있는지 검사하고 next()메소드로 해당 객체를 반환한다.
		 - 만약 반환할 객체가 없다면 false를 반환한다.
		 */
		System.out.println("\n반복자(Iterator) 사용");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		/*
		 1-4] 덮어쓰기
		 	set(인덱스,객체) : 특정 인덱스에 저장된 데이터를 덮어쓰게 되므로 기존자료는 삭제되고 새로운 값으로
		 	대체된다.
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.print(obj+" ");
		}
		
		System.out.println("\n===========================\n");
		
		/*
		 1-5] 끼워넣기
		 	add()메소드로 추가하면 해당위치에 삽입이 되고 기존 데이터는 뒤로 밀려난다.
		 */
		
		list.add(4, "블랙핑크>끼워넣기");
		for(Object obj : list) {
			System.out.print(obj+ " ");
		}
		System.out.println("\n===========================\n");
		
		/*
		 1-6] 검색
		 	contains(객체명) : 찾고자 하는 객체가 있을경우 true를 반환한다.
		 */
		System.out.println(list.contains("빅뱅") ? "빅뱅 있음": "빅뱅 없음");
		System.out.println(list.contains("블랙핑크") ? "블랙핑크 있음": "블랙핑크 없음");
		
		/*
		 1-7] 삭제
		 방법1 : 인덱스로 삭제하기.
		 
		 remove(인덱스) : 인덱스를 통해서 삭제를 진행 후 삭제가 완료 되며 해당 객체를 반환한다. 삭제 후에는
		 인덱스가 자동으로 재부여 된다.
		 */
		Object obj = list.remove(2);
		System.out.println("삭제된 객체"+obj);
		
		//방버2 : 객체의 위치를 찾은 후 삭제
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index ="+ index);
		list.remove(index);
		
		//방법3 : 인스턴스의 참조값(주소)을 통해 삭제
		System.out.println(list.remove("방탄소년단") ? "삭제성공":"삭제실패");
		list.remove("오마이걸");
		System.out.println("삭제후 출력");
		for(Object ob : list) {
			System.out.print(ob + " ");
		}
		System.out.println();
		
		/*
		 * 1-8] 전체삭제
		 */
		list.removeAll(list); //방법1
		list.clear(); // 방법2
		System.out.println("전체삭제후 객체수:"+list.size());
		
	}

}
