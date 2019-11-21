package ex19io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 파일에 정수/실수와 같은 데이터를 저장하는 필터스트림과 버퍼링을 제공하는 필터스트림까지
 추가적으로 연결한 후 파일을 생성하는 프로그램.
 이처럼 필터스트림은 여러개를 연결하는 것이 가능하다.
 */

public class FilterDataBufferStream {

	public static void main(String[] args) {

		String src = "src/ex19io/dataBufferStream.bin";
		
		try {
				//1. 파일 생성을 위한 출력 파일스트림 생성
				OutputStream out = new FileOutputStream(src);
				
				//2. 버퍼사용을 위한 필터스트림 생성
				BufferedOutputStream bufFileterOut = new BufferedOutputStream(out);
				
				//3.파일에 기본자료형 데이터를 저장하기 위한 필터스림 생성
				DataOutputStream dataFilterOut = new DataOutputStream(bufFileterOut);
				
				dataFilterOut.writeInt(555);
				dataFilterOut.writeDouble(55.55);
				dataFilterOut.writeInt(999);
				dataFilterOut.writeDouble(99.99);
				
				dataFilterOut.close();
				
				/*
				 각각의 스트림을 생성하지 않고 아래와 같이 한번의 선언으로 생성하는것도 가능하다.
				 */
				
				DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
				
				//각각의 데이터를 읽어옴
				int intNum1 = dataFilterIn.readInt();
				double dblNum1 = dataFilterIn.readDouble();
				int intNum2 = dataFilterIn.readInt();
				double dblNum2 = dataFilterIn.readDouble();
				
				dataFilterIn.close();
				System.out.printf("저장된 정수는 %d, %d\n", intNum1, intNum2);
				System.out.printf("저장된 실수는 %.2f, %.2f%n", dblNum1, dblNum2);
		} 
		catch (Exception e) {
			System.out.println("IO예외발생");
			e.printStackTrace();
		}
		
	}

}
