package ex13interface;

import java.io.IOException;

interface Sort{
	void ascdending();
	void descending();
	void description();
	void ascending(int[] arr);
	void descending(int[] arr);
}
class BubbleSort implements Sort{

	int[] arr= null;
	@Override
	public void ascdending() {
		
	}

	@Override
	public void descending() {
		
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("QuickSort입니다");
	}

	@Override
	public void ascending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort descending");
	}
	
}

class HeapSort implements Sort{
	
	int[] arr= null;
	@Override
	public void ascdending() {
		
	}

	@Override
	public void descending() {
		
	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("QuickSort입니다");
	}

	@Override
	public void ascending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort descending");
	}
}

class QuickSort implements Sort{
	
	int[] arr= null;
	@Override
	public void ascdending() {
		
	}

	@Override
	public void descending() {
		
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("QuickSort입니다");
	}

	@Override
	public void ascending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		this.arr = arr;
		System.out.println("QuickSort descending");
	}
	
}

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬방식을 선택하시오");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch=='B' || ch=='b') {
			sort = new BubbleSort();
		}
		else if(ch=='H' || ch=='h') {
			sort = new HeapSort();
		}
		else if(ch=='Q' || ch=='q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
