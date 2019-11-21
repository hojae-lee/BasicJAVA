package project1.ver06;

import java.util.Scanner;

public class PhoneBookManager implements SubMenuItem{
	
	PhoneInfo[] phoneInfos = new PhoneInfo[50];
	static int index = 0;

	public void printMenu() {

		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 주소록 출력");
		System.out.println("5. 프로그램 제거");
		
	}
	
	public void dataInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.동창, 3.회사");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("선택: "+num);
		
		if(num ==x) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			phoneInfos[index++] = new PhoneInfo(name,phonenumber);
		}
		if(num ==y) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			System.out.print("대학교:");
			String uni = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			phoneInfos[index++] = new PhoneSchoolInfo(name, phonenumber, uni);
		}
		if(num==z) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			System.out.print("회사:");
			String companey = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			phoneInfos[index++] = new PhoneSchoolInfo(name, phonenumber, companey);
		}

	}
	
	public void dataSearch() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		for(int i=0; i<index; i++) {
			if(name.equals(phoneInfos[i].name)) {
				phoneInfos[i].dataAllShow();
			}
		}
		
	}
	
	public void dataDelete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		for(int i=0; i<index; i++) {
			if(name.equals(phoneInfos[i].name)) {
				phoneInfos[i] = phoneInfos[i+1];
				index--;
			}
		}
	}

	public void dataAllShow() {
		
		for(int i=0; i<index; i++) {
			phoneInfos[i].dataAllShow();
		}

	}
}
