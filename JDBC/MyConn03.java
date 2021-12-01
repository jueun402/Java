import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;

public class MyConn03 {

	public static void main(String[] args) {

		
		Connection conn = null; // DB 연결 위한 객체 
		PreparedStatement pstmt = null; // SQL문을 DB에 보내기 위한 객체 

		// 1. JDBC Driver 
		String jdbcDriver = "com.mysql.cj.jdbc.Driver"; 
		
		// 2. DB연결 위한 정보 
		String jdbcUrl = "jdbc:mysql://localhost/empdb";
		String dbUser = "아이디"; // DB ID 
		String dbPwd = "비밀번호"; // DB PW 

		// 쿼리 입력 
		ResultSet rs = null;		
		String sqlSelect = "select * from dept10";
		String sqlUpdate = "update Dept10 d set d.loc =?, where d.deptno = ?";

		// 입력받을 정보 
		int iDeptno = 0; String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서 번호 입력=>"); iDeptno = sc.nextInt();
		System.out.println("변경할 위치 입력=>"); sLoc = sc.next();
		
		try {
			// JDBC 드라이버 로드
			Class.forName(jdbcDriver);
			
			// Database Connection 
			conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
			System.out.println("Connection 연결");
			
			// prepareStatement 생성 -> SQL문장 저장 
			pstmt = conn.prepareStatement(sqlUpdate);
			
			// SQL 전송 			
			pstmt.setInt(1,iDeptno); 
			pstmt.setString(2,sLoc);  
			
			int resultCount =pstmt.executeUpdate();
			if (resultCount > 0) {System.out.println("정상 변경");}
			else {System.out.println("변경 안됨");}
			
			rs = pstmt.executeQuery(sqlSelect);

			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s \n", rs.getInt("deptno"), rs.getString(2), rs.getString("loc"));			
			}
			// 6. Database Connection 해제
			System.out.println("해제");
			pstmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.printf("Exception : \r\n %s",e);
			System.out.println("연결안됨");
		}

		catch(ClassNotFoundException e) {
			System.out.printf("Exception : \r\n %s",e);
			System.out.println("Driver 로드 실패 ");
		}
		
	}

}
