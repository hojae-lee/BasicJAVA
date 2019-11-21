package ex19io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 스트림(Stream)
 	: IO모델의 핵심개념이랑 할수 있는 스트림은 '데이터의 흐름' 혹은 데이터 흐름을 형성해주는 통로 정도로 정의
 	할수 있따. 크게 입력(Input)스트림과 출력(Output)스트림으로 나눌 수 있따.
 */

public class ByteFileCopy {

	/*
	 IO관련 작업에서는 많은 부분에서 예외처리가 필요하다. 이 떄 예외를 외부로 throws 하는것보다
	 try~catch로 예외처리를 해주는것이 좋다. 예외를 무시하게 되면 문제가 생겼을때 적절한 조치를
	 취하기 힘들기 때무이다.
	 */
	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;
		int copyByte =0;
		
		try {
			//원본파일을 읽어오기 위한 입력스트림 생성
			in = new FileInputStream("src/ex19io/ex19io.zip");
			//복사본을 만들기 위한 출력스트림 생성
			out = new FileOutputStream("src/ex19io/ex19io_copy.zip");
			//원본에서 1byte를 읽어서 저장하기 위한 변수
			int bData;
			
			while(true) {
				//원본파일을 1byte 씩 읽어옴.
				bData = in.read();
				
				//파일의 끝까지 읽으면 -1을 반환함.
				if(bData == -1) {
					//즉 파일의 끝이면 루프를 탈출.
					break;
				}
				//읽어온 데이터를 복사본에 입력
				out.write(bData);
				copyByte++;
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
		}
		catch (IOException e) {
			System.out.println("파일스트림 생성시 오류발생됨");
		}
		finally {
			
			try {
				//입출력을 완료하면 생성한 스트림을 닫아줌.
				in.close();
				out.close();
				System.out.println("복사된 바이트크기: "+copyByte);
			} 
			catch (IOException e) {
				System.out.println("파일스트림닫기 오류");
			}
		}
		
	}

}
