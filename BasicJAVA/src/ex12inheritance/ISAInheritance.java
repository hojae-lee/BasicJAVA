package ex12inheritance;

/*
Is-A관계
 :	X Is A Y => X는 Y의 일종이다로 표현가능
 -노트북은 컴퓨터의 일종이다.
 -휴대폰은 전화기의 일종이다.
 이와 같이 Is-A관계가 성립하는것을 상속으로 표현하기에 적합
 
 해당예제는 커뮤터 > 노트북컴퓨터 > 테블릿노트북컴퓨터의 관계를 통해 상속관계를 표현하고 있음
 -컴퓨터 : 기본적인 컴퓨팅 환경을 제공
 -노트북컴퓨터 : 컴퓨팅 환경+ 휴대성 포함
 -테블릿노트북컴퓨터 : 컴퓨팅 환경 + 휴대성 + 펜 터치기능 포함
 */

public class ISAInheritance {

	public static void main(String[] args) {

		NotebookComputer noteBook = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동욱",5,"ISE-1234");
		
		System.out.println("==노트북컴퓨터사용==");
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		
		System.out.println("ISE-1234 펜으로 테블릿사용");
		tablet.write("ISE-1234");
		System.out.println("XYZ-9876 펜으로 테블릿사용");
		tablet.write("XYZ-9876");
		
	}

}

class Computer{
	String owner; // 컴퓨터의 소유주 이름
	
	//생성자
	public Computer(String name) {
		owner = name;
	}
	
	//멤버메소드
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() {
		/*
		 private 접근지정자로 선언된 멤버메소드는 외부클래스 혹은 상속받은 클래스에서 
		 접근이 불가능하므로 public 으로 선언된 메소드를 통해 간접적인 호출을 해야한다.
		 상속 관계라면 protected로 선언된 메소드로 호출 할 수 도 있다.
		 */
		keyboardTouch();
		calculate();
		/*
		 해당 메소드는 내부에서만 접근 되므로 호출순서를 지켜 호출 할 수 있도록 정의하였다.
		 (캡슐화)
		 */
	}
}

class NotebookComputer extends Computer {
	
	int battary; // 배터리 충전량
	
	public NotebookComputer(String name, int initCharge) {
		/*
		 부모클래스의 생성자 호출을 위한 super()는 생략은 가능하나, 앞에 다른 문장이 먼저오게 되면
		 오류가 발생되므로 주의해야 한다.
		 */
		super(name);
		battary = initCharge;		
	}
	
	public void charging() {
		battary +=5;
	}
	
	public void movingCal() {
		
		//배터리양 체크 후 사용여부 판단
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.print("이동하면서 ");
		
		/*
		 부모 클래스에서 정의된 멤버메소드를 호출하려면 반드시 public으로 선언해야 한다.
		 아래는 private로 선언되어 호출이 불가능하다.
		 
			keyboardTouch();
			calculate();
		 */
		
		calculateFunc();
		
		battary -=1;
	}
}

class TabletNotebook extends NotebookComputer{
	
	//테블릿을 사용하기 위한 펜슬
	String registPencil;//ISE-1234
	
	public TabletNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	
	public void write(String penInfo) {
		
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		
		//등록된 펜인지 체크
		if(registPencil.compareTo(penInfo)!=0) {
			/*
			 A.compareTo(B)
			 	: 문자열 A와 B를 비교하여 0이 반환되면 같은 문자열로 판단. -1 혹은 1이
			 	반환되면 서로 다른 문자열로 판단하는 String클래스에 정의된 메소드
			 */
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		
		movingCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -=1;
	}
	
}