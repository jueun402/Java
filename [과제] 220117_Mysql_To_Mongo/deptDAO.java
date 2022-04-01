import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class deptDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL 명령어
	private final String DEPT_LIST = "select * from dept";

	// 모든 내용 select
	public List<deptVO> getDeptList(deptVO vo) {
		List<deptVO> deptList = new ArrayList<deptVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(DEPT_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				deptVO dept = new deptVO();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				deptList.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return deptList;
	}
}