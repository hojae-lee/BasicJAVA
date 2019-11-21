package ex16exception;

import java.io.IOException;

/*
예외처리방법2]
	예외가 발생한 위치에서 예외를 직접 처리한다.
*/
public class ExceptionCase2 {

	static void compileFunc() {
		
		try {
			System.out.print("하나의 문자를 입력하세요: ");
			int userChar = System.in.read();
			System.out.println("입력된문자는: "+(char)userChar);
		} 
		catch (IOException e) {
			System.out.println("IO 예외가 발생하였습니다.");
		}
		catch (Exception e) {
			System.out.println("알수 없는 예외가 발생하였습니다.");
		}
		
	}
	public static void main(String[] args) throws IOException {

		compileFunc();
	}

}
