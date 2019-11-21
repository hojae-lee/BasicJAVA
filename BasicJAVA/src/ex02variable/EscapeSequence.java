package ex02variable;

public class EscapeSequence {

	/*
	 Escape Sequence : 특정 형식에 맞게 출력하기 위해 사용하는 문자로 \를 붙히면 된다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 \t : 탭기능
		 */
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");
		
		/*
		 \n : 줄바꿈(line feed) 기능
		 */
		System.out.print("KOSMO에 오신걸 환영합니다.\n");
		System.out.print("열심히\n해봅시다.\n");
		
		/*
		 \" : 쌍따옴표를 표현하고 싶을 때 사용
		 */
//		System.out.println("나는 "개발자"가 되고 싶어요");
		//위의 경우는 에러발생됨.
		System.out.println("나는 \"개발자\"가 되고 싶어요");
		
		/*
		 printf()문 : 문자열을 서식에 맞춰서 출력해야 할 때 사용한다.
		 	서식문자
		 		%d : 정수값 출력(byte/short/int/long)
		 		%f : 실수값 출력(/float/double)
		 		%s : 문자열 출력
		 		%c : 문자 출력
		 		%n : 줄바꿈기능(=\n)
		 */
		int kor =81, eng=97, math=79;
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		System.out.println("\n국어:"+kor+ ", 영어:"+ eng + ", 수학:"+math);
		
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균점수:%f%n" , avg);
		
		
		/*
		 printf문을 통한 서식문자열 출력시 자리수 시정하기 형식 : %숫자format-string
		 Ex)
		 	%4d : 정수를 출력할 때 전체자리수는 4자리로 표현
		 	%6.2f : 실수를 출력할 때 전체자리수는 6자리, 소수점 이하는 2자리까지만 표현
		 	양수일 때는 우측정렬, 음수일 때는 좌측정렬 됨
		 */
		System.out.printf("국어:%d, 영어:%d, 수학:%d, 평균:%f%n", kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d, 평균:%7.2f%n", kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d, 평균:%-7.2f%n", kor, eng, math, avg);
		
	}
}
