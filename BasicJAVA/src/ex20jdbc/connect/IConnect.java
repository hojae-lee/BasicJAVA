package ex20jdbc.connect;

public interface IConnect {
	
	/*
	 멤버상수
	 	: interface에 선언된 변수는 무조건 public static final이 붙어 정적 상수로 선언된다.
	 */
	String ORACLE_DRVIER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin://@localhost:1521:orcl";
	
	/*
	 멤버메소드
	 	: public abstract 가 붙어서 추상 메소드로 선언된다.
	 */
	void connect(String user, String pass);
	void connect(String url,String user, String pass);
	void execute();
	void close();
	//사용자 입력을 위한 추상메소드 선언
	String scanValue(String title);
	
}
