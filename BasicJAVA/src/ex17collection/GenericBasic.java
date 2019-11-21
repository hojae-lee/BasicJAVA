package ex17collection;

class Orange{
	int sugar;
	public Orange(int sugar) {

		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("오렌지의 당도는 "+sugar+" 입니다.");
	}
}

//오렌지객체만 저장할수 있는 박스 클래스
class OrangeBox{
	Orange item;
	
	public void store(Orange item) {
		this.item = item;
	}
	
	public Orange pullOut() {
		return item;
	}
}

//과일상자:오브젝트클래스를 기반으로 모든 객체를 저장할수있는 클래스
class FruitBox{
	Object item;
	
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

public class GenericBasic {

	public static void main(String[] args) {

		//오렌지만 저장할수 있는 상자1를 생성
		OrangeBox oBox1 = new OrangeBox();
		//당도 10인 오레지1을 생성.
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		//상자1에 오렌지1을 담음
		orange1 = oBox1.pullOut();
		//상자에서 오렌지 1을 꺼냅
		orange1.showInfo();
		
		/*
		 상자 1은 오렌지 전용 박스 이므로 다른과일 을 저장할수없다. 컴파일 에러가 발생하므로 실행자체가 불가능하다.
//		oBox1.store("당도가 20인 오렌지");
		Orange orange2 = oBox1.pullOut();
		orange2.showInfo(); 
		-> 상자1은 ORange형 객체만 저장할수 있으므로 자료형에는 안전하지만 구현에 불편함이 있따. 즉 추가로
		사과 복숭아를 저장하고 싶다면 그에 해당하는 클래스를 계속해서 정의해야한다.
		 */
		
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		/*
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
		Orange orange4 = (Orange)fBox2.pullOut();
		orange4.showInfo();
		 
		 -> Object기반의 FruitBox는 자료형에 대해서는 편의성이 있으나 코드레벨에서 문제가 없기 때문에
		 컴파일 오류는 발생하지 않으나 실행시 예외가 발생하게 된다. 실행상의 오류는 컴파일 오류보다 문제해결이 더 어렵다는
		 특징이 있다.
		 */
		
		
	}

}
