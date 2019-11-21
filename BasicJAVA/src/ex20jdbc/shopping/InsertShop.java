package ex20jdbc.shopping;

import ex20jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop() {
		super(ORACLE_URL, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			String query = "insert into sh_goods(g_idx,goods_name,goods_price,p_code) values (goods_seq.nextval,?,?,?)";
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			int affected = psmt.executeUpdate();
			
			System.out.println(affected+"행 입력완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new InsertShop().execute();
		
	}

}
