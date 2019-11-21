package ex20jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex20jdbc.connect.IConnectImpl;
/*
 
 1] 프로시저를 실행하기 위한 CallableStatement 객체 생성
 - 프로시저 호출시에는 {call 프로시저명(?,?,?,?)}
 - 파라미터 in,out 순서없이 작성이 가능함. 즉 프로시저 정의에 따라 달라지게 됨
 
 2] 파라미터 설정
 	2-1] in파라미터 설정 : ? 에 해당하는 순서대로 setxxx()로 설정함.
 	2-2] out파라미터 설정
 		registerOutParameter(인덱스,java.sql.Types의 변수형)
 		으로 자료형 설정
 		
 3] 프로시저 실행
 
 */
public class InsertProcCall extends IConnectImpl{

	public InsertProcCall() {
		super(ORACLE_URL,"kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			//1] 객체생성후 프로시저 호출
			csmt = con.prepareCall("{call KosmoMemberInsert(?,?,?,?)}");
			//2-1] In파라미터 설정
			csmt.setString(1, scanValue("아이디"));
			csmt.setString(2, scanValue("패스워드"));
			csmt.setString(3, scanValue("이름"));
			//2-2] Out파라미터의 반환값의 자료형
			csmt.registerOutParameter(4, Types.NUMERIC);
			//3] 실행
			csmt.execute();
			//4] Out파라미터의 할당된 값을 읽어서 결과출력
			
			int affected = csmt.getInt(4);
			if(affected == 0) System.out.println("오류발생: 입력실패");
			else System.out.println(affected+ "행 입력성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new InsertProcCall().execute();
		
	}

}
