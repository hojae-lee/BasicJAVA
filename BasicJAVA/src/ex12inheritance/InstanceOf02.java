package ex12inheritance;

/*
 부모클래스의 참조변수로 자식클래스의 인스턴스를 참조할 수 있으므로 인스턴스가 매개변수로 전달되는 경우 상위 클래스인 Box타입으로
 하위인스턴스변수를 받을 수 있다.
 
 instanceof 연산자는 인스턴스변수가 어떤 타입의 변수인지를 판단하는 연산자로 형변환이 가능하면 true, 불가능하면 false를 반환한다.
 
 인스턴스변수가 형변환이 되려면 반드시 두 클래스간에는 상속관계가 있어야 한다.
 */
class Box{
	public void boxWrap() {
		System.out.println("Box로 포장합니다.");
	}
}
class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다.");
	}
}
class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다.");
	}
}

public class InstanceOf02 {
	
	/*
	 여기서 instanceof를 통해서 형변환 가능여부를 판단하는 이유는 전달된 매개변수를 최상위클래스인 Box타입으로 받고 있기 때문이다.
	 Box타입으로 매개변수를 받게되면 자동으로 업캐스팅(자동형변환)이 되기 때문에 자식클래스의 멤버메소드를 호출하기위해서는 다운캐스팅이 필요하다.
	 따라서 전달된 매개변수가 각 객체타입으로 형변환이 가능한지를 판단한 후 다운캐스팅을 진행하고 해당 멤버메소드를 호출하게 된다.
	 */

	static void wrapBox(Box b) {
//		int num1 = (int) 1.0;
//		double num2 = 1;
		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}
	
	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);//box타입
		wrapBox(box2);//PaperBox타입
		wrapBox(box3);//GoldPaperBox타입
		
	}

}
