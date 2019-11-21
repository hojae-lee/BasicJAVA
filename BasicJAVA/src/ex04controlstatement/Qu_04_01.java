package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		문제1
//		
		System.out.println("아무 문자나 입력하세요");
		char ascii = (char)System.in.read();
		
		if(ascii>='0' && ascii<='9') {
			System.out.println("숫자");
			if(ascii%2==0) {
				System.out.println("2의 배수입니다.");
			}
		}
		else {
			System.out.println("우어엉");
		}
			
	}

}