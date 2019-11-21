package ex20jdbc.prepared;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class UpdateSQL extends IConnectImpl{

	public UpdateSQL() {
		super(ORACLE_URL, "kosmo", "1234");
	}
	@Override
	public void execute() {
		String sql = "Update member "
				+ "SET name =?, pass=? "
				+ "WHERE id=?";
		
		try {
			psmt = con.prepareStatement(sql);
			
			while(true) {
				//인파라미터 입력 및 설정
				psmt.setString(3, scanValue("아이디"));
				psmt.setString(1, scanValue("이름"));
				psmt.setString(2, scanValue("패스워드"));
				
				int affected =psmt.executeUpdate();
				System.out.println(affected + "행이 업데이트 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
	}
	
	public static void main(String[] args) {

		new UpdateSQL().execute();
		
	}

}
