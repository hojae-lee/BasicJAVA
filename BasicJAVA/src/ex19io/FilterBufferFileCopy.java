package ex19io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 버퍼필터스트림을 통한 파일 Copy
 */
public class FilterBufferFileCopy {

	public static void main(String[] args) {

		try {
			//파일 입출력을 위한 스트림 생성
			InputStream in = new FileInputStream("src/ex19io/ex19io.zip");
			OutputStream out = new FileOutputStream("src/ex19io/ex19io_copy3.zip");
			
			//파일과 JAVA사이에서 버퍼역할을 할 수 있는 버퍼필터스트림 추가 생성.
			BufferedInputStream bufIn = new BufferedInputStream(in);
			BufferedOutputStream bufOut = new BufferedOutputStream(out);
			int copyByte =0;
			int bData;
			
			while(true) {
				/*
				 버퍼필터 스트림을 통해 파일을 읽어 저장한다.
				 버퍼를 기반으로 하기 때문에 속도가 매우 빠르다.
				 */
				bData = bufIn.read();
				
				if(bData == -1) {
					break;
				}
				
				bufOut.write(bData);
				copyByte++;
			}
			
			bufIn.close();
			bufOut.close();
			System.out.println("복사된 파일크기:"+(copyByte/1024)+"Kbyte");
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
