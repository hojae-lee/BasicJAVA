package ex08class;

public class QuMarbles {

	public static void main(String[] args) {

		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
		
		//잘못된 조건의 게임 진행
		child1.obtainBead(child2, 30);
		System.out.println("\n잘못된 조건의 게임 진행 후");
		System.out.print("어린이1: ");
		child1.showProperty();
		System.out.print("어린이2: ");
		child2.showProperty();
		
	}

}

class ChildProperty{

	//멤버변수
	int marble;

	//생성자
	public ChildProperty(int marble) {

	this.marble = marble;
	
	}
	 //멤버메소드

	public void showProperty() {

		System.out.printf("보유 구슬의 개수 %d\n",marble);
		
	}

	public void obtainBead(ChildProperty child, int bCnt) {

		/*
		 만약 패배한 어린이가 보유한 구슬보다 bCnt이 많다면 보유한 만큼만 차감할 수 있는 로직이 필요함.
		 */
		if(child.marble <= bCnt) {
			this.marble += child.marble;
			child.marble = 0;
		}
		else { 
			//구슬을 획득하는 주체 즉 승리한 어린이 이므로 현재 클래스 자체가 된다.
			this.marble += bCnt;
			//구슬을 잃는 주체 패배한 어린이 이므로 매개변수로 전달된 객체가 된다
			child.marble -= bCnt;
		}		
		
	}
	
}
