package ex02variable;

public class Qu_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor =99,eng =80,math =96;
		int sum = kor + eng +math;
		float avg = sum/3;
		
		System.out.println(kor+"점,"+eng+"점,"+math+"점"+"의 평균점수는 "+avg+"점입니다."+"(실수형태)");
		System.out.println(kor+"점,"+eng+"점,"+math+"점"+"의 평균점수는 "+(int)avg+"점입니다."+"(정수형태)");
		
	}

}
