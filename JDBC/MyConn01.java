import java.sql.*;
import java.util.*;


public class MyConn01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JDBC 드라이버 로드
		// Database Connection 연결
		// Statement 생성 
		// SQL 전송 --> executeQuery(), executeUpdate()
		// ResultSet(결과) 받기 
		// Database Connection 해제 
		
		// JDBC 드라이버 로드
		// MySQL + 버전의 JAR파일을 가져와야 함 

		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";

		try {
		Class.forName(jdbcDriver);
		// Database Connection 연결

		Connection conn = DriverManager.getConnection(jdbcUrl,"아이디","비밀번호");		
		
		// Statement 생성 
		String sql = "select * from dept";
		Statement stmt = conn.createStatement();

		// SQL 전송 --> executeQuery(), executeUpdate()
		// ResultSet(결과) 받기 
		ResultSet rs = stmt.executeQuery(sql);
		
//		while(rs.next()) {
//			System.out.print(rs.getInt(1));
//			System.out.print(" "+rs.getString(2)+" ");
//			System.out.print(rs.getString("loc"));
//			System.out.println();
//		}
		
		while(rs.next()) {
			System.out.printf("%d ,", rs.getInt("deptno"));
			System.out.printf("%-10s ,", rs.getString(2));
			System.out.printf("%-10s", rs.getString("loc"));
			System.out.println();			
		}
		
		while(rs.next()) {
			System.out.printf("%d | %-10s | %-10s \n", rs.getInt("deptno"), rs.getString(2), rs.getString("loc"));
		
		}

			
		// Database Connection 해제 
		stmt.close();
		conn.close();
		
	}

	catch(Exception e) {
		System.out.println("연결 안됨");
	}
	}
}
