package project2.ver05;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AccountConnect implements IAccontConnect{

	public Connection con;
	public Statement stmt;	//정적쿼리 처리를 위한 객체
	public PreparedStatement psmt;	//동적쿼리 처리를 위한 객체
	public ResultSet rs; //select문사용시 쿼리에 실행결과를 저장하는 객체
	public CallableStatement csmt;
	
	public AccountConnect() {
		//하는일 없음
	}
	
	public AccountConnect(String user, String pass) {
		try {
			Class.forName(ORACLE_DRVIER);
			//오라클 연결
			connect(user, pass);
		} 
		catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();	
		}
	}
	
	public AccountConnect(String url,String user, String pass) {
		try {
			Class.forName(ORACLE_DRVIER);
			//오라클 연결
			connect(user, pass);
		} 
		catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();	
		}
	}
	
	
	@Override
	public void connect(String user, String pass) {
		
		try {
			con = DriverManager.getConnection(ORACLE_URL, user, pass);
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void connect(String url,String user, String pass) {
		
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
		
	}

	//오버라이딩의 목적으로만 정의한 메소드. 쿼리실행은 해당 클래스에서 진행
	@Override
	public void selectExecute() {
		//하는일 없음
	}
	
	@Override
	public void insertExecute(String accountNumber,String owner,int balance) {
		//하는일 없음
	}
	
	@Override
	public void updateExectue(String accountNumber, int balance) {
		//하는일 없음.
	}
	@Override
	public void updateExecutetwo(String accountNumber, int balance) {
		// 하는일 없음.
		
	}

	@Override
	public void close() {
		
		try {
			if(stmt!=null) stmt.close(); //Statement 객체 반납
			if(con!=null) con.close(); //Connection 객체 반납
			if(psmt!=null) psmt.close(); //PreparedStatement 객체 반납
			if(rs!=null) rs.close();	//ResultSet 객체 반납
			if(csmt!=null) csmt.close();
			System.out.println("자원반납완료~");
		} catch (Exception e) {
			System.out.println("자원 반납식 오류발생");
			e.printStackTrace();
		}
		
	}
	

}
