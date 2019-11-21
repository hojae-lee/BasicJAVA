package ex20jdbc.statement;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class UpdateSQL extends IConnectImpl{

	public UpdateSQL(String user, String pass) {
		super(user, pass);
	}
	
	@Override
	public void execute() {

		try {
			stmt = con.createStatement();
			
			String sql = "UPDATE member "
					+ " SET "
					+ " 	pass='8888', "
					+ " 	name='testupdate', "
					+ " 	regidate=sysdate "
					+ " WHERE id = 'test1' ";
			System.out.println("sql= "+ sql);
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected+"행이 업데이트됨");
			
		} catch (SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	
	}
	
	public static void main(String[] args) {

		new UpdateSQL("kosmo","1234").execute();
		
	}

}
