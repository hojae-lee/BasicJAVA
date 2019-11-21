package ex08class;

public class Human {

	//이름,나이,에너지
			String name;
			int age;
			int energy;
			
			//행동: 걷는다. 생각한다 먹는다 현재상태
			//멤버메소드
			
			void walk() {
				
				//1차 감소후 음수인지 확인하여 음수이면 0으로 고정함.
				energy--;
				if(energy < 0) {
					energy = 0;
					System.out.println("걸을 수 없음.");
					System.out.println("0으로 고정.");
				}
				else {
					System.out.println("[walk]에너지가 1 감소하였습니다.");
				}
			}
			void thinking() {
				energy -=2;
				if(energy < 0) {
					energy = 0;
					System.out.println("생각x.");
					System.out.println("0으로 고정.");
				}
				else {
					System.out.println("[thinking]에너지가 2 감소하였습니다.");
				}
				
			}
			void eat() {
				//2증가 후 10을 초과하면 에너지를 10으로 고정시킴.
				energy +=2;
				if(energy>10) {
					energy = 10;
					System.out.println("에너지는 10이 최대치입니다.");
				}
				else {
					System.out.println("[eat]에너지가 2증가하였습니다.");
				}
			}
			
			//현재 상태 출력용 메소드
			void showState() {
				System.out.println("===님의 현재상태는===");
				System.out.println("이름: "+name);
				System.out.println("나이: "+age);
				System.out.println("에너지: "+energy);
			}
			
}
