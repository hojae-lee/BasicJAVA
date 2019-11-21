package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver05.MenuItem;
import project1.ver05.PhoneBookManager;
import project1.ver06.MenuSelectException;

public class PhoneBookVer06 implements MenuItem{

	public static void main(String[] args) {
		
		PhoneBookManager phoneBookManager = new PhoneBookManager();
		MenuSelectException ex = new MenuSelectException();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			
			phoneBookManager.printMenu();
			int num = 0;
			try {
				num = Integer.parseInt(sc.nextLine());
				ex.menuread(num);
			}
			catch(InputMismatchException e) {
			}
			catch (NumberFormatException e) {
				System.out.println("문자를 입력할 수 없습니다.");
			}
			catch (MenuSelectException e) {
			}
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
