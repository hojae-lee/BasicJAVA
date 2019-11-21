package ex17collection;

class Apple{
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo() {
		System.out.println("사과의 무게는 "+ weight+ " 입니다.");
	}
}

class Banner{
	int sugar;
	public Banner(int s) {
		sugar = s;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는 "+ sugar+ " 입니다.");
	}
}

/*
class GenericFruitBox{
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

기존 Object기반의 FruitBox를 아래와 같이 제네릭 클래스로 정의하였다.
자료형에 해당하는 부분을 대표문자 <T>로 교체하고 객체 생성시 자료형을 결정하기 위해
클래스명<T> 형태로 변경되었다.
 */

class GenericFruitBox<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
		//객체 생성시 T부분이 결정되므로 구현의 편의성이 보장된다.
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banner> bannerBox = new GenericFruitBox<Banner>();
		bannerBox.store(new Banner(20));
		Banner banner = bannerBox.pullOut();
		banner.showInfo();
		
		/*
		 OrangeBox는 객체생성시 자료형 T를 Orange타입으로 결정했으므로 다른 객체를 저장할 수 없다.
		 즉 컴파일오류가 발생되어 자료형에도 안전한 클래스가 되었다.
		 */
		
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox.store("나는 오렌지"); 컴파일 에러 발생!
//		orangeBox.store(apple);
//		orangeBox.store(banner);
		
	}

}
