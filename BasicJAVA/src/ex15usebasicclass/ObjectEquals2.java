package ex15usebasicclass;

class MyClass{
	int data;
	
	public MyClass(int data) {

		this.data = data;
		
	}
	/*
	 실제 저장된 데이터가 반환되도록 Object클래스로부터 상속받아 오버라이딩한 메소드
	 */
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	/*
	 hashCode():
	 	인스턴스의 고유한 주소값을 문자열의 형태로 반환한다. 차후 Set컬렉션에서 주로 사용할 예정.
	 */
	@Override
	public int hashCode() {
		return data;
	}
	/*
	 MyClass형의 객체의 비교를 위한 오버라이딩한 equals() 메소드.
	 객체가 가지고 있는 멤버변수의 비교를 통해 동일여부를 판단한다.
	 */
	@Override
	public boolean equals(Object obj) {

		/*
		 매개변수로 전달된 객체를 오브젝트로 받은후 MyClass의 인스턴스인지를 먼저 판단한다.
		 */
		if(obj instanceof MyClass) {
			
			//MyClass로 형변환(다운캐스팅)
			MyClass mc = (MyClass)obj;
			
			//두 객체간의 멤버변수의 값을 실제로 비교함.
			if(mc.data == this.data) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			/*
			 매개변수로 전달된 객체가 MyClass의 인스턴스가 아니라면 비교의 대상이 될수 없으므로 false반환함.
			 */
			return false;
		}		
	}
}

public class ObjectEquals2 {
	
	public static void main(String[] args) {
	
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("두 객체를 equals() 메소드로 비교");
		//두 객체의 참조값(주소값)을 비교
		if(mc1 == mc2)
			System.out.println("인스턴스 참조값이 같다");
		else
			System.out.println("인스턴스 참조값이 다르다");
		
		//두 객체의 멤버변수값 비교.
		System.out.println(mc1.equals(mc2)? "같다": "다르다");
		
		System.out.println("두 객체의 toString()메소드 호출");
		System.out.println("mc1.toStinrg()=>"+ mc1.toString());
		System.out.println("mc2.toStinrg()=>"+ mc2.toString());
		
		Point pos1 = new Point(10, 20);
		Point pos2 = new Point(10, 20);
		System.out.print("두 점의 비교결과:");
		System.out.println(pos1.equals(pos2) ? "같다":"다르다");
		
		/*
		 toString() 메소드는 굳이 호출하지 않아도 print()문이 실행될 때 자동으로 호출된다.
		 즉, 아래 문장의 결과는 동일하다.
		 */
		System.out.println("pos1.toString()=>"+pos1.toString());
		System.out.println("pos2.toString()=>"+pos2.toString());
		System.out.println(pos1);
		System.out.println(pos2);
		
	}
	
}

class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 객체1의 x,y값과 객체2의 x,y값이 같을 때 동일한 객체로 판단할 수 있도록 오버라이딩 함.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pos = (Point)obj;
			if(this.x==pos.x && this.y == pos.y) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "x="+ String.valueOf(x) + ", y="+ String.valueOf(y);
	}
}