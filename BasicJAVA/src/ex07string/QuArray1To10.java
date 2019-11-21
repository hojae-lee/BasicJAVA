package ex07string;

public class QuArray1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] junsu = new int[10];
		int sum = 0;
		
		for(int i=0; i<junsu.length; i++) {
			junsu[i] += i+1;
			System.out.println(junsu[i]);
			sum += junsu[i];
		}
		System.out.println("누적 합= "+sum);
	}

}
