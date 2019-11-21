package ex07string;

public class QuTwoDimArray {

	public static void main(String[] args) {

		int[][] twoArray = new int[3][3];
		int num = 1;
		
		System.out.println("증가전 값 ");
		for(int i=0; i<twoArray.length; i++) {
			for(int j=0; j<twoArray[0].length; j++) {
				twoArray[i][j] = num;
				System.out.print(twoArray[i][j]+"  ");
				num++;
			}
			System.out.println();
		}
		
		addOneArr(twoArray,2);
	}
	
	public static void addOneArr(int[][] arr, int add)
	{
		System.out.println("증가 후 값 ");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++) {
				arr[i][j]+=add;
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
