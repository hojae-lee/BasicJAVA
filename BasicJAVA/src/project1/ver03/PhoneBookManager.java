package project1.ver03;

import java.util.Scanner;

public class PhoneBookManager {
	
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
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phonenumber = sc.nextLine();
		System.out.print("생년월일: ");
		String birthday = sc.nextLine();
		
		System.out.println("데이터 입력이 완료 되었습니다.");
		phoneInfos[index++] = new PhoneInfo(name,phonenumber,birthday);
		

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
				i--;
			}
		}
	}

	public void dataAllShow() {
		
		for(int i=0; i<index; i++) {
			phoneInfos[i].dataAllShow();
		}

	}
}
