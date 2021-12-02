package com.my;

public class DeptVO {
	// 멤버 필드 
	private int deptno;
	private String dname;
	private String loc;
	// 생성자 
	DeptVO(){}	// 은닉 드러내야함 
	DeptVO(int deptno, String dname, String loc){
		this.deptno = deptno; this.dname = dname; this.loc = loc;}
	// 멤버 메소드 : getter      (source -> Generate getter setter) 
	public int getDeptno() { return deptno;}
	public String getDname() {return dname;}
	public String getLoc() {return loc;}

	@Override        // (source -> generate toString -> inheritence? -> toString)
	public String toString() {
		return "[ "+ deptno + " | " + dname + " | " + loc + " ]";


	}
	
}
