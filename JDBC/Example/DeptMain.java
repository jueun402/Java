package com.my;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class DeptMain {

	static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	static DeptDAO dDao = DeptDAO.getInstance();
	
	static void selectD(int deptno,Connection conn) {
		DeptVO dSel = dDao.selectDept(deptno, conn);
		System.out.println(dSel.toString());
	}
	
	static void insertD(DeptVO deptObj,Connection conn) {
		int resultCount = dDao.insertDept(deptObj, conn);
		if(resultCount > 0 ) {System.out.println("정상 입력"); }
		else {System.out.println("입력 안됨"); }
	}
	
	static void updateD(DeptVO deptObj, Connection conn){
		int resultCount = dDao.updateDept(deptObj, conn);
		if(resultCount > 0 ) {System.out.println("정상 수정"); }
		else {System.out.println("수정 안됨"); }
	}
	
	static void deleteD(int deptno, Connection conn){
		int resultCount = dDao.deleteDept(deptno, conn);
		if(resultCount > 0 ) {System.out.println("정상 삭제"); }
		else {System.out.println("삭제 안됨"); }
	}
	
	static void listD(Connection conn){
		List<DeptVO> deptList = dDao.listDept(conn);
		System.out.printf("[ %s |   %-10s |    %-10s ] %n","번호","부서이름","부서위치");
		System.out.printf("[ %s| %s | %s ] %n","---","----------","----------");
		for(DeptVO dept: deptList) { 
			//System.out.println(dept.toString()); 
			System.out.printf("[ %d | %-10s | %-10s ] %n",dept.getDeptno(),dept.getDname(),dept.getLoc() ); }
		System.out.printf("[ %s| %s | %s ] %n","---","----------","----------");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("=========== 부서 관리 시스템 시작 =============");
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(jdbcDriver);
			Connection conn = DBConn.getConnection();
			
			int iDeptno = 0; String sDname = null; String sLoc = null;
			DeptVO deptObj = null;
			
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. 검색, 2.입력, 3.수정, 4.삭제, 5.전체조회 , 9.종료 ==> ");
				
				int choiceNum = sc.nextInt();
				
				switch (choiceNum) {
					case 1:
						System.out.println("[1.검색] : 검색할 부서번호 입력 => ");
						int deptno = sc.nextInt();
						selectD(deptno,conn);
						break;
					case 2:
						System.out.println("[2.입력] : 부서 번호 입력 => "); iDeptno = sc.nextInt(); 
						System.out.println("[2.입력] : 부서 이름 입력 => "); sDname = sc.next();
						System.out.println("[2.입력] : 부서 위치 입력 => "); sLoc = sc.next();
						deptObj = new DeptVO(iDeptno,sDname,sLoc);
						insertD(deptObj,conn);
						break;
					case 3:
						System.out.println("[3.수정] : 변경 부서 번호 입력 => "); iDeptno = sc.nextInt(); 
						System.out.println("[3.수정] : 바뀔 부서 위치 입력 => "); sLoc = sc.next();
						deptObj = new DeptVO(iDeptno,sDname,sLoc);
						updateD(deptObj,conn);
						break;
					case 4:
						System.out.println("[4.삭제] : 변경 부서 번호 입력 => "); iDeptno = sc.nextInt(); 
						deleteD(iDeptno,conn);
						break;
					case 5:
						System.out.println("[5.전체조회] : 모든 부서 ");
						listD(conn);
						break;
					case 9:
						System.out.println("[9. 종료 ] : 종료하겠습니다. ^^");
						System.out.println("=========== 부서 관리 시스템 종료 =============");
						conn.close(); 
						return;
					default:
						System.out.println("1~5 까지 번호 선택");
				}
			}
				
		}
		catch(Exception e) {
			System.out.println("문제 일어남");
		}
		sc.close();
	}

}
