package ex20jdbc.shopping;

import ex20jdbc.connect.IConnectImpl;

public class SelectShopState extends IConnectImpl{
	
	public SelectShopState() {
		super(ORACLE_URL,"kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {			
			stmt = con.createStatement();
			
			String query = "select g_idx,goods_name, "
					+ "to_char(goods_price,'9,999,000'), "
					+ "to_char(regidate,'yyyy-dd-mm hh24:mi'), p_code "
					+ " from sh_goods ";
			
			String search = scanValue("찾는 상품이름");
			
			String sql = query+ " where goods_name "
					+ " like '%"
					+ search
					+ "%' ";
			
			rs = stmt.executeQuery(sql);
						
			while(rs.next()) {
				String id = rs.getString("g_idx");
				String name = rs.getString("goods_name");
				String price = rs.getString(3);
				String regi =rs.getString(4);
				String code = rs.getString("p_code");
				
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

		new SelectShopState().execute();
		
	}

	
	
}
