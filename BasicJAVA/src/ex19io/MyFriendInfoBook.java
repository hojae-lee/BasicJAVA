package ex19io;

import java.awt.font.NumericShaper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
 연습문제] 해당 프로그램은 친구의 정보를 저장하게 된다. 프로그램 종료시 Friend타입의 객체배열에
 저장된 친구의 정보를 파일의 형태로 저장할 수 있도록 직렬화 하시오.
 -저장될파일명 : friend_info.obj
 */

class Friend implements Serializable{
	//멤버변수 : 클래스의 속성 표현
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	//멤버메소드 : 클래스의 기능을 담당
	//전체정보 출력용 메소드
	public void showAllDate() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phone);
		System.out.println("주소: "+addr);
	}
	//간략정보 출력용 메소드
	public void showBasicInfo() {
		//오버라이딩의 목적으로 정의된 ㅔㅁ소드
		//(그래서 실행부가 없음)
	}
}

class HighFriend extends Friend{

	String nickname;
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	
	@Override
	public void showAllDate() {
		//부모클래스에 정의된 메소드 호출
		super.showAllDate();
		System.out.println("별명: "+nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("이름: "+name);
		System.out.println("전번: "+phone);
		System.out.println("별명: "+nickname);
	}
}

class UnivFriend extends Friend{
	
	String major; // 전공과목

	public UnivFriend(String name, String phone, String addr,String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	@Override
	public void showAllDate() {
		super.showAllDate();
		System.out.println("전공: "+major);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름: "+name);
		System.out.println("전번: "+phone);
		System.out.println("전공: "+major);
	}
}

class FriendInfoHandler implements Serializable{
	
	private Friend[] myFriends;
	
	private int numOfFriends;
	
	//생성자]
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	//멤버메소드]
	//친구정보입력
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		
		//입력받을 항목(지역변수)
		String iName,iPhone,iAddr,iNickname,iMajor;
		
		System.out.print("이름: "); iName = scan.nextLine();
		System.out.print("전화번호: "); iPhone = scan.nextLine();
		System.out.print("주소: "); iAddr = scan.nextLine();
		
		if(choice==1) {
			//고딩친구
			System.out.print("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			
			myFriends[numOfFriends++] = high;
		}
		else if(choice==2) {
			//대딩친구
			System.out.print("전공: "); iMajor = scan.nextLine();
			
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		
		System.out.println("친구정보 입력이 완료되었습니다.");
	}

	//친구정보 전체보기
	public void showAllData() {
		
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showAllDate();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	
	//친구정보 간략보기
	public void showSimpleData() {
		
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다==");
		
	}
	
	//주소록 검색
	public void searchInfo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		for(int i=0; i<numOfFriends; i++) {
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllDate();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
			}
		}
	}
	
	//주소록 삭제
	public void deleteInfo() {

		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		//배열요소중 삭제된 요소의 인덱스값을 저장할 용도의 변수
		int deleteIndex = -1;
		
		for(int i=0; i<numOfFriends; i++) {
			if(deleteName.compareTo(myFriends[i].name)==0) {
				myFriends[i] = null; //참조값 지움
				
				//삭제된 요소의 인덱스 값 저장
				deleteIndex = i;
				
				//전체카운트변수 차감
				numOfFriends--;
			}
		}
		
		if(deleteIndex==-1) {
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			for(int i = deleteIndex; i< numOfFriends; i++) {
				//삭제한 후 null값이 입력된 위치에 바로 뒤 요소로 교환
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다==");
		}
	}
	
	//친구정보를 파일형태로 저장하기

	public void saveFriendInfo() {

		try {
			ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("src/ex19io/friend_info.obj"));
			
			
//			for(int i=0; i<numOfFriends; i++) {
//				out.writeObject(myFriends[i]);
//			}
			
			for(Friend f : myFriends) {
				out.writeObject(f);
			}
			out.close();

		}catch (FileNotFoundException e) {
			System.out.println("파일없음");
		}catch (IOException e) {
			System.out.println("뭔가업음");
		}
		
	}
	
	public void printFriendInfo() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex19io/friend_info.obj"));
			
			for(int i=0; i<numOfFriends; i++) {
				myFriends[i] = (Friend)in.readObject();
				myFriends[i].showAllDate();
			}
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class MyFriendInfoBook {
	
	public static void menuShow() {
		
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}

	public static void main(String[] args) {

			FriendInfoHandler handler = new FriendInfoHandler(100);
			
			while(true) {
				
				menuShow();
				
				Scanner scan = new Scanner(System.in);
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:case 2:
					handler.addFriend(choice);
					break;
				case 3:
					handler.showAllData();
					break;
				case 4:
					handler.showSimpleData();
					break;
				case 5:
					handler.searchInfo();
					break;
				case 6:
					handler.deleteInfo();
					break;
				case 7:
					
					//프로그램 종료시 친구정보를 직렬화(파일 저장)한다.
					handler.saveFriendInfo();
					System.out.println("친구의 정보를 파일로 저장합니다.");
					handler.printFriendInfo();
					System.out.println("친구의 정보를 불러옵니다.");
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
		
	}
}
