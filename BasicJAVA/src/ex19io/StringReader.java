package ex19io;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringReader {

	public static void main(String[] args) {

		try {
			BufferedReader in =new BufferedReader(new FileReader("src/ex19io/string.txt"));
			
			String str;
			while(true) {
				/*
				 개행(줄바꿈)이 등장하기 전까지의 데이터를 한 번에 읽어온다. 즉 한줄씩 읽어온다.
				 */
				str = in.readLine();
				if(str==null) {
					break;
				}
				/*
				 입력시 newLine()을 통해 개행정보가 입력되지만 읽어 드린 문자열에서는 개행정보가 존재하지
				 않게된다. 따라서 개행을 하려면 println()을 사용해야ㅏ 한다.
				 즉, 개행정보는 문자열을 구분하는 용도로만 사용되고 버려진다고 보면된다.
				 */
				System.out.println(str);
			}
			in.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
