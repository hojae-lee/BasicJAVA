package ex10accessmodifier.cal;

/*
 Calculator클래스는 해당 java파일에서 외부에 가장 의미있느 클래스로 써 public으로 선언되었다.
 자바에서는 하나의 클래스만 public으로 선언이 가능하다.
 그러므로 public으로 서언된 클래스에서 다른 클래스를 사용하는 형태로 제작되어야한다.
 */
public class Calculator {

	private Adder adder;
	private Subtractor subtractor;
	
	//[생성자 메소드]
	/*
	 해당 클래스의 객체가 생성 될 때 생성자를 통해 덧셈 뺄셈 연산을 위한 클래스도 동시에 객체가 생성된다.
	 */
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	//[멤버메소드]
	/*
	 덧셈 혹은 뺄셈 연산 후 결과를 반환하는 멤버메소드.
	 각 연산을 위해 해당 default클래스의 멤버메소드를 호출한 후 값을 반환받는다.
	 */
	public int addTwoNumber(int n1,int n2) {
		return adder.addTwoNumber(n1,n2);
	}
	public int subTwoNumber(int n1,int n2) {
		return subtractor.subTwoNumber(n1,n2);
	}
	/*
	연산의 횟수를 디스플레이 해주는 메소드
	정보은닉 처리되어있는 멤버변수의 출력을 위해 getter() 메소드를 호출하고 있따.
	 */
	public void showOpratingTimes() {
		System.out.println("덧셈횟수: "+adder.getCntAdd());
		System.out.println("뺄셈횟수: "+ subtractor.getCntSub());
	}
}

class Adder{
	//멤버변수
	private int cntAdd;
	
	Adder(){
			cntAdd =0;
	}
	/*
	 getter메소드 : private 로 선언된 멤버변수를 반환하는 메소드로 setter메소드와 일반적으로 같이 선언
	 setter는 멤버변수의 값을 설정하는 역할을 한다.
	 */
	int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1+n2;
	}
}

class Subtractor{
	private int cntSub;
	
	public Subtractor(){
			cntSub =0;
	}
	public int getCntSub() {
		return cntSub;
	}
	public int subTwoNumber(int num1, int num2) {
		cntSub++;
		return num1 - num2;
	}
}