package com.company.app;
import com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp
{
	public static void main(String []args)
	{
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Roja");
		employee.setSalary(20000.0);

		Department department=new Department();
		department.setdeptName("Computer Science");
		department.setdeptId(25);
		
		employee.showEmployeeDetails();
		System.out.println();
		department.showDepartmentDetails();
	}
}