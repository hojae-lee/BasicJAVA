package project1;

import java.util.Scanner;

import project1.ver03.PhoneBookManager;

public class PhoneBookVer03 {

	public static void main(String[] args) {
		
		PhoneBookManager phoneBookManager = new PhoneBookManager();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			phoneBookManager.printMenu();
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("선택: "+num);
			
			switch(num){
			
            case 1:
            	phoneBookManager.dataInput();
                break;
            case 2:
            	phoneBookManager.dataSearch();
                break;
            case 3:
            	phoneBookManager.dataDelete();
                break;
            case 4:
            	phoneBookManager.dataAllShow();
                break;
            case 5:
            	System.out.println("종료하겠습니다.");
                flag = false;
                break;

        }
			
		}

	}

}
