import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyConn03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/empdb?serverTimezone=UTC";
		String dbUser  = "root";
		String dbPwd   = "1234";
		
		String sqlSelect = "select * from dept10";
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		int iDeptno = 0; String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �μ� ��ȣ �Է� => "); iDeptno = sc.nextInt(); 
		System.out.println("�ٲ� �μ� ��ġ �Է� => "); sLoc = sc.next();
		
		String sqlUpdate = "update dept10 set loc = ? where deptno = ?"; 
				
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			// 2. Database Connection ����
			conn = DriverManager.getConnection(jdbcUrl,dbUser,dbPwd );
			
			System.out.println("Connection ����");
			// 3. Statement ����
			pstmt = conn.prepareStatement(sqlUpdate);
			// 4. SQL ���� --> executeQuery(), executeUpdate()
						
			pstmt.setInt(2, iDeptno); 
			pstmt.setString(1, sLoc);
			
			int resultCount = pstmt.executeUpdate();
			// 5. ResultSet(���) �ޱ�
			rs = pstmt.executeQuery(sqlSelect);
			
			if(resultCount > 0 ) {System.out.println("���� ����"); }
			else {System.out.println("���� �ȵ�"); }
				
			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s %n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}	
			
			// 6. Database Connection ����
			System.out.println("Connection ����");
			pstmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.printf("Exception: \r\n %s", e);
			System.out.println("���� �ȵ�");
		}
		catch(ClassNotFoundException e) {
			System.out.printf("Exception: \r\n %s", e);
			System.out.println("Driver �ε� ����");
		}
	}

}
