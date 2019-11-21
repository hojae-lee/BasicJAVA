package project1;

import java.util.Scanner;

import project1.ver05.MenuItem;
import project1.ver05.PhoneBookManager;

public class PhoneBookVer05 implements MenuItem{

	public static void main(String[] args) {
		
		PhoneBookManager phoneBookManager = new PhoneBookManager();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			phoneBookManager.printMenu();
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("선택: "+num);
			
			switch(num){
			
            case A:
            	phoneBookManager.dataInput();
                break;
            case B:
            	phoneBookManager.dataSearch();
                break;
            case C:
            	phoneBookManager.dataDelete();
                break;
            case D:
            	phoneBookManager.dataAllShow();
                break;
            case E:
            	System.out.println("종료하겠습니다.");
                flag = false;
                break;

        }
			
		}

	}

}
