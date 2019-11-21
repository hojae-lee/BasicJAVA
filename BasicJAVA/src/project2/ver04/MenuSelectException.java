package project2.ver04;

public class MenuSelectException extends Exception{

	public int menuread(int menu) throws MenuSelectException{	

		MenuSelectException ex = new MenuSelectException();
		if(menu >5 || menu<1) {
			System.out.println("잘못입력하였습니다.");
			throw ex;
		}	
		return 0;
	}

}
