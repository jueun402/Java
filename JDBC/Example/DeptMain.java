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
		if(resultCount > 0 ) {System.out.println("���� �Է�"); }
		else {System.out.println("�Է� �ȵ�"); }
	}
	
	static void updateD(DeptVO deptObj, Connection conn){
		int resultCount = dDao.updateDept(deptObj, conn);
		if(resultCount > 0 ) {System.out.println("���� ����"); }
		else {System.out.println("���� �ȵ�"); }
	}
	
	static void deleteD(int deptno, Connection conn){
		int resultCount = dDao.deleteDept(deptno, conn);
		if(resultCount > 0 ) {System.out.println("���� ����"); }
		else {System.out.println("���� �ȵ�"); }
	}
	
	static void listD(Connection conn){
		List<DeptVO> deptList = dDao.listDept(conn);
		System.out.printf("[ %s |   %-10s |    %-10s ] %n","��ȣ","�μ��̸�","�μ���ġ");
		System.out.printf("[ %s| %s | %s ] %n","---","----------","----------");
		for(DeptVO dept: deptList) { 
			//System.out.println(dept.toString()); 
			System.out.printf("[ %d | %-10s | %-10s ] %n",dept.getDeptno(),dept.getDname(),dept.getLoc() ); }
		System.out.printf("[ %s| %s | %s ] %n","---","----------","----------");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("=========== �μ� ���� �ý��� ���� =============");
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(jdbcDriver);
			Connection conn = DBConn.getConnection();
			
			int iDeptno = 0; String sDname = null; String sLoc = null;
			DeptVO deptObj = null;
			
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. �˻�, 2.�Է�, 3.����, 4.����, 5.��ü��ȸ , 9.���� ==> ");
				
				int choiceNum = sc.nextInt();
				
				switch (choiceNum) {
					case 1:
						System.out.println("[1.�˻�] : �˻��� �μ���ȣ �Է� => ");
						int deptno = sc.nextInt();
						selectD(deptno,conn);
						break;
					case 2:
						System.out.println("[2.�Է�] : �μ� ��ȣ �Է� => "); iDeptno = sc.nextInt(); 
						System.out.println("[2.�Է�] : �μ� �̸� �Է� => "); sDname = sc.next();
						System.out.println("[2.�Է�] : �μ� ��ġ �Է� => "); sLoc = sc.next();
						deptObj = new DeptVO(iDeptno,sDname,sLoc);
						insertD(deptObj,conn);
						break;
					case 3:
						System.out.println("[3.����] : ���� �μ� ��ȣ �Է� => "); iDeptno = sc.nextInt(); 
						System.out.println("[3.����] : �ٲ� �μ� ��ġ �Է� => "); sLoc = sc.next();
						deptObj = new DeptVO(iDeptno,sDname,sLoc);
						updateD(deptObj,conn);
						break;
					case 4:
						System.out.println("[4.����] : ���� �μ� ��ȣ �Է� => "); iDeptno = sc.nextInt(); 
						deleteD(iDeptno,conn);
						break;
					case 5:
						System.out.println("[5.��ü��ȸ] : ��� �μ� ");
						listD(conn);
						break;
					case 9:
						System.out.println("[9. ���� ] : �����ϰڽ��ϴ�. ^^");
						System.out.println("=========== �μ� ���� �ý��� ���� =============");
						conn.close(); 
						return;
					default:
						System.out.println("1~5 ���� ��ȣ ����");
				}
			}
				
		}
		catch(Exception e) {
			System.out.println("���� �Ͼ");
		}
		sc.close();
	}

}
