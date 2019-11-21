package ex07string;

public class QuNumberCounter {

	public static void main(String[] args) {

		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i = 0; i<counter.length ;i++) {
			for(int j = 0; j<answer.length;j++) {
				
				if(answer[j] == i+1) {
					
					counter[i] += 1;
					
				}
			}
			System.out.println("counter"+"["+i+"]"+"=> "+ counter[i]);
		}
	}
}