package quiz;

import java.util.Random;

public class RandomChoice {

	static final int RANDOM_COUNT = 1000000;//난수생성횟수
	static final int STUDENT_COUNT = 30;//학생수
	
	public static void main(String[] args) {		
		
		//51기
		String[] kosmo = {				
			"고원희","김동하","김미수","김병철","김세진","김영준",
			"김영현1","김영현2","김윤재","박서은","박승현","박지선",
			"배선정","백승연","손하슬람","안민","윤정현","이선화",
			"이용건","이재호","이종민","이지원","이환진","장윤호",
			"장혜림","정민희","정형묵","최진곤","최현석","한기욱"
		};
		//난수를 누적해서 저장할 배열
		int[] choice = new int[30];
		
		//난수생성을 위한 객체생성 및 씨드설정
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
				
		//일정횟수 반복하면서 난수생성
		for (int i=0 ; i<RANDOM_COUNT ; i++) 
		{			
			int rndNumber = random.nextInt(RANDOM_COUNT);
			//학생수 만큼의 난수생성
			int stuNumber = rndNumber % STUDENT_COUNT;
			//System.out.println("comNumber="+stuNumber);
			//생성된 난수를 배열의 인덱스로 사용하여 +1증가
			choice[stuNumber]++;
		}
		
		for (int i=0 ; i<STUDENT_COUNT ; i++) {			
			System.out.printf("%s[%d] = %d\n", kosmo[i], i, choice[i]);
		}
		
		int max=0;
		int maxIndex=-1;
		//배열에서 가장 큰값 찾기
		for (int i=0 ; i<STUDENT_COUNT ; i++) {			
			if(max<choice[i]) {
				max = choice[i];	
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println("선택된사람 : "+kosmo[maxIndex]);

	}

}