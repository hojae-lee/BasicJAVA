package ex20jdbc.shopping;

import java.sql.Types;

import ex20jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{

	public UpdateShop() {
		super(ORACLE_URL, "kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			csmt.setString(1, scanValue("상품의 일련번호"));
			csmt.setString(2, scanValue("상품이름"));
			csmt.setString(3, scanValue("상품가격"));
			csmt.setString(4, scanValue("제품코드"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			System.out.println("수정성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	public static void main(String[] args) {

		new UpdateShop().execute();
		
	}

}
