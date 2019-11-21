package project2.ver05;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Types;

public class AccountDAO extends AccountConnect{
		
	public AccountDAO() {
		super(ORACLE_URL,"kosmo","1234");
	}
	
	@Override
	public void selectExecute() {
		
		try {
			stmt = con.createStatement();
			
			String sql = "select * from banking_tb";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String id = rs.getString("tb_id");
				String accountnumber = rs.getString("tb_number");
				String name = rs.getString("tb_name");
				String balance = rs.getString("tb_balance");
				
				System.out.printf("%s 계좌번호:%s 이름:%s 잔액:%s\n",id,accountnumber,name,balance);
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null) stmt.close(); //Statement 객체 반납
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	@Override
	public void insertExecute(String accountNumber,String owner,int balance) {
		try {
			
			csmt = con.prepareCall("{call callinsert(?,?,?,?)}");
			
			csmt.setString(1, accountNumber);
			csmt.setString(2, owner);
			csmt.setInt(3, balance);
			
			csmt.registerOutParameter(4, Types.NUMERIC);
			csmt.execute();
			
			int affected = csmt.getInt(4);
			
			if(affected == 0 ) {
				System.out.println(affected);
				System.out.println("계좌생성완료");
			}
			else {
				System.out.println("동일한 계좌가 있습니다.");
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		finally {
			try {
				if(csmt!=null) csmt.close();
			} catch (Exception e2) {
			}
		}
		
	}
	
	@Override
	public void updateExectue(String accountNumber, int balance) {
		try {
			
			csmt = con.prepareCall("{call callupdate(?,?)}");
			csmt.setString(1, accountNumber);
			csmt.setInt(2, balance);
			
			csmt.execute();
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				if(csmt!=null) csmt.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	@Override
	public void updateExecutetwo(String accountNumber, int balance) {
		try {
			csmt = con.prepareCall("{call callupdatetwo(?,?)}");
			csmt.setString(1, accountNumber);
			csmt.setInt(2, balance);
						
			csmt.execute();
		}
		catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("저희 은행은 마이너스통장을 만들 수 없습니다.");
		}
		catch (Exception e) {
		}
		finally {
			try {
				if(csmt!=null) csmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
