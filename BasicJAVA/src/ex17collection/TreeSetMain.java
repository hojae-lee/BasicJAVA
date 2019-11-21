package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet<T> 컬렉션
/*
 트리라는 자료구조를 기반으로 한 Set계열의 컬렉션이다.
 Set의 기본적인 특성은 동일하다. 즉 중복은 허용되지 않고 집합의 성격을 가진다.
 단 객체가 Tree알고리즘을 통해 정렬되어 저장된다. 정렬의 기준은 개발자가 직접 정의 할 수 있따.
 */

/*
 Set컬렉셩을 사용할 때 정렬의 기준을 만들어주기 위해서는 Comparable<T> 인터페이스를 구현해야하 한다.
 */
class MyString implements Comparable<MyString>{
	
	String str;
	
	public MyString(String str) {
		this.str = str;
	}
	
	public int getLength() {
		return str.length();
	}
	
	/*
	 TreeSet<T> 컬렉션에 객체를 저장할 때 정렬을 위해 compareTo() 메소드를 오버라이딩 한다.
	 정렬의 기준은 가나다와 같은 사전순, 혹은 문자열의 길이 등 다양하게 설정할 수 있따.
	 아래 코드는 오름차순(작은것->큰것) 정렬일 떄 사용한다.
	 1과 -1의 위치가 바뀌면 내림차순이 된다.
	 */
	@Override
	public int compareTo(MyString paramStr) {

		if(getLength() > paramStr.getLength())
			return 1;
		else if(getLength() < paramStr.getLength())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

public class TreeSetMain {

	public static void main(String[] args) {

		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		System.out.println(tree1.add(2));//Set은 종복저장 허용하지 않음.
		
		System.out.println("저장된 데이터 수:"+ tree1.size()+"개"); //4개
		
		Iterator<Integer> itr1 = tree1.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		/*********************************************************************/
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("KOSMO50"));
		System.out.println(tree2.size());
		Iterator<MyString> itr2 = tree2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}

}
