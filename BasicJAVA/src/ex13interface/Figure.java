package ex13interface;

/*
※인터페이스 하나당 하나의 자바파일을 생성하는 것이 기본원칙임.
 */
//도형을 의미하는 인터페이스
public interface Figure {
	//도형의 넓이를 의미하는 추상메소드.
	void area(String figureName);
}
