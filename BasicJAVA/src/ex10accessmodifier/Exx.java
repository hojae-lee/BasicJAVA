package ex10accessmodifier;

public class Exx {

	static int instNum =100;
	public Exx() {
		instNum++;
		System.out.println("인스턴스생성 "+instNum);
	}
	public static void main(String[] args) {

		Exx ex = new Exx();
		
		Exx.instNum -=15;
		System.out.println(Exx.instNum);
		
		
	}

}
