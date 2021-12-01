import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

public class MyConn02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		String jdbcUrl = "jdbc:mysql://localhost:3306/empdb?serverTtimezone=UTC"; // localhost:port��ȣ ����
		String dbUser = "���̵�";
		String dbPwd = "��й�ȣ";
		
//		String sqlSelect = "select * from dept10"; // Database�� ���� �ȵǾ��־ ���� 
		String sqlSelect = "select * from dept";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int iDeptno = 0; String sDname= null; String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�μ� ��ȣ �Է�=>"); iDeptno = sc.nextInt();
		System.out.println("�μ� �̸� �Է�=>"); sDname = sc.next();
		System.out.println("�μ� ��ġ �Է�=>"); sLoc = sc.next();
 		
//		String sqlInsert = "insert into Dept values(iDeptno, sDname, sLoc)"
		String sqlInsert = "insert into Dept values(?, ?, ?)"; // ������ �� �ڸ� ?�� �˷��� 
		
		
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			
			// 2. Database Connection ����
			// �ν� ������  -> conn ��ٸ� ���� 
			conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
			
			System.out.println("Connection ����");
			// 3. Statement ���� 
			pstmt = conn.prepareStatement(sqlInsert); 
			
			// 4. SQL ���� -> executeQuery(), executeUpdate()
			
			pstmt.setInt(1,iDeptno); // ù��° ����ǥ�� iDeptno�� ���� 
			pstmt.setString(2,sDname); 
			pstmt.setString(3,sLoc);  
			
			int resultCount =pstmt.executeUpdate();
			// 5. ResultSet(���) �ޱ� 
			rs = pstmt.executeQuery(sqlSelect);
			if (resultCount > 0) {System.out.println("���� �Է�");}
			else {System.out.println("�Է� �ȵ�");}
			
			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s \n", rs.getInt("deptno"), rs.getString(2), rs.getString("loc"));			
			}

			// 6. Database Connection ����
			System.out.println("����");
			// ��ٸ� -> ġ���
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
