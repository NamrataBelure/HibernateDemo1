package com.java.scp.HibernateDemo.HibernateDemo1;

public class EmpPoja {
	
	private int empId;
	private String empName;
	private String empAdd;
	private float empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "EmpPoja [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
	}
	
	public EmpPoja(int empId, String empName, String empAdd, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empSal = empSal;
	}
	
	public EmpPoja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
