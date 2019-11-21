package ex20jdbc.statement;

import java.sql.SQLException;

import ex20jdbc.connect.IConnectImpl;

public class SelectSQL extends IConnectImpl{
	
	public SelectSQL(String url, String user, String pass) {
		super(url,user,pass);
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			//getString() getDate()메소드 둘 다 사용할 수 있따.
//			String query = "SELECT id,pass,name,regidate FROM member ORDER BY regidate desc";
			
			//날짜를 to_char함수를 이용하여 문자형으로 변환했으므로
			//추출시 getDate()를 사용할 수없다.
			String query = "SELECT id,pass,name,"
					+ "to_char(regidate,'yyyy.mm.dd hh24:mi') date_fomat1 "
					+ "FROM member "
					+ "ORDER BY regidate desc";
			
			/*
			 Resultset 클래스
			 : select문 실행시 쿼리의 실행결과가 ResultSet객체에 저장된다.
			 결과로 반환된 레코드의 처음부터 마지막까지 next메소드를 통해 확인후 반복하면서 추출하게 된다.
			 
			 -getXXX()계열의 메소드
			  오라클의 자료형이
			  	number타입 : getInt()
			  	char/varchar2 타입 : getString()
			  	date타입 : getDate() 메소드로 각 컬럼을 추출한다.
			  	인자는 select절의 컬럼순서대로 인덱스값을 사용하거나 컬럼명을 사용할수 있따.
			  	단 자료형에 상관없이 모두 getString()으로 추출할 수 있따.
			 */
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString("pass");
				String name = rs.getString("name");
//String regidate = rs.getString(4).substring(0,10);
//별칭사용
String regidate =rs.getString("date_fomat1");
//String regidate = rs.getString(4);//.substring(0,10); 2019-05-22 10:12:09 초단위까지
//java.sql.Date regidate = rs.getDate("regidate"); //결과 : 2019-05-22
/*
 -오라클의 Date타입을 getDate()로 추출하는 경우 년-월-일 만 반환한다. 이 경우 Date형 자료가 되기 때문에 반드시
  java.sql.Date클래스의 참조변수에 저장해야 한다.
 -오라클의 Date타입을 getString()으로 추출하는 경우 년/월/일/ 시:분:초 까지 반환함.
  문자열을 잘라서 출력하고 싶을때는 substring()을 사용한다.
  
  ※ 내가 원하는 형태대로 날짜를 출력하고 싶다면 to_char()와 같은 변환함수를 사용하여 쿼리에 적용한다.
 */
				System.out.printf("%s %s %s %s\n",id,pw,name,regidate); //날짜 포멧 그대로 가져오는것.
			}
		} catch (SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {

		SelectSQL selectSQL = new SelectSQL(ORACLE_URL, "kosmo", "1234");
		selectSQL.execute();
		
	}

}
