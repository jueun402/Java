package com.my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 1. JDBC ����̹� �ε�
// 2. Database Connection ���� 
// 3. Database Connection ���� 

public class DBConn {
	
	// Connection �޼ҵ� 
	public static Connection getConnection() throws SQLException{
		// SQLException = �Լ� ����ó�� 
		// static : ��������� �÷����� ��� ��� 
		
		Connection conn = null; // DB ���� ���� ��ü 

		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";
		String dbUser = "root"; // DB ID 
		String dbPwd = "1234"; // DB PW 
		
		conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
		
		return conn;
	}
	

}
