import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class salDAO {
	
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL 명령어
	private final String SAL_LIST = "select * from salgrade";

	// 모든 내용 select
	public List<salVO> getsalList(salVO vo) {
		List<salVO> salList = new ArrayList<salVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SAL_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				salVO sal = new salVO();
				
				sal.setGrade(rs.getInt("grade"));
				sal.setLosal(rs.getString("losal"));
				sal.setHisal(rs.getInt("hisal"));
		
				salList.add(sal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return salList;
	}
}