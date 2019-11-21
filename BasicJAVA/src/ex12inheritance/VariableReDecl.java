package ex12inheritance;

public class VariableReDecl {

	public static void main(String[] args) {
		
		/*
		 멤버변수는 오버라이딩의 대상이 될 수 없다.
		 따라서 각 참조변수에 해당하는 멤버변수가 출력된다.
		 */

		Z z = new Z();
		Y y = new Z();
		X x = new Z();
		
		System.out.println("z.num= "+z.num);
		System.out.println("y.num= "+y.num);
		System.out.println("x.num= "+x.num);
	}

}

class X{
	public int num = 2 ;
}

class Y extends X{
	public int num = 4;
}

class Z extends Y{
	public int num = 6;
}