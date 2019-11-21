package project2.ver05;

public interface IAccontConnect {
	
	String ORACLE_DRVIER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin://@localhost:1521:orcl";
	
	/*
	 멤버메소드
	 	: public abstract 가 붙어서 추상 메소드로 선언된다.
	 */
	void connect(String user, String pass);
	void connect(String url,String user, String pass);
	void close();
	//사용자 입력을 위한 추상메소드 선언
	void selectExecute();
	void insertExecute(String accountNumber, String owner, int balance);
	void updateExectue(String accountNumber, int balance);
	void updateExecutetwo(String accountNumber, int balance);
	
}
