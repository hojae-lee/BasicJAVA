package ex12inheritance;
/*
복합관계로 표현하기에 적합한 Has-A 관계
	: X Has a Y -> X가 Y를 소유하고 있다.
	경찰이 권총을 소유하다
	경찰이 진압ㅂ보을 소유하다
	
	Has-A와 같이 소유의 관계를 상속으로 표현하면 클래스간의 강한 연결고리가 형성되어 권총이 없는
	경찰 혹은 추가적인 장비를 소유한 경찰등을 표현하기가 힘들어진다.
	따라서 이 경우에은 복합관계로 표현하는것이 적합하다.
	복합관계란 클래싀 멤버로 또 다른 객체가 정의되는 것을 말한다.
*/

public class HasAComposite {

	public static void main(String[] args) {

		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
		System.out.println("====================");
		
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();

		
	}

}

class Gun{
	
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	
	//총을 쏘는 행위 표현
	public void shutGun() {
		System.out.println("빵야~~~!");
		bullet--;
	}
}

class Police{
	
	int handCuffs;
	Gun pistol;
	
	public Police(int bNum, int hCuff) {
		handCuffs = hCuff;
		
		/*
		 권총보유여부 초기화
		 	: 만약 총알이 0이라면 보유한 권총이 없는것을 표현 참조변수가 null값을 가지게되면
		 	해당변수는 참조할 객체가 생성되지 않음을 뜻한다. 즉 참조변수만 있고 참조할
		 	객체는 생성되지 않았다는 것이다.
		 */
		
		if(bNum<=0) {
			pistol = null;
		}
		else {
			/*
			 총알이 있다면 권총객체를 생성하여 권총을 보유한 경찰을 표현한다.
			 */
			pistol = new Gun(bNum);
		}
	}
	
	public void putHandcuff() {
		System.out.println("수갑채움~! 넌 콩밥!~");
		handCuffs--;
	}
	
	public void shut() {
		if(pistol == null) {
			//총이 없는 경우 발사할수없음.
			System.out.println("보유한 권총 없음. 헛빵~!!");
		}
		else {
			pistol.shutGun();
		}
	}
}