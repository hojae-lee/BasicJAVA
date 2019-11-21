package project1;

import java.util.Scanner;

import project1.ver01.PhoneInfo;

public class PhoneBookVer02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String phonenumber = sc.nextLine();
		String birthday = sc.nextLine();
		
		PhoneInfo phoneInfo = new PhoneInfo(name,phonenumber,birthday);
		phoneInfo.showPhoneInfo();

	}

}
