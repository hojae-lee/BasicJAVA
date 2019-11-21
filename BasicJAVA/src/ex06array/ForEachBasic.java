package ex06array;

public class ForEachBasic {
/*
 for-each문
 	: 배열의 일부가 아니라 전체를 참조해야 할 때 주로 사용하는 개선된 for문이다.
 	배열의 요소를 참조형태로 가져와서 출력한다.
 	그러므로 참조의 목적으로만 사용해야 하고 값의 변경은 기본적으로 허용하지 않는다.
 	형식] 
 		for(자료형 참조변수 : 배열의 이름){
 		실행문장;
 		[참조변수를 통해 배열의 각 요소값 출력가능]
 		}
 */
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("기본 for문을 이용한 합계: "+sum);
		
		sum = 0;
		for(int e: arr) {
			/*
			 배열 arr의 요소를 하나씩 참조하여 출력함.
			 더 이상 참조할 요소가 없을 때 for문 종료됨.
			 */
			System.out.print(e+" ");
			sum += e;
		}
		System.out.println("\nfor-each문을 이용한 합계: "+sum);
		
		System.out.println("배열arr의 요소값 1 증가시키기");
		for(int b: arr) {
			/*
			 참조형태로 각 요소를 가져와서 변수b에 할당하는 형식이므로 아래 증가연산자를 통해
			 증가하는 것은 실제 배열에 적용되지 않는다. 해당 for-each문 내에서만 증가하게 된다.
			 */
		b++;
		System.out.print(b+ " ");
		}
		System.out.println();
		System.out.println("배열arr의 요소 재출력하기");
		for(int c :arr) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n2차원 배열을 for-each문으로 출력하기");
		int[][] twoDim = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400}
				
		};
		//2차원배열에서 우선 하나의 행을 가져온다.
		for(int[] a : twoDim) {
			//위에서 가져온 행에서 요소를 하나씩 참조하여 출력한다.
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}

}
