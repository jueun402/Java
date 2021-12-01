import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;

public class MyConn03 {

	public static void main(String[] args) {

		
		Connection conn = null; // DB ���� ���� ��ü 
		PreparedStatement pstmt = null; // SQL���� DB�� ������ ���� ��ü 

		// 1. JDBC Driver 
		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		
		// 2. DB���� ���� ���� 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";
		String dbUser = "���̵�"; // DB ID 
		String dbPwd = "��й�ȣ"; // DB PW 

		// ���� �Է� 
		ResultSet rs = null;		
		String sqlSelect = "select * from dept10";
		String sqlUpdate = "update Dept10 d set d.loc =?, where d.deptno = ?";

		// �Է¹��� ���� 
		int iDeptno = 0; String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ� ��ȣ �Է�=>"); iDeptno = sc.nextInt();
		System.out.println("������ ��ġ �Է�=>"); sLoc = sc.next();
		
		try {
			// JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			
			// Database Connection 
			conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
			System.out.println("Connection ����");
			
			// prepareStatement ���� -> SQL���� ���� 
			pstmt = conn.prepareStatement(sqlUpdate);
			
			// SQL ���� 			
			pstmt.setInt(1,iDeptno); 
			pstmt.setString(2,sLoc);  
			
			int resultCount =pstmt.executeUpdate();
			if (resultCount > 0) {System.out.println("���� ����");}
			else {System.out.println("���� �ȵ�");}
			
			rs = pstmt.executeQuery(sqlSelect);

			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s \n", rs.getInt("deptno"), rs.getString(2), rs.getString("loc"));			
			}
			// 6. Database Connection ����
			System.out.println("����");
			pstmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.printf("Exception : \r\n %s",e);
			System.out.println("����ȵ�");
		}

		catch(ClassNotFoundException e) {
			System.out.printf("Exception : \r\n %s",e);
			System.out.println("Driver �ε� ���� ");
		}
		
	}

}
