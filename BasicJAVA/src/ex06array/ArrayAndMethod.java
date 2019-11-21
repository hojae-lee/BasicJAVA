package ex06array;

public class ArrayAndMethod {
	
	public static void main(String[] args) {
	
		/*
		 배열의 선언과 동시에 초기화(요소의 갯수에 의해 크기 결정됨)
		 */
		
		int[] arr= {1,2,3,4,5};
		int[] ref;
		System.out.println("초기화 직후 출력");
		//arr.length로 배열의 크기 반환하여 출력
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*
		 배열명을 매개변수로 전달하는 것은 배열의 참조 값을 전달하게 된다.
		 */
		ref = addAllArray(arr,7);
		
		System.out.println("메소드 호출후 출력");
		/*
		 배열변수 ref로 출력하는 것과 arr로 출력하는 것은 동일한 결과가 나오게 된다.
		 */
		
		for(int i =0; i<ref.length; i++){
			System.out.print(ref[i]+" ");
		}
		
		System.out.println();
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i<ar.length; i++) {
			//addVal만큼 배열의 요소값을 증가시킨다.
			ar[i] += addVal;
		}
		return ar;
	}
}
