package ex13interface;
//※해당 프로그램의 시나리오는 교안 참조

/*
 추상클래스
 - 상속을 목적으로 제작되므로 객체생성을 허용하지 않는다.
 - 추상클래스는 대부분 추상메소드를 포함하고 있으므로 이를 상속받는 클래스는 반드시 추상메소드를
 오버라이딩 해야한다.
 - 클래스를 제작할 떄 일종의 설계도 역할을 하고 그 외 참조변수 선언등 클래스가 가진 대부분의
 기능을 가지고 있다.

 추상메소드
 - 오버라이딩의 목적으로 만들어진다.
 - 그러므로 함수의 몸체(실행부)가 없는것이 특징이다.
 - 실행부가 없기 때문에 {} 를 쓰지 않고 ;세미콜론으로 마무리한다.
 */
//abstract class PersonalNumberStorage{
//	
//	//사람 정보를 저장할 추상메소드 정의
//	public abstract void addPersonalInfo(String juminNum, String name);
//	
//	//주민번호를 기반으로 정보를 검색할 추상메소드 정의
//	public abstract String searchPersonalInfo(String juminNum);
//}

/*
 위 추상클래스를 interface로 변경하기.
 abstract class => interface
 메소드의 경우
 	public abstract 를 생략
 멤버상수의 경우
 	public static final 을 생략
 */

interface PersonalNumberStorage{
	
	void addPersonalInfo(String juminNum, String name);	
	String searchPersonalInfo(String juminNum);
}

//사람의 정보를 저장할 데이터클래스(DTO) -> 데이터를 주고 받는 클래스.

/*
 사람의 정보를 저장할 용도의 DTO클래스 혹은 VO클래스라고도 한다.
 */
class PersonalNumInfo{
	
	private String name;
	private String juminNum;
	
	public PersonalNumInfo(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	
	String getName() {return name;}
	String getJuminNum() {return juminNum;}
	
}
/*
 추상클래스를 상속할떄는 extends
 interface를 구현할떄는 implements
 */
//class PersonNumberStorageImpl extends PersonalNumberStorage
class PersonNumberStorageImpl implements PersonalNumberStorage{
	
	PersonalNumInfo[] personalArr;//정보저장용 객체배열
	int numOfPerInfo;//입력정보 카운트용 변수
	
	public PersonNumberStorageImpl(int arrSize) {
		personalArr = new PersonalNumInfo[arrSize];
		numOfPerInfo = 0;
	}
	
	/*
	 전달받은 매개변수를 통해 PersonalNumInfo객체를 생성 후 객체배열에 저장한다.
	 */
	
	//사람정보저장 메소드
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalNumInfo(name, juminNum);
				numOfPerInfo++;
	}
	
	/*
	 주민 번호를 매개변수로 받아서 정보를 검색 후 일치하는 경우 이름을 반환한다.
	 */
	//주민등록번호를 기반으로 객체배열 검색 후 이름 반환
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i =0; i<numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				
				//getter를 통해 이름반환
				return personalArr[i].getName();
			}
		}
		return null; //검색결과가 없는 경우 null반환
	}
	
}

public class AbstractToInterface {

	public static void main(String[] args) {

		PersonalNumberStorage storage = new PersonNumberStorageImpl(10);
		
		storage.addPersonalInfo("901010-2222222", "김태희");
		storage.addPersonalInfo("800505-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901010-2222222"));
		System.out.println(storage.searchPersonalInfo("800505-1111111"));
		System.out.println(storage.searchPersonalInfo("000000-9999999"));
		
	}

}
