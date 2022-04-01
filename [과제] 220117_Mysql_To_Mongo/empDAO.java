import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class empDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL 명령어
	private final String EMP_LIST = "select * from emp_1";

	// 모든 내용 select
	public List<empVO> getempList(empVO vo) {
		List<empVO> empList = new ArrayList<empVO>();
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(EMP_LIST);
			rs = stmt.executeQuery();
			while (rs.next()) {
				empVO emp = new empVO();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setDeptno(rs.getInt("deptno"));
				
				empList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return empList;
	}
}