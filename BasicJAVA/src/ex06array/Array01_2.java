package ex06array;

import java.util.Random;

public class Array01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 시나리오] 난수를 생성하여 크기가 6인 배열을 초기화 하시오.
		 (여기서는 로또번호처럼 1~45사이의 난수를 생성하여 배열을 초기화해본다.)
		 %45 하고 +1
		 */
		//난수생성방법 Math.random() 0~1사이에 랜덤
		
		double dblRandom = Math.random();
		System.out.println("생성된 난수: "+ dblRandom);
		int intRandom = (int)(dblRandom*100);
		System.out.println("정수형태로 변경된 난수: "+ intRandom);
		
		//난수생성방법2
		Random rnd = new Random();
		System.out.println("생성된 난수: "+ rnd.nextInt());
		
		/*
		로또번호처럼 1~45사이의 난수를 생성하는 방법
		1. 0.xxxx 형태의 난수를 정수로 바꾸기 위해 100(혹은 더 큰 수도 상관업승ㅁ)을 곱한 후 int로 형변환한다.
		2. 45로 %연산을 진행한다. 이 때 결과는 0~44된다.
		3. 2번의 결과에 +1한다. 결과적으로 1~45사이의 난수를 구할 수 있게 된다.
		 */
		
		System.out.println("==================================================");
		
		System.out.println("1~45사이의 난수생성 "+ ((int)((Math.random()*100%45))+1));
		
		System.out.println("==================================================");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = ((int)((Math.random()*100%45))+1);
		}
		for(int i=0; i<lottoNum.length; i++) {
			System.out.printf("%d | ", lottoNum[i]);
		}
		
	}

}
