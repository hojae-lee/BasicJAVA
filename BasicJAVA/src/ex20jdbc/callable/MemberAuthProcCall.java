package ex20jdbc.callable;

import java.sql.Types;

import ex20jdbc.connect.IConnectImpl;

public class MemberAuthProcCall extends IConnectImpl{

	public MemberAuthProcCall() {
		super(ORACLE_URL, "kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{ call KosmoMemberAuth(?,?,?)}");
			
			csmt.setString(1, scanValue("회원아이디"));
			csmt.setString(2, scanValue("회원 패스워드"));
			//Out파라미터 설정
			csmt.registerOutParameter(3, Types.NUMERIC);
			
			csmt.execute();
			
			int outParamResult = csmt.getInt(3);
			
			switch (outParamResult) {
			case 0:
				System.out.println("회원아이디가 없어요. 회원가입해주삼");
				break;
			case 1:
				System.out.println("패스워드가 일치하지 않아요 비번찾으삼.");
				break;
			case 2:
				System.out.println("회원님 방가하이요");
				break;
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new MemberAuthProcCall().execute();
		
	}

}
