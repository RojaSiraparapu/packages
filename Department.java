package com.company.admin;

public class Department
{
	private String deptName;
	private int deptId;
	
	public void setdeptName(String deptName)
	{
		this.deptName=deptName;
	}
	public void setdeptId(int deptId)
	{
		this.deptId=deptId;
	}
	public String deptName()
	{
		return deptName;
	}
	public int deptId()
	{
		return deptId;
	}
	public void showDepartmentDetails()
	{
		System.out.println("Department Name: "+deptName);
		System.out.println("Department Id: "+deptId);

	}
}