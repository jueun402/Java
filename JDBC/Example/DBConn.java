package com.my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 1. JDBC 드라이버 로드
// 2. Database Connection 연결 
// 3. Database Connection 해지 

public class DBConn {
	
	// Connection 메소드 
	public static Connection getConnection() throws SQLException{
		// SQLException = 함수 예외처리 
		// static : 공용공간에 올려놓고 계속 사용 
		
		Connection conn = null; // DB 연결 위한 객체 

		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";
		String dbUser = "root"; // DB ID 
		String dbPwd = "1234"; // DB PW 
		
		conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
		
		return conn;
	}
	

}
