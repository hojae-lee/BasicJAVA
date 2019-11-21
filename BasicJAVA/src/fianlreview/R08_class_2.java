package fianlreview;


/*
체크카드 클래스 Ver.02

시나리오] 버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
*/
class CheckCard2 {
	
	//멤버변수
	private long cardNumber; //카드번호 
	private String owner; //소유자 
	private int balance; //잔액 
	private int point; //포인트
	
	//기본생성자
	public CheckCard2() {}
	
	//인자생성자
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	/*
	초기화메소드와 생성자메소드의 유일한 차이점은 
	생성자는 반환값이 없고, 초기화(멤버)메소드는 반환값이 있다.
	따라서 멤버메소드를 정의할때는 반드시 void 혹은 해당
	반환타입을 명시해야 한다. 
	 */
	//초기화 메소드
	public void initMembers(long cardNumber, String owner, int balance, int point) {
		
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	

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
		
	//getter/setter
	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}	
}

public class R08_class_2 {

	public static void main(String[] args) {
		
		//체크카드 클래스 ver.02
		
		//기본생성자로 객체생성후 초기화메소드로 멤버변수 초기화
		CheckCard2 cc2 = new CheckCard2();
		cc2.initMembers(1234_5678_9999_0000L, "박길동", 
				5000, 0);
		
		//인자생성자로 객체의 생성과 초기화를 동시에
		CheckCard2 cc3 = new CheckCard2(4444_5555_6666_7777L,
				"최길동", 10000, 0);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
