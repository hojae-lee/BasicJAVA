package quiz;

import java.util.Random;

public class QuBubbleSort {

	public static void Bubble() {
		
		Random random = new Random();
		int nansu[] = new int[10];
		int randomCnt = 0; //중복제거 횟수
		int temp;		
		
		System.out.println("난수를 생성하겠습니다.");
		for(int i=0; i<nansu.length; i++) {
			nansu[i] = random.nextInt(99)+1;
			for(int j=0; j<i; j++) {
				if(nansu[j]==nansu[i]) {
					i--;
					randomCnt++;
					break;
				}
			}
		}
		System.out.println(randomCnt);
		
		for(int i=0; i<nansu.length; i++) {
			System.out.print(nansu[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("\n=============버블정렬===============\n");
		for(int i=0; i<nansu.length-1; i++) {
			for(int j=0; j<nansu.length-i-1; j++) {
				if(nansu[j]>nansu[j+1]) {
					temp = nansu[j];
					nansu[j] = nansu[j+1];
					nansu[j+1] = temp;
				}
			}
		}
		System.out.print("버블 정렬 후: ");
		for(int i=0; i<nansu.length; i++) {
			System.out.print(nansu[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {

		Bubble();
	}

}