package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		문제2
		
		System.out.println("아무 문자나 입력하세요");
		char asciis = (char)System.in.read();
		
		String numResult = (asciis>='0' && asciis<='9') ? "숫자임":"숫자아님";
		
		System.out.println(numResult);

	}

}
