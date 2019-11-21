package ex07string;

public class QuTwoDimLotate {

	public static void main(String[] args) {

		int[][] twoArray = new int[3][3];
		int num = 1;
		
		System.out.println("변환 전");
		for(int i=0; i<twoArray.length; i++) {
			for(int j=0; j<twoArray[0].length; j++) {
				twoArray[i][j] = num;
				System.out.print(twoArray[i][j]+"  ");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("변환 후");
		rotateArray(twoArray);
		
	}
	
	static void rotateArray(int[][] arr) {
		int[] temp = new int[3];
		for(int i = 0; i<arr[2].length; i++) {
			temp[i] = arr[2][i]; 
			System.out.print(temp[i]+"  ");
		}
		System.out.println();
		for(int i = 0; i<arr[2].length; i++) {
			temp[i] = arr[0][i]; 
			System.out.print(temp[i]+"  ");
		}
		System.out.println();
		for(int i = 0; i<arr[2].length; i++) {
			temp[i] = arr[1][i]; 
			System.out.print(temp[i]+"  ");
		}
		
	}

}
