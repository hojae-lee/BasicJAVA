package quiz;

import java.util.Scanner;

public class QuUpDownGame {
	
	public static void Updowngname() {
		
		System.out.println("컴퓨터는 1~100사이의 숫자 하나를 생성한다.");	
		Scanner sc = new Scanner(System.in);
		int userNumber;
		int inputNum;
		
		while(true) {
			int com = (int)(Math.random()*100+1);
		
		for(int cnt = 1; cnt < 8; cnt++) {
			
			System.out.println("===1~100까지 숫자를 입력===");
			userNumber = sc.nextInt();
			if(userNumber<1 || userNumber>100) {
				System.out.println("범위를 벗어났습니다.");
				continue;
			}
			else if(userNumber<com) {
				System.out.println("입력한 "+userNumber+"보다 큽니다.");
			}
			else if(userNumber>com) {
				System.out.println("입력한 "+userNumber+"보다 낮습니다.");
			}
			else if(userNumber==com){
				System.out.println("성공!");
				System.out.println("컴퓨터에 숫자는 "+com+" 입니다.");
				break;
			}
			if(cnt==7) {
				System.out.println("실패");
				System.out.println("컴퓨터에 숫자는 "+com+" 입니다.");
				break;
			}
		}
		
		while(true) {
			System.out.println("종료: 0" + " 재시작: 1");
			inputNum = sc.nextInt();
		if(inputNum==1) {
			System.out.println("게임 재시작");
			break;
		}
		else if(inputNum ==0) {
			break;
		}
		else {
			System.out.println("다시 입력해주세요");
		}
		}
		if(inputNum==0) {
			System.out.println("종료하겠습니다.");
			break;
		}
	}
		
	}

	public static void main(String[] args) {
		
		Updowngname();
		
	}

}
