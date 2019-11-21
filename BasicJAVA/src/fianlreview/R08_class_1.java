package fianlreview;


/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%
*/
class CheckCard1 {
	
	//멤버변수
	long cardNumber; //카드번호 
	String owner; //소유자 
	int balance; //잔액 
	int point; //포인트
	
	 
	//충전(입금) : 잔고가 증가한다.
	void charge(int amount) {
		balance += amount;
		System.out.printf("[%s님 충전]%d원 완료\n",
				owner, amount);
		System.out.printf("[잔고]%d원입니다.\n\n", balance);
	}
	
	//결제
	void payment(int amount) {
		balance -= amount;
		System.out.printf("[%s님 결제]%d원 출금완료\n",
				owner, amount);
		System.out.printf("[잔고]%d원입니다.\n\n", balance);
		
		//결제와 동시에 적립은 즉시 처리된다.
		//동일 클래스 내에서 같은 멤버메소드 끼리 호출하는것이
		//가능하다. 같은 멤버이기 때문.
		savingPoint(amount);
	}
	
	//적립 
	void savingPoint(int amount) {
		int plusPoint = amount / 1000;
		point += plusPoint;
		System.out.printf("[적립]%d포인트 완료\n", plusPoint);
		System.out.printf("[포인트잔액]%d 입니다.\n", point);
	}
		
	//현재상태출력
	void showState() {
		System.out.println("==================");
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
		System.out.println("==================");
	}	
}

public class R08_class_1 {

	public static void main(String[] args) {
		
		//체크카드 클래스 Ver.01
		
		//객체생성
		CheckCard1 cc1 = new CheckCard1();
		
		/*
		숫자를 표현할때 구분자로 언더바(_)로 사용할수 있다. 
		JDK7.0부터 지원되었으며 숫자사이에 쓰는것만 허용된다. 
		잘못된사용법]
			3._14159
			123_456_
			_124_456
			
			위와같이 언더바로 시작하거나 끝날수 없으며 
			소수점과 붙여서 쓸수도 없다.
		 */
		cc1.owner = "홍길동";
		cc1.cardNumber = 1234_2222_3333_4444L;
		cc1.balance = 10000;
		cc1.point = 0;
		
		cc1.payment(5000);
		cc1.payment(10000);
		cc1.showState();
	}

}
