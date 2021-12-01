import java.sql.*;
import java.util.*;


public class MyConn01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JDBC ����̹� �ε�
		// Database Connection ����
		// Statement ���� 
		// SQL ���� --> executeQuery(), executeUpdate()
		// ResultSet(���) �ޱ� 
		// Database Connection ���� 
		
		// JDBC ����̹� �ε�
		// MySQL + ������ JAR������ �����;� �� 

		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";

		try {
		Class.forName(jdbcDriver);
		// Database Connection ����

		Connection conn = DriverManager.getConnection(jdbcUrl,"���̵�","��й�ȣ");		
		
		// Statement ���� 
		String sql = "select * from dept";
		Statement stmt = conn.createStatement();

		// SQL ���� --> executeQuery(), executeUpdate()
		// ResultSet(���) �ޱ� 
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

			
		// Database Connection ���� 
		stmt.close();
		conn.close();
		
	}

	catch(Exception e) {
		System.out.println("���� �ȵ�");
	}
	}
}
