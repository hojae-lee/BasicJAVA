package project2.ver04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AccountManager {

	HashSet<Account> set = new HashSet<Account>();
	private static int index = 0;
	
	Scanner sc = new Scanner(System.in);
	
	//계좌번호확인을 위한 불리언 타입에 메소드
	//입력한 계좌번호와 원래 가지고 있는 계좌번호가 같다면 true
	public boolean search(String accountNumber) {
		Iterator<Account> acc = set.iterator();
		while(acc.hasNext()) {
			Account account = acc.next();
			if(account.getAccountNumber().equals(accountNumber)) {
				return true;
			}
		}
		return false;
	}
	
	public Account accounting(String accountNumber) {
		Iterator<Account> acc = set.iterator();
		while(acc.hasNext()) {
			Account account = acc.next();
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
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
	  
	        if(search(accountNumber) == true) {
	        	Account accs = accounting(accountNumber);
	        	System.out.println("중복된 계좌가 발생 새로운 정보로 갱신하겠습니까? Y/N");
	        	String accString = sc.nextLine();
	        	if(accString.equals("Y")) {
	        		set.remove(accs);
	        		index--;
	        	}
	        	else if(accString.equals("N")) {
	        		return;
	        	}
	        }
	        
	        System.out.print("이름 : ");
	        String name=sc.nextLine();
	 
	        System.out.print("금액 : "); 
	        int balance=sc.nextInt();
	        
	        System.out.print("기본이자%(정수형태로입력): ");
	        int rate = sc.nextInt();
	        
        	set.add(new NormalAccount(accountNumber, name, balance, rate));
        	index++;
		}
		
		else if(inputNum ==2) {
			
			sc.nextLine();
			
			System.out.print("계좌번호 : ");
	        String accountNumber=sc.nextLine();
	        
	        if(search(accountNumber) == true) {
	        	Account accs = accounting(accountNumber);
	        	System.out.println("중복된 계좌가 발생 새로운 정보로 갱신하겠습니까? Y/N");
	        	String accString = sc.nextLine();
	        	if(accString.equals("Y")) {
	        		set.remove(accs);
	        	}
	        	else if(accString.equals("N")) {
	        		return;
	        	}
	        }
	        	 
	        System.out.print("이름 : ");
	        String name=sc.nextLine();
	 
	        System.out.print("금액 : "); 
	        int balance=sc.nextInt();
	        
	        System.out.print("기본이자%(정수형태로입력): ");
	        int rate = sc.nextInt();
	        
	        sc.nextLine();
	        System.out.print("신용등급(A,B,C등급): ");
	        String grade = sc.nextLine();
	        
	        set.add(new HighCreditAccount(accountNumber, name, balance, rate, grade));
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
			
			Iterator<Account> accounts = set.iterator();
			
			while(accounts.hasNext()) {
				Account account = accounts.next();
				if(number.equals(account.getAccountNumber())){
					if(money>0) {
						if(money%500==0) {
							accounting(number).deposit(money);
						}					
						else {
							System.out.println("금액은 500원단위로 입금가능합니다.");
						}
					}
					else {
						System.out.println("금액은 음수가 될 수 없습니다.");
					}
				}
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
			
	    	Iterator<Account> accounts = set.iterator();
	    	while(accounts.hasNext()) {
	    		Account account = accounts.next();
	    		if(number.equals(account.getAccountNumber())){
	    			if(money>0 && money%1000 ==0) {
	    				if(account.getBalance()>money) {
	    					accounting(number).withdraw(money);
	    				}
	    				else {
	    					System.out.println("잔고가 부족합니다. 금액전체를 출금할까요?");
	    					System.out.println("YES: 금액전체출금처리");
	    					System.out.println("NO: 출금요청취소");
	    					String yesno = sc.nextLine();
	    					if(yesno.equals("YES")) {
	    						accounting(number).withdrawsame(money);
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
	    	}
	    	}
	    	
	    
	    catch (Exception e) {
			System.out.println("문자를 입력할 수 없습니다.");
		}
	    
	}
	
	public void showAccInfo() {
		Iterator<Account> accounts = set.iterator();
		while(accounts.hasNext()) {
			accounts.next().showAccInfo();
		}
	}
	
	public void saveBanking() {
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/project2/ver04/banking_system.obj"));
			Iterator<Account> accounts = set.iterator(); 
			out.write(index);
			while(accounts.hasNext()) {
				Account acc = accounts.next();
				out.writeObject(acc);	
			}
			out.close();
			
		} catch (IOException e) {
			System.out.println("오류발생!");
			e.printStackTrace();
		}
	}
	
	public void printBanking() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/project2/ver04/banking_system.obj"));
			index = in.read();
			for(int i=0; i<index; i++) {
				set.add((Account)in.readObject());
			}
			in.close();

		}
		catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. ^^");
		}
		catch (IOException e) {
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	
}
