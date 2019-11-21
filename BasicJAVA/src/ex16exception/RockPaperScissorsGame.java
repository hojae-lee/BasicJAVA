package ex16exception;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void rpsGameStart() {
		// 난수생성과 사용자 입력을 위한 객체생성
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int user;
		int com;
		int cnt = 0;
		
		String[] rps = {"가위","바위","보"};
		//게임진행을 위한 무한루프 생성
	
		while(true) {
				
		System.out.println("무엇을 내시겠습니까? ");
		System.out.print("가위: 1, 바위: 2,보: 3=> ");
		user = scanner.nextInt();
		com = random.nextInt(3)+1; //0~2 +1 => 1~3

		//승부판단 로직 추가
		if(user>3 || user <1) {
			System.out.println("가위바위보 할줄 모르세요?? 제대로 내세요 ^^;");
			continue;
		}

		if(user==com) {
			System.out.print("사용자 : "+rps[user-1]+" "+"컴퓨터: "+rps[com-1]);
			System.out.println("\n비겼습니다.");
			cnt++;
			System.out.println(cnt+"번째게임");
		}
		else if(user==1 && com ==2 || user ==2 && com== 3 || user == 3 && com ==1) {
			System.out.print("사용자 : "+rps[user-1]+" "+"컴퓨터: "+rps[com-1]);
			System.out.println("\n컴퓨터승리");
			cnt++;
			System.out.println(cnt+"번째게임");
		}
		else if(user==1 && com ==3 || user ==2 && com ==1 || user == 3 && com ==2) {
			System.out.print("사용자 : "+rps[user-1]+" "+"컴퓨터: "+rps[com-1]);
			System.out.println("\n유저승리");
			cnt++;
			System.out.println(cnt+"번째게임");
		}
		
		if(cnt==5) {
			int inputNum;
			while(true) {
			System.out.println("\n\n종료:0, 게임계속: 1");
			inputNum = scanner.nextInt();
			//종료를 위해 0입을 입력했다면 루프 탈출
			if(inputNum ==0||inputNum==1) {
				break;
			}
			else {
				System.out.println("잘못입력 다시입력하세요\n\n");
			}
			}
			if(inputNum ==0) {
				break;
			}
			cnt = 0;
			
		}
		}
		
	}
	
	public static void main(String[] args) {

		rpsGameStart();
		
	}

}
