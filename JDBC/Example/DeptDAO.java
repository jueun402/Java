package com.my;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	// 싱글톤? - 같이 공유해서 쓰는 객체 / 한번 만든걸 다시 만들게 하지x(한번만 만들겠다) / DAO 만들 때 싱글톤을 사용 

	// Singleton
	private static DeptDAO dao = new DeptDAO();
	private DeptDAO(){ }
	public static DeptDAO getInstance() { return dao; }
	/////////////////
	DeptVO selectDept(int deptno, Connection conn) { //	selectDept() {} 부서명 -> 부서번호, 부서명, 부서위치
		
		DeptVO dept = null;
		try {
			//String sql = "select * from dept where deptno = "+ deptno;
			String sql = "select * from dept10 where deptno = ?";
			//Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno); 
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dept = new DeptVO(rs.getInt(1),rs.getString(2),rs.getString("loc"));
				System.out.printf("%d | %-10s | %-10s %n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}
			pstmt.close();
			//stmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return dept;
	}
	
//	insertDept( ) { }
	int insertDept(DeptVO deptObj, Connection conn) {
		
		int resultCount = 0;
		
		try {
			String sql = "insert into dept10 values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptObj.getDeptno()); 
			pstmt.setString(2, deptObj.getDname());
			pstmt.setString(3, deptObj.getLoc());
			
			resultCount = pstmt.executeUpdate();
			
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}
	
	//	updateDept( ) { }
	int updateDept(DeptVO deptObj, Connection conn) {
		
		int resultCount = 0;
		
		try {
			String sql = "update Dept10 d set d.loc =?, where d.deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, deptObj.getDeptno()); 
			pstmt.setString(1, deptObj.getLoc());
			resultCount = pstmt.executeUpdate();
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}
	
	//	deleteDept( ) { }
	int deleteDept(int deptno, Connection conn) {
		
		int resultCount = 0;
		
		try {
			String sql = "delete from dept10 d where d.deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno); 	
			resultCount = pstmt.executeUpdate();
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return resultCount;
	}

	//	listDept() { } 	부서명
	List <DeptVO> listDept(Connection conn) { //	selectDept() {} 부서명 -> 부서번호, 부서명, 부서위치
		
		/*array list 쓰는 이유 : array는 몇 행 몇 열 칸이 fix 늘렸다 줄였다 못함 , array list 는 유동적으 칸 크기를 조절 */  
				
		List<DeptVO> deptlist = new ArrayList<DeptVO>();
		
		try {
			String sql = "select * from dept10";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				deptlist.add(new DeptVO(rs.getInt(1),rs.getString(2),rs.getString("3")));
//				System.out.printf("%d | %-10s | %-10s %n",rs.getInt("deptno"),rs.getString(2),rs.getString("loc"));
			}
			pstmt.close();
		}
		catch (SQLException e) {
			System.out.println("연결 안됨");
		}
		return deptlist;
	}

	

	
	
}
