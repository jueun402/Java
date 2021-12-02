package com.my;

public class DeptVO {
	// ��� �ʵ� 
	private int deptno;
	private String dname;
	private String loc;
	// ������ 
	DeptVO(){}	// ���� �巯������ 
	DeptVO(int deptno, String dname, String loc){
		this.deptno = deptno; this.dname = dname; this.loc = loc;}
	// ��� �޼ҵ� : getter      (source -> Generate getter setter) 
	public int getDeptno() { return deptno;}
	public String getDname() {return dname;}
	public String getLoc() {return loc;}

	@Override        // (source -> generate toString -> inheritence? -> toString)
	public String toString() {
		return "[ "+ deptno + " | " + dname + " | " + loc + " ]";


	}
	
}
