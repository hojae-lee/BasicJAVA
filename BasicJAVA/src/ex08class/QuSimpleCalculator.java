package ex08class;

public class QuSimpleCalculator {

	public static void main(String[] args) {

		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
		
	}

}

class CalculatorEx{
	
	//멤버변수 : 사칙연산애 대한 횟수 카운트
	
	int count1;
	int count2;
	int count3;
	int count4;
	
	//멤버 메소드
	public void init() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
	}

	public double add(double i, double j) {
		double sum = i+j;
		count1++;
		return sum;
	}
	
	public double min(double i, double j) {
		double min = i-j;
		count2++;
		return min;
	}
	
	public double mul(double i, double j) {
		double mul = i*j;
		count3++;
		return mul;
	}
	
	public double div(double i, double j) {
		double div = i/j;
		count4++;
		return div;
	}

	public void showOpCount() {
		System.out.println("덧셈횟수: "+ count1);
		System.out.println("뺄셈횟수: "+ count2);
		System.out.println("곱셈횟수: "+ count3);
		System.out.println("나눗셈횟수: "+ count4);
	}
	
}