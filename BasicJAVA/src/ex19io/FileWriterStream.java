package ex19io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterStream {

	public static void main(String[] args) {

		try {
			
			/*
			 자바는 유니코드를 기반으로 문자를 저장한다. 아래코드는 문자스트림을 기반으로 해당
			 OS의 인코딩방식에 맞춰 문자를 텍스트파일에 저장하게 된다.
			 */
			
			char ch1 = 'A';
			char ch2 = 'Z';
			
			/*
			 aplha.txt파일을 대상으로 문자 출력 스트림을 생성하고 있따.
			 만약 파일이 존재하지 않는다면 새롭게 생성한다.
			 */
			
			Writer out = new FileWriter("src/ex19io/alpha.txt");
			
			out.write(ch1);
			out.write(ch2);
			out.close();
		}catch (IOException e) {
			System.out.println("문자스트림 작업중 오류발생");
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
