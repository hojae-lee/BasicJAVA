package ex20jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSQL {

	//멤버변수
	Connection con; //DB연결을 위한 객체
	Statement stmt; //쿼리실행 및 전송을 위한 객체
	
	public InsertSQL() {
		
		try {
			//1.오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2.커넥션 객체를 통해 연결.
			con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:orcl", "kosmo", "1234");
			
			System.out.println("오라클 DB 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("망햇어요~");
		}
		
	}
	
	//실제 쿼리작성 및 실행을 위한 메소드
	private void execute() {
		try {
			//3.Statement 계열의 객체 생성을 통한 쿼리실행 준비
			stmt = con.createStatement();
			
			//4.쿼리작성
			String sql = "INSERT INTO member values "
					+ " ('abc01011','47e81','oeioe',sysdate)";
			
			/*
			 5.쿼리실행 및 반환값 받기
			 
			 executeUpdate() : 쿼리문이 insert/delete/update와 같이 기존 레코드에 영향을 미치는 쿼리를 실행할때 사용한다.
			 	기존레코드에 영향을 미치는 쿼리를 실행 할 때 사용한다.
			 	실행 후 영향을 받은 행의 갯수가 반환된다.
			 	
			 executeQuery() : 쿼리문이 select일 때 호출하는 메소드로 레코드에 영향을 미치지않는쿼리를 실행한다.
			 즉 조회만 진행한다.
			 */
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 입력되었습니다.");
		} catch (SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
		}
		finally {
			close();
		}
	}
	
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB반납완료");
			
		} catch (SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}
	
	public static void main(String[] args) {

//		InsertSQL iSQL = new InsertSQL();
//		iSQL.execute();
		new InsertSQL().execute();
	}

}
