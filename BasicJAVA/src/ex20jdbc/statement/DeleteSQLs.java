package ex20jdbc.statement;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class DeleteSQLs extends IConnectImpl{
	
	public DeleteSQLs(String user, String pass) {
		super(user,pass);
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "DELETE from member WHERE id = 'test134'";
			stmt.executeUpdate(sql);
			
		} 
		catch (SQLException e) {
			System.out.println("SQL구문오류");
			e.printStackTrace();
		}
		finally {
			close();
		}
		
		
	}
	
	public static void main(String[] args) {

		new DeleteSQLs("kosmo","1234").execute();
		
	}

}
