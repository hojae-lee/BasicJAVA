package ex19io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) {

		try {
			//버퍼로 사용할 크기가 10인 char형의 배열생성
			char[] cbuf = new char[10];
			int readCnt;
			
			//txt파일을 대상으로 문자입력 스트림을 생성
			Reader in = new FileReader("src/ex19io/alpha.txt");
			
			//배열 cbuf의 앞에서부터 최대 10개의 문자를 읽어서 저장한다.
			readCnt = in.read(cbuf, 0 , 10);
			
			for(int i=0; i<readCnt; i++) {
				//읽어드린 내용을 콘솔에 출려한다.
				System.out.println(cbuf);
			}
			in.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일없음.");
			
		}catch (IOException e) {
			System.out.println("IO오류발생");
		}
		
	}

}
