package project2;

import java.util.InputMismatchException;
import java.util.Scanner;

import project2.ver04.*;

public class BankingSystemVer04 implements MenuChoice{

	public static void main(String[] args) {
		
		AccountManager accountManager = new AccountManager();
		MenuSelectException ex = new MenuSelectException();
		accountManager.printBanking();
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
	
		
		while(flag){
			accountManager.showMenu();
			
			int menu = 0;
			
			try {
				menu = Integer.parseInt(sc.nextLine());
				ex.menuread(menu);//메뉴선택 예외처리.
			}
			
			catch(InputMismatchException e) {
			}
			catch (NumberFormatException e) {
				System.out.println("문자를 입력할 수 없습니다.");
			}
			catch (MenuSelectException e) {
				// TODO: handle exception
			}
			
			switch(menu){
			
            case MAKE:
            	accountManager.makeAccount();
                break;
            case DEPOSIT:
            	accountManager.depositMoney();
                break;
            case WITHDRAW:
            	accountManager.withdrawMoney();
                break;
            case INQUIRE:
            	accountManager.showAccInfo();
                break;
            case EXIT:
            	accountManager.saveBanking();
            	System.out.println("종료하겠습니다.");
                flag = false;
                break;

        }
			
		}

	}

}
