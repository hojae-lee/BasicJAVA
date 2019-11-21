package project2.ver03;

import java.util.Scanner;

public class AccountManager {

	private static Account[] accounts = new Account[50];
	private static int index = 0;

	Scanner sc = new Scanner(System.in);
	
	//고객정보계좌확인
	public static int checkCustomerInformation(String accountNumber){
		for(int i=0; i<index; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return i;
            }              
        }return -1;
    }

	//메뉴출력
	public void showMenu() {
		
			System.out.println("-----Menu-----");
			System.out.println("1.계좌개설");
			System.out.println("2.입    금");
			System.out.println("3.출    금");
			System.out.println("4.계좌정보출력");
			System.out.println("5.프로그램종료");
	}
	
	//계좌개설을 위한 함수
	public void makeAccount() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("***신규계좌개설***");
		System.out.println("-----계좌선택-----");
		System.out.println("1.보통계좌");
		System.out.println("2.신용신뢰계좌");
		int inputNum = sc.nextInt();
		
		System.out.println("선택:"+inputNum);
		
		if(inputNum ==1) {
			
			sc.nextLine();
			
			System.out.print("계좌번호 : ");
	        String accountNumber=sc.nextLine();
	        
	        System.out.print("이름 : ");
	        String name=sc.nextLine();
	 
	        System.out.print("금액 : "); 
	        int balance=sc.nextInt();
	        
	        System.out.print("기본이자%(정수형태로입력): ");
	        int rate = sc.nextInt();
	        
	        accounts[index] = new NormalAccount(accountNumber, name, balance, rate);
	        index++;
			
		}
		
		else if(inputNum ==2) {
			
			sc.nextLine();
			
			System.out.print("계좌번호 : ");
	        String accountNumber=sc.nextLine();
	        	 
	        System.out.print("이름 : ");
	        String name=sc.nextLine();
	 
	        System.out.print("금액 : "); 
	        int balance=sc.nextInt();
	        
	        System.out.print("기본이자%(정수형태로입력): ");
	        int rate = sc.nextInt();
	        
	        sc.nextLine();
	        System.out.print("신용등급(A,B,C등급): ");
	        String grade = sc.nextLine();
	        
	        accounts[index] = new HighCreditAccount(accountNumber, name, balance, rate, grade);
	        index++;
	        
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
        
	}
	
	//입금
	public void depositMoney() {
		
		System.out.println("계좌번호, 금액을 입력하세요.");
		String number = "";
		int money = 0;
		
		try {
			number = sc.nextLine();
			money = Integer.parseInt(sc.nextLine());
			
			int indexs = checkCustomerInformation(number);
			
			if(indexs != -1){
				if(money>0) {
					if(money%500==0) {
						accounts[indexs].deposit(money);
					}					
					else {
						System.out.println("금액은 500원단위로 입금가능합니다.");
					}
				}
				else {
					System.out.println("금액은 음수가 될 수 없습니다.");
				}
			}
			else{
				System.out.println("계좌번호가 존재하지 않습니다.");
			}
		}	
		
		catch (Exception e) {
			System.out.println("문자를 입력할수 없습니다.");
		}
	     
	    
	}
	
	//출금
	public void withdrawMoney() {
		
		System.out.println("계좌번호와 출금할 금액을 입력하세요.");
		
	    String number = "";  
	    int money = 0;
	    
	    try {
	    	number = sc.nextLine();
	    	money = Integer.parseInt(sc.nextLine());
			
	    	int indexs = checkCustomerInformation(number);
	    	
	    	if(indexs != -1){
	    		if(money>0 && money%1000 ==0) {
	    			if(accounts[indexs].getBalance()>money) {
	    				accounts[indexs].setBalance(accounts[indexs].getBalance()-money);
	    			}
	    			else {
	    				System.out.println("잔고가 부족합니다. 금액전체를 출금할까요?");
	    				System.out.println("YES: 금액전체출금처리");
	    				System.out.println("NO: 출금요청취소");
	    				String yesno = sc.nextLine();
	    				if(yesno.equals("YES")) {
	    					accounts[indexs].setBalance(accounts[indexs].getBalance()-accounts[indexs].getBalance());
	    				}
	    				else if(yesno.equals("NO")) {
	    					System.out.println("출금취소");
	    				}
	    				else {
	    					System.out.println("다시입력해주세요.");
	    				}
	    			}
	    		}
	    		else {
	    			System.out.println("금액이 음수이거나 1000원단위에 출금만 가능합니다.");
	    		}
	    		
	    	}
	    	else{
	    		System.out.println("계좌번호가 존재하지 않습니다.");
	    	}
		}
	    
	    catch (Exception e) {
			System.out.println("문자를 입력할 수 없습니다.");
		}
	    
	}

	//전체계좌정보출력
	public void showAccInfo() {
		for(int i=0; i<index; i++) {
			accounts[i].showAccInfo();
		}		
	}

	
}
