package ex04controlstatement;

import java.io.IOException;

public class CsIf03 {
	
	/*
	 if문(조건문, 분기문)
	 형식3}
	 	if(조건문1){
	 		실행문장1;
	 	}
	 	else if(조건문2){
	 		실행문장2;
	 	}
	 	else{
	 		위 모든 조건식이 거짓일 때 실행할 문장;
	 	}
	 */

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		/*
		 시나리오} 국,영,수 점수의 평균값을 구하여 학점을 출력하는 프로그램을 작성하시오. 
		 90점이상은 A, 60점 미만은 F학점으로 판단한다.
		 */
		
		int kor = 90  ,eng = 90 ,math = 60;
		double avg = (kor+eng+math) / 3.0;
		System.out.println("평균점수는: "+ avg);
		System.out.printf("평균점수는(소수2자리): %.2f\n", avg);
		
		if(avg >=90) {
			System.out.println("A학점");
		}
		else if(avg >=80) {
			System.out.println("B학점");
		}
		else if(avg >=70) {
			System.out.println("C학점");
		}
		else if(avg >=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅠㅠㅠㅠ");
		}
		/*
		 ※ if~else 구문을 구성할 때는 조건의 구간을 어떻게 설정하느냐에 따라 전혀 다른 결과가 나올 수 있으므로 주의해야 한다.
		 아래 if문은 높은 점수라 할지라도 60이상의 조건을 만족하므로 무조건 D학점이 출력된다.
		 
		if(avg >=60) {
			System.out.println("D학점");
		}
		else if(avg >=70) {
			System.out.println("C학점");
		}
		else if(avg >=80) {
			System.out.println("B학점");
		}
		else if(avg >=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅠㅠㅠㅠ");
		}
		*/
		
		/*
		 시나리오} 사용자로부터 한 문자를 입력받아 숫자이면 "숫자" 알파벳이면 "알파벳"을 출력하고 만약 둘 다
		 아니라면 "듣보잡"을 출력하는 프로그램을 작성하시오.
		 단, 아스키코드값을 모른다고 가정한다.
		 */
		
		System.out.print("문자 하나를 입력하세요: ");
		char ascii = (char)System.in.read();
		
		if(ascii>='0' && ascii<='9') {
			//숫자인지 판단
			System.out.println("숫자");
		} 
		else if((ascii>='a' && ascii<='z') || (ascii>='A' && ascii<='Z')) {
			System.out.println("알파벳입니다.");
		}
		//알파벳인지 판단
		/*
		 아스키코드가 65~90 또는 97~122사이라면 알파벳으로 판단할 수 있다.
		 */
		else {
			System.out.println("듣보잡");
		}
		
		/*
		 시나리오] 세 개의 숫자중 최대값을 구하는 프로그램을 작성하시오
		 */
		int n1=99, n2=150, n3=199;
		//비교의 대상이 될 기준값을 설정한다.
		int maxValue = n1;
		//두번 째 값과 비교 후 크다면 최대값을 교체
		if(maxValue < n2) {
			maxValue = n2;
		}
		//세번 째 값과 비교 후 크다면 최대값을 교체
		if(maxValue < n3) {
			maxValue = n3;
		}
		System.out.println("최대값은: "+ maxValue);

		
		
	}

}
