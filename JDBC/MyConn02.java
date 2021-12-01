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
		String jdbcUrl = "jdbc:mysql://localhost:3306/empdb?serverTtimezone=UTC"; // localhost:port번호 적기
		String dbUser = "아이디";
		String dbPwd = "비밀번호";
		
//		String sqlSelect = "select * from dept10"; // Database에 정의 안되어있어서 오류 
		String sqlSelect = "select * from dept";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int iDeptno = 0; String sDname= null; String sLoc = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서 번호 입력=>"); iDeptno = sc.nextInt();
		System.out.println("부서 이름 입력=>"); sDname = sc.next();
		System.out.println("부서 위치 입력=>"); sLoc = sc.next();
 		
//		String sqlInsert = "insert into Dept values(iDeptno, sDname, sLoc)"
		String sqlInsert = "insert into Dept values(?, ?, ?)"; // 변수가 들어갈 자리 ?로 알려줌 
		
		
		try {
			// 1. JDBC 드라이버 로드
			Class.forName(jdbcDriver);
			
			// 2. Database Connection 연결
			// 인식 시켜줌  -> conn 사다리 개념 
			conn = DriverManager.getConnection(jdbcUrl,dbUser, dbPwd);
			
			System.out.println("Connection 연결");
			// 3. Statement 생성 
			pstmt = conn.prepareStatement(sqlInsert); 
			
			// 4. SQL 전송 -> executeQuery(), executeUpdate()
			
			pstmt.setInt(1,iDeptno); // 첫번째 물음표에 iDeptno가 들어간다 
			pstmt.setString(2,sDname); 
			pstmt.setString(3,sLoc);  
			
			int resultCount =pstmt.executeUpdate();
			// 5. ResultSet(결과) 받기 
			rs = pstmt.executeQuery(sqlSelect);
			if (resultCount > 0) {System.out.println("정상 입력");}
			else {System.out.println("입력 안됨");}
			
			while(rs.next()) {
				System.out.printf("%d | %-10s | %-10s \n", rs.getInt("deptno"), rs.getString(2), rs.getString("loc"));			
			}

			// 6. Database Connection 해제
			System.out.println("해제");
			// 사다리 -> 치우기
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
