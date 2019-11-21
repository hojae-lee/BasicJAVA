package ex07string;

public class QuStringBuffer {

	public static void main(String[] args) {

		String str1 = "ABCDEFGHI";
		String str2 = "1234567-1212121";
		
		for(int i=8; i>=0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		System.out.print(str2.replace("-", " "));
		
	}

}
