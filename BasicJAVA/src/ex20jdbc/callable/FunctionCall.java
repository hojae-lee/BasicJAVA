package ex20jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex20jdbc.connect.IConnectImpl;
/*
 JAVA에서 함수 혹은 프로시저 호출하기
 1] 오라클에서 정의한 함수를 실행하기 위한 CallableStatement 객체 생성
 -Connection객체의 prepareCall()메소드로 생성한다.
 -형식
 	prepareCall("{? = call 함수명(매개변수1,매개변수2....)}");
 -첫번째 물음표는 반환값을 의미함
 	반환값은 파라미터 설정시 java.sql.Types클래스의 자료형으로 설정.
 	
 2]아웃 파라미터 설정
 -함수는 반환값이 1개이므로 인덱스는 무조건1이다.
 
 3]매개변수는 인파라미터 즉 setXXX()계열의 메소드를 이용한다.
 
 4]함수실행은 execute() 메소드를 이용한다.
 
 5]반환값은 무조건1개이므로 인덱스는 1이고 getXXX()계열의 함수로 읽어온다.
 */
public class FunctionCall extends IConnectImpl{
	
	public FunctionCall() {
		super(ORACLE_URL,"kosmo","1234");
	}

	@Override
	public void execute() {
		try {
			//1]객체생성
			csmt = con.prepareCall("{? = call fillAsterik(?)}");
			//2]반환값의 자료형 설정
			csmt.registerOutParameter(1, Types.VARCHAR);
			//3]in파라미터 설정
			csmt.setString(2, scanValue("아이디"));
			//4]실행
			csmt.execute();
			//5]out파라미터를 콘솔에 출력
			System.out.println("함수의 반환값"+ csmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	public static void main(String[] args) {

		new FunctionCall().execute();
		
	}

}
