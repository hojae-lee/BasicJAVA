package project2;

import java.util.Scanner;

import project2.ver05.Account;
import project2.ver05.AccountConnect;
import project2.ver05.MenuChoice;

public class BankingSystemVer05 implements MenuChoice{

	public static void main(String[] args) {

		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
	
		
		while(flag){
			account.showMenu();
			int menu = sc.nextInt();
			
			switch(menu){
			
            case MAKE:
                account.makeAccount();
                break;
            case DEPOSIT:
                account.depositMoney();
                break;
            case WITHDRAW:
                account.withdrawMoney();
                break;
            case INQUIRE:
                account.showAccInfo();
                break;
            case EXIT:
            	System.out.println("종료하겠습니다.");
                flag = false;
                new AccountConnect().close();
                break;
            default:
                System.out.println("잘못입력하셨습니다.");

        }
			
		}
	
	}
	
}
