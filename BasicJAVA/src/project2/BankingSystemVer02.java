package project2;

import java.util.Scanner;

import project2.ver02.AccountManager;
import project2.ver02.MenuChoice;

public class BankingSystemVer02 implements MenuChoice{

	public static void main(String[] args) {
		
		AccountManager accountManager = new AccountManager();
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
	
		
		while(flag){
			accountManager.showMenu();
			int menu = sc.nextInt();
			
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
            	System.out.println("종료하겠습니다.");
                flag = false;
                break;
            default:
            	System.out.println("잘못입력하셨습니다.");

        }
			
		}

	}

}
