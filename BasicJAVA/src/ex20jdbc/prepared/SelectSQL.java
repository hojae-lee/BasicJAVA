package ex20jdbc.prepared;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class SelectSQL extends IConnectImpl{

	public SelectSQL() {
		super(ORACLE_URL,"kosmo","1234");
	}
	
	@Override
	public void execute() {
		
		try {
			while(true) {
				String sql = "SELECT * FROM member "
						+ "WHERE name like '%'|| ? ||'%'";
				
				psmt = con.prepareStatement(sql);
				psmt.setString(1, scanValue("찾는이름"));
				rs = psmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString(1);
					String pass = rs.getString(2);
					String name = rs.getString(3);
					String regidate = rs.getString(4).substring(0,10);
					
					System.out.printf("%s %s %s %s\n",id,pass,name,regidate);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}
	
	public static void main(String[] args) {

		new SelectSQL().execute();
		
	}

}
