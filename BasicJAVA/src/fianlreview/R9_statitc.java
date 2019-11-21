package fianlreview;

import java.util.Scanner;

class StaticClass{
	public static Scanner scanner = new Scanner(System.in);
	
	public void inputNum() {
		int num = scanner.nextInt();
		System.out.println("입력받는 정수는:"+num);
	}
}

public class R9_statitc {

	public static void main(String[] args) {
		
		System.out.println("==main클래스에서 입력받기==");
		int num1 = StaticClass.scanner.nextInt();
		System.out.println("입력한정수"+num1);
		
		System.out.println("==StaticClass에서 입력받기==");
		new StaticClass().inputNum();

	}

}
