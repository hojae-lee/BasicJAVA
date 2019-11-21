package ex06array;

public class TwoArray02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열의 선언과 초기화
		//1. 세로크기3, 가로크기 4인 2차원배열 선언
		
		int[][] arr2Dim = new int[3][4];
		//2. 2차원배열의 초기화. 가로/세로 반복문의 조합으로 초기값을 할당
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				arr2Dim[i][j] = i+j;
			}
		}
		
		//3. 배열의 크기만큼 루프를 돌면서 요소를 출력
		for(int n=0; n<arr2Dim.length; n++) {
			for(int m=0 ; m<arr2Dim[n].length; m++) {
				System.out.print(arr2Dim[n][m]+" ");
			}
			System.out.println();
		}
		
		/*
		 시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		 1. 2차원 배열을 선언한다. 세로2, 가로4
		 2. 난수를 이용하여 배열을 초기화한다.
		 3. 배열전체요소를 매개변수로 전달된 정수만큼 증가시킨다.
		 4. 증가되기 전, 후 배열을 출력한다.
		 5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */
	
		int[][] twoArray = new int[2][4];
		for(int i=0; i<twoArray.length; i++) {
			for(int j=0; j<twoArray.length; j++) {
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("=초기화후=================================");
		showArray(twoArray);
		
		twoDimPlus(twoArray, 10);
		
		System.out.println("=메소드호출 후===========================");
		showArray(twoArray);
		
		
	}
	
	//2차원배열을 출력하기 위한 메소드
			static void showArray(int[][] arr2) {
				for(int i=0; i<arr2.length; i++) {
					for(int j=0; j<arr2[i].length; j++) {
						System.out.printf("%-3d", arr2[i][j]);
					}
					System.out.println();
				}
			}
			
    //매개변수로 전달된 정수만큼 배열의 요소를 증가시키는 메소드
			static void twoDimPlus(int[][] arr2, int plusNum) {
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					arr2[i][j] += plusNum;
				}
			}
			}

}
