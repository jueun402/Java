package com.my;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	// �̱���? - ���� �����ؼ� ���� ��ü / �ѹ� ����� �ٽ� ����� ����x(�ѹ��� ����ڴ�) / DAO ���� �� �̱����� ��� 

	// Singleton
	private static DeptDAO dao = new DeptDAO();
	private DeptDAO(){ }
	public static DeptDAO getInstance() { return dao; }
	/////////////////
	DeptVO selectDept(int deptno, Connection conn) { //	selectDept() {} �μ��� -> �μ���ȣ, �μ���, �μ���ġ
		
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
			System.out.println("���� �ȵ�");
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
			System.out.println("���� �ȵ�");
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
			System.out.println("���� �ȵ�");
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
			System.out.println("���� �ȵ�");
		}
		return resultCount;
	}

	//	listDept() { } 	�μ���
	List <DeptVO> listDept(Connection conn) { //	selectDept() {} �μ��� -> �μ���ȣ, �μ���, �μ���ġ
		
		/*array list ���� ���� : array�� �� �� �� �� ĭ�� fix �÷ȴ� �ٿ��� ���� , array list �� �������� ĭ ũ�⸦ ���� */  
				
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
			System.out.println("���� �ȵ�");
		}
		return deptlist;
	}

	

	
	
}
