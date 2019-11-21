package ex20jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 JDBC
 	: 자바언어로 데이터베이스를 연결해서 CRUD를 할 수 있도록 해주는 기술.
 	
 	※ CRUD : Create(생성) read(읽기) update갱신,수정 delete삭제 를 묶어서 일컫는 말로
 			DB의 기본기능을 말한다.
 */

public class DBConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		/*
		 JDBC 프로그래밍 절차
		 
		 1] 오라클용 JDBC드라이버를 메모리에 로드함
		 	: Class.forName(패키지를 포함한 클래스명)
		 	new를 사용하지 않고 클래스명으로 직접 찾아서 객체생성 후 메모리에 로드하는 메소드.
		 	메모리에 로딩된 드라이버가 DriverManager라는 클래스에 등록된다.
		 */
		Class.forName("oracle.jdbc.OracleDriver");
		
		/*
		 2] 오라클에 연결하기 위한 커넥션URL, 계정ID, 패스워드를 준비
		 	커넥션 URL ->
		 		jdbc:oracle:thin://@IP주소:포트번호:SID
		 	※서버환경에 따라서 ip주소, 포트, sid는 변경될수 있따. 
		 */
		
		String url = "jdbc:oracle:thin://@localhost:1521:orcl";
		String userid = "hr";
		String userpw = "1234";
		
		/*
		 2-1] DrivaerManager 클래스의 getConnection()메소드를 호출하여 오라클에 연결을 시도한다.
		 성공할 경우 연결된 주소를 반환한다.
		 */
		
		Connection con = DriverManager.getConnection(url, userid, userpw);
		
		if(con!=null) {
			System.out.println("Oracle DB 연결성공");
			
			/*
			 3] 쿼리문 작성
			 	: 쿼리문을 작성할 때 주의할점은 줄바꿈을 할 떄 앞뒤로 스페이스를 하는것이 좋다.
			 	그렇지 않으면 문장이 서로 이어지게 되어 SyntaxError가 발생하게 된다.
			 */
			String sql = "SELECT "
					+" employee_id, first_name, last_name, hire_date,salary " 
					+" FROM employees " 
					+" WHERE department_id = 50 "
					+" ORDER BY salary DESC";
			
			
			/*
			 4] 쿼리문 전송을 위한 Statement계열의 객체를 생성한다.
			 */
			Statement stmt = con.createStatement();

			/*
			 5] Statement객체의 con.createStatement()메소드를 호출하영 오라클로 쿼리문을 전송한다.
			 쿼리 실행 후 오라클은 JAVA쪽으로 처리된 결과를 반환하게 된다.
			 */
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				/*
				 오라클이 반환해준 ResultSet객체의 갯수만큼 반복하면서 콘솔에 출력한다.
				 getXXX()계열의 함수의 인자로는 select절의 순서대로 인덱스를 쓸수도있고 컬럼명을 써도 상관없다.
				 */
				String emp_id = rs.getString(1);
				String f_name = rs.getString("first_name");
				String l_name = rs.getString(3);
				java.sql.Date h_date = rs.getDate(4);
				int sal = rs.getInt(5);
				
				System.out.printf("%-5s %-10s %-10s %-13s %-5s\n", emp_id,f_name,l_name,h_date,sal);
			}
			
			/*
			 6] 자원반납 : 모든 작업을 마친후에는 메모리 절약을 위해 연결했던 자원을 반납한다.
			 */
			rs.close();
			stmt.close();
			con.close();
		}
		else {
			System.out.println("연결실패 ㅜㅠ");
		}
		
	}

}
