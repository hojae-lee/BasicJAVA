package ex09package.kosmo.util;

public class CommonUtil {

	
	public static boolean isNumber(String strValue) {
		
		if(strValue.length()==0) return false;
		
		for(int i=0; i<strValue.length(); i++) {
			int acode = strValue.codePointAt(i);
			if(!(acode>='0'&& acode<='9'))return false;
		}
		
		return true;
	}
}
