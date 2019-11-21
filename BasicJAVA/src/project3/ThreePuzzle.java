package project3;

import java.util.Random;
import java.util.Scanner;

public class ThreePuzzle {
	
	static char temp;
	
	public static void threePuzzle() {
		
		char[][] threearrs = {{'1','2','3'},{'4','5','6'},{'7','8','x'}};
		nan(threearrs);
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
			
		while(flag) {
			
			System.out.println("=====================");
			System.out.println();
			for(int i=0; i<threearrs.length; i++) {
				for(int j=0; j<threearrs.length; j++) {
					System.out.print(threearrs[i][j]+"\t");
				}
				System.out.println();
				System.out.println();
			}
			System.out.println("=====================");
			
			System.out.println("[이동] a:LEFT d:RIGHT w:UP s: DOWN");
			System.out.println("[종료] x:Exit");
			System.out.print("키를 입력해주세요: ");
			String point = sc.nextLine();			
			
			try {
				if(point.equals("a")) {
					left(threearrs);
				}
				else if(point.equals("d")) {
					right(threearrs);
				}
				
				else if(point.equals("w")) {
					up(threearrs);
					
				}
				else if(point.equals("s")) {
					down(threearrs);
				}
				else if(point.equals("x")) {
					flag = false;
					System.out.println("종료하겠습니다.");
				}
				
				//정답일경우
				if(check(threearrs)==true) {
					System.out.println("재시작하겠습니까? (y 누르면 재시작, 나머지는 종료)");
					String end = sc.nextLine();
					
					if(end.equalsIgnoreCase("y")) {
						System.out.println("재시작하겠습니다.");
						nan(threearrs);
						continue;

					}
					else {
						System.out.println("종료하겠습니다.");
						flag = false;
					}
				}
				
			} 
			catch (Exception e) {
				System.out.println("xxxxxxxxxxxxxxxxxx");
				System.out.println("xxxxx이동불가xxxxx");
				System.out.println("xxxxxxxxxxxxxxxxxx");
			}
			
		}		
		
	}
	
	//배열을 랜덤으로 섞어주는 메소드
	public static void nan(char[][] threearrs) {
		
		Random random = new Random();
		
		for(int i=0; i<100; i++) {
			
			int ran = random.nextInt(4)+1;
			
			try {
				switch(ran) {
				
				case 1:
					left(threearrs);
					break;
				case 2:
					right(threearrs);
					break;
				case 3:
					up(threearrs);
					break;
				case 4:
					down(threearrs);
					break;
				}
				
			}
			catch (Exception e) {
			}
		}
	}
	
	//정답인지 아닌지 알려주는 메소드
	public static boolean check(char[][] threearrs) {
		
		char[][] arr = {{'1','2','3'},{'4','5','6'},{'7','8','x'}};
		
		for(int i=0; i<threearrs.length; i++) {
			for(int j=0; j<threearrs.length; j++) {
				if(arr[i][j] != threearrs[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	//왼쪽이동 메소드
	public static char[][] left(char[][] threearrs){
		
		for(int i=0; i<threearrs.length; i++) {
			for(int j=0; j<threearrs.length; j++) {
				if(threearrs[i][j] == 'x') {
					temp = threearrs[i][j-1];
					threearrs[i][j-1] = threearrs[i][j];
					threearrs[i][j] = temp;
					return threearrs;
				}
			}
		}
		
		return threearrs;
		
	}
	
	//오른쪽 이동 메소드
	public static char[][] right(char[][] threearrs){		
		
		for(int i=0; i<threearrs.length; i++) {
			for(int j=0; j<threearrs.length; j++) {
				if(threearrs[i][j] == 'x') {
					temp = threearrs[i][j+1];
					threearrs[i][j+1] = threearrs[i][j];
					threearrs[i][j] = temp;
					return threearrs;
				}
			}
		}
		return threearrs;
		
	}
	
	//위쪽 이동 메소드
	public static char[][] up(char[][] threearrs){
				
		for(int i=0; i<threearrs.length; i++) {
			for(int j=0; j<threearrs.length; j++) {
				if(threearrs[i][j] == 'x') {
					temp = threearrs[i-1][j];
					threearrs[i-1][j] = threearrs[i][j];
					threearrs[i][j] = temp;
					return threearrs;
				}
			}
		}
		return threearrs;
		
	}
	
	//아래쪽 이동 메소드
	public static char[][] down(char[][] threearrs){
		
		for(int i=0; i<threearrs.length; i++) {
			for(int j=0; j<threearrs.length; j++) {
				if(threearrs[i][j] == 'x') {
					temp = threearrs[i+1][j];
					threearrs[i+1][j] = threearrs[i][j];
					threearrs[i][j] = temp;
					return threearrs;
				}
			}
		}
		return threearrs;
		
	}

	public static void main(String[] args) {
		threePuzzle();
	}
}
