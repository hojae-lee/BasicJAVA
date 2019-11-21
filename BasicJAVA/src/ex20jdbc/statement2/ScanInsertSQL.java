package ex20jdbc.statement2;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class ScanInsertSQL extends IConnectImpl{

	public ScanInsertSQL(String url, String user, String pass) {
		super(url, user, pass);
	}
	
	@Override
	public void execute() {
		
		try {
			stmt = con.createStatement();
			while(true) {
				String id = scanValue("아이디");
				String pass = scanValue("패스워드");
				String name = scanValue("이름");
				
				
				String sql = "INSERT INTO member VALUES ("
						+" '"+ id +"', '"+ pass	+"', '"+ name+"' "
						+" , SYSDATE)";
				
				int affected = stmt.executeUpdate(sql);
				System.out.println(affected+"행이 입력됨");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new ScanInsertSQL(ORACLE_URL,"kosmo","1234").execute();
		
	}

}
