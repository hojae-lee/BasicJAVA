package ex20jdbc.prepared;

import ex20jdbc.connect.IConnectImpl;

public class DeleteSQL extends IConnectImpl{

	@Override
	public void execute() {
		try {
			connect(ORACLE_URL, "kosmo", "1234");
			
			String query = "DELETE from member WHERE id = ?";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, scanValue("삭제할아이디"));
			System.out.println(psmt.executeUpdate()+"행이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}

	public static void main(String[] args) {
		new DeleteSQL().execute();
	}

}
