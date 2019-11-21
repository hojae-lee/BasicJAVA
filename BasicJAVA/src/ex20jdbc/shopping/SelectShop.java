package ex20jdbc.shopping;

import ex20jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl{

	public SelectShop() {
		super(ORACLE_URL,"kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {			
//			stmt = con.createStatement();
			
			String query = "select g_idx,goods_name,to_char(goods_price,'9,999,000'),to_char(regidate,'yyyy-dd-mm hh24:mi'), p_code "
					+ " from sh_goods "
					+ " where goods_name like '%'|| ? ||'%'";
			
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, scanValue("찾는 상품이름"));
			
			rs = psmt.executeQuery();
						
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				String regi =rs.getString(4);
				String code = rs.getString(5);
				
				System.out.printf("%s %s %s %s %s",id,name,price, regi,code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
		
	}
	
	public static void main(String[] args) {

		new SelectShop().execute();
		
	}

}
