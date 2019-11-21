package project1.ver08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import project2.ver04.Account;

public class PhoneBookManager implements SubMenuItem{
	
	HashSet<PhoneInfo> set = new HashSet<PhoneInfo>();
	boolean flag = true;
	private static int index = 0;
	
	public boolean search(String name) {
		Iterator<PhoneInfo> phoneinfo = set.iterator();
		while(phoneinfo.hasNext()) {
			PhoneInfo phoneinfos = phoneinfo.next();
			if(phoneinfos.name.equals(name)) {
				return true;
			}
		}
		return false;
	}

	public void printMenu() {

		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 주소록 출력");
		System.out.println("5. 프로그램 종료");
		
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
			
			if(search(name) == true) {
				Iterator<PhoneInfo> phoneinfo = set.iterator();
				while(phoneinfo.hasNext()) {
					PhoneInfo phoneinfos = phoneinfo.next();
					String newname = sc.nextLine();
					if(newname.equals(phoneinfos.name)==true) {
						System.out.println("중복된 이름이 발견 새로운 정보로 갱신하겠습니까? Y/N");
						String yesno = sc.nextLine();
						if(yesno.equals("Y")) {
							set.remove(phoneinfos);
						}
						else if(yesno.equals("N")) {
							return;
						}
					}
					
				}
			}			
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			set.add(new PhoneInfo(name,phonenumber));
			index++;
		}
		
		if(num ==y) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			if(search(name) == true) {
				Iterator<PhoneInfo> phoneinfo = set.iterator();
				while(phoneinfo.hasNext()) {
					PhoneInfo phoneinfos = phoneinfo.next();
					String newname = sc.nextLine();
					if(newname.equals(phoneinfos.name)==true) {
						System.out.println("중복된 이름이 발견 새로운 정보로 갱신하겠습니까? Y/N");
						String yesno = sc.nextLine();
						if(yesno.equals("Y")) {
							set.remove(phoneinfos);
							index--;
						}
						else if(yesno.equals("N")) {
							return;
						}
					}
					
				}
			}			
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			System.out.print("대학교:");
			String uni = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			set.add(new PhoneSchoolInfo(name, phonenumber, uni));
			index++;
		}
		if(num==z) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			if(search(name) == true) {
				Iterator<PhoneInfo> phoneinfo = set.iterator();
				while(phoneinfo.hasNext()) {
					PhoneInfo phoneinfos = phoneinfo.next();
					String newname = sc.nextLine();
					if(newname.equals(phoneinfos.name)==true) {
						System.out.println("중복된 이름이 발견 새로운 정보로 갱신하겠습니까? Y/N");
						String yesno = sc.nextLine();
						if(yesno.equals("Y")) {
							set.remove(phoneinfos);
							index--;
						}
						else if(yesno.equals("N")) {
							return;
						}
					}
					
				}
			}			
			System.out.print("전화번호: ");
			String phonenumber = sc.nextLine();
			System.out.print("회사:");
			String companey = sc.nextLine();
			
			System.out.println("데이터 입력이 완료 되었습니다.");
			set.add(new PhoneSchoolInfo(name, phonenumber, companey));
			index++;
		}

	}
	
	public void dataSearch() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		Iterator<PhoneInfo> phoneinfo = set.iterator();
		
		while(phoneinfo.hasNext()) {
			PhoneInfo phoneinfos = phoneinfo.next();
			for(int i=0; i<index; i++) {
				if(name.equals(phoneinfos.name)) {
					phoneinfos.dataAllShow();
				}
			}
		}

	}
	
	public void dataDelete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		Iterator<PhoneInfo> phoneinfo = set.iterator();
		
		while(phoneinfo.hasNext()) {
			PhoneInfo phoneInfos = phoneinfo.next();
			
			for(int i=0; i<index; i++) {
				if(name.equals(phoneInfos.name)) {
					set.remove(phoneInfos);
					index--;
				}
			}
		}
		
		
	}

	public void dataAllShow() {
		
		Iterator<PhoneInfo> phoneinfo = set.iterator();
		while(phoneinfo.hasNext()) {
			phoneinfo.next().dataAllShow();
		}
	}
	
	public void savePhone() {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/project1/ver08/phoneinfo_system.obj"));
			Iterator<PhoneInfo> accounts = set.iterator(); 
			out.write(index);
			while(accounts.hasNext()) {
				PhoneInfo phoneinfos = accounts.next();
				out.writeObject(phoneinfos);	
			}
			out.close();
			
		} catch (IOException e) {
			System.out.println("오류발생!");
			e.printStackTrace();
		}
	}
	
	public void printPhone() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/project1/ver08/phoneinfo_system.obj"));
			index = in.read();
			for(int i=0; i<index; i++) {
				set.add((PhoneInfo)in.readObject());
			}
			in.close();

		} 
		catch (IOException e) {
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
