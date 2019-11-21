package ex06array;

public class TwoArray02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 아래와 같이 초기화하면 세로크기는 3, 가로크기는 4로 지정된다. 초기화할 요소가 없는 부분은 null로 채워지게 된다.
		 ※ null값: 아무것도 없는 값을 일컫는다. 즉 빈 값을 말한다.
		 */
		int[] arr1 = {1,2,3,4,5};
		
		int[][] arr = {
				{1,2},{3,4,5},{6,7,8,9}
		};
		/*
		 2차원배열에서 '배열명.length'로 출력하면 세로크기가 반환된다.
		 */
		System.out.println("배열의 세로크기 "+ arr.length);
		
		/*
		 각 행의 가로크기는 초기화된 상황에 따라서 다를 수 있다.
		 0행 -> 2, 1행 -> 3, 2행 -> 4
		 */
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기: %d\n", i,arr[i].length);
		}
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]= "+arr[0][1]);//정상출력
//		
		System.out.println("arr[0][2]= "+arr[0][2]);//예외발생
//		arr[0[2]]는 null이기 때문에 출력을 시도하면
//		ArrayIndexOutOfBoundsException 예외가 발생된다.
		
	}

}
