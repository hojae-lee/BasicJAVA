package ex08class;

/*
 시나리오]
 다음에 주어진 조건으로 사람을 추상화 하시오
 -속성 : 이름,나이,에너지
 -행동 : 걷는다,생각한다, 먹는다, 현재상태 4가지를 표현한다.
 
 -행동의 조건
 
 	먹으면 에너지가 2증가한다.
 	걸으며 에너지가 1감소한다.
 	생각하면 에너지가 2감소한다.
 	단, 에너지의 최소 최대범위는 0~10이다. (사람은 무한히 먹을수없으며 에너지가
 	마이너스가 되면 죽은것과 같다)
 */

/*
 해당 예제에서는 Human 클래스를 외부파일로 선언하였다.
 동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아서 즉시 인스턴스화 할 수 있따.
 만약 다른 패키지에 정의된 클래스라면 반드시 import해줘야 한다.
 */
public class HumanMain{

	public static void main(String[] args) {

		Human human = new Human();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();
		human.eat();
		human.walk();
		human.thinking();
		human.showState();
		
		for(int i=1; i<=20; i++) {
			human.walk();
		}
		human.showState();
		
		for(int i=1; i<=20; i++) {
			human.eat();
		}
		human.showState();
		
	}

}