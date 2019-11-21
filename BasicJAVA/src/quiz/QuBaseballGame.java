package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame {

	void QuBaseballGameSta() {
		
		Random random = new Random();
		
		int[] com = new int[3];
		int[] user = new int[3];
		boolean flag = true;
		int strike;
		int ball;
		int out;
		int cnt;
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		while(flag) {
		
			//컴퓨터가 중복되지 않는 3개의 정수를 생성한다. 1~9까지..
			while(flag) {
				for(int i=0; i<com.length; i++) {
//					com[i] = (int)(Math.random()*9)+1;
					com[i] = random.nextInt(9)+1;
				}
				if(com[0]!=com[1]&&com[0]!=com[2]&&com[1]!=com[2]) {
					flag = false; //반복문 탈출..
				}
			}
			flag = true; //다시 초기화
			
			System.out.println("컴퓨터"+com[0]+""+com[1]+""+com[2]);
			
			//사용자가 3개의 숫자를 입력한다. 입력받은 숫자는 0보다 크고 10보다 작아야한다.
			while(flag) {
				
				int users;
				strike=0;
				ball=0;
				out=0;
				cnt=0;
				System.out.print("숫자를 입력해주세요\n");
				
				for(int i=0; i<user.length; i++) {
					users = sc.nextInt();
					if(users<0 || users>10) {
						System.out.println("1~9의 수를 다시 입력해주세요.");
					}
					else {
						user[i] = users;
					}
					
				}
				
				System.out.println(user[0]+""+user[1]+""+user[2]);
				
				for(int i =0; i<com.length; i++) {
					for(int j =0; j<user.length; j++) {
						if((i==j) && (com[i]==user[j])) {
							strike++;
							//스트라이크
						}
						else if((i!=j) && (com[i]==user[j])) {
							ball++;
							//볼
						}
						
					}
				}
				
				if(strike==0 && ball==0) {
					out++;
				}
				
				if(strike == 3) {
					flag = false;
				}
				cnt++;
				System.out.println("스트라이크: " +strike);
				System.out.println("볼: "+ball);
				System.out.println("아웃: "+out);
				System.out.println("시도한 횟수: "+ cnt);
			}
			
			flag = true;
			
			while(flag) {
				System.out.println("종료: 0" + " 재시작: 1");
				inputNum = sc.nextInt();
				
			if(inputNum==1) {
				System.out.println("게임 재시작");
				flag = true;
				break;
			}
			else if(inputNum ==0) {
				System.out.println("==게임 종료==");
				flag = false;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
			
			}
			
		}
	}
	
	public static void main(String[] args) {

		QuBaseballGame baseballgame = new QuBaseballGame();
		baseballgame.QuBaseballGameSta();

	}

}
