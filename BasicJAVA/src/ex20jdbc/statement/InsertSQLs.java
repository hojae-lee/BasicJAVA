package ex20jdbc.statement;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class InsertSQLs extends IConnectImpl{

	public InsertSQLs(String user, String pass) {
		super(user,pass);
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "INSERT INTO bbs VALUES (30,'제목입니다','내용입니다',sysdate,'test1')";
			stmt.executeUpdate(sql);
			System.out.println("작성완료");
		} 
		catch (SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new InsertSQLs("kosmo","1234").execute();
		
	}

}
