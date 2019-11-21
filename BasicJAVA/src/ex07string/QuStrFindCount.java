package ex07string;

public class QuStrFindCount {

	public static void main(String[] args) {
		
		System.out.println("문자열 12345AB12AB345AB에서 AB의 갯수: "+strCount("12345AB12AB345AB","AB"));
		System.out.println("문자열 12345에서 AB의 갯수: "+strCount("12345","AB"));
		
	}

	static int strCount(String a, String b) {
		int cnt = 0;
		
		while(true) {
			if(a.indexOf(b)==-1) {
				break;
			}
			else {
				cnt += 1;
				a = a.substring(a.indexOf(b)+2);
			}
		}
		return cnt;
	}

}
