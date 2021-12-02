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
		
		System.out.println("변경 부서 번호 입력 => "); iDeptno = sc.nextInt(); 
		System.out.println("바뀔 부서 위치 입력 => "); sLoc = sc.next();
		
		String sqlUpdate = "update dept10 set loc = ? where deptno = ?"; 
				
		try {
			// 1. JDBC 드라이버 로드
			Class.forName(jdbcDriver);
			// 2. Database Connection 연결
			conn = DriverManager.getConnection(jdbcUrl,dbUser,dbPwd );
			
			System.out.println("Connection 연결");
			// 3. Statement 생성
			pstmt = conn.prepareStatement(sqlUpdate);
			// 4. SQL 전송 --> executeQuery(), executeUpdate()
						
			pstmt.setInt(2, iDeptno); 
			pstmt.setString(1, sLoc);
			
			int resultCount = pstmt.executeUpdate();
			// 5. ResultSet(결과) 받기
			rs = pstmt.executeQuery(sqlSelect);
			
			if(resultCount > 0 ) {System.out.println("정상 수벙"); }
			else {System.out.println("수정 안됨"); }
				
			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s %n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}	
			
			// 6. Database Connection 해제
			System.out.println("Connection 해제");
			pstmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.printf("Exception: \r\n %s", e);
			System.out.println("연결 안됨");
		}
		catch(ClassNotFoundException e) {
			System.out.printf("Exception: \r\n %s", e);
			System.out.println("Driver 로드 실패");
		}
	}

}
