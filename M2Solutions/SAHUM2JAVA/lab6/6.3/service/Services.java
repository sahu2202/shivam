package com.cg.eis.service;
import com.cg.eis.bean.Employee;

public class Services implements EmployeeService {
	EmployeeServiceImpl hash = new EmployeeServiceImpl();
	@Override
	public void getEmployeeDetails(Employee emp, int id, String name, double salary) {
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation();
		emp.setInsuranceScheme();
		hash.addEmployee(emp);

	}

	@Override
	public void getInsuranceScheme(Employee emp) {
		System.out.println("Insurance Scheme for the person is -: " + emp.getInsuranceScheme());
	}

	@Override
	public void DisplayEmployeeDetails(Employee emp) {
		System.out.println("Employee ID : " + emp.getId());
		System.out.println("Employee Name : " + emp.getName());
		System.out.println("Employee Salary :  $" + emp.getSalary() );
		System.out.println("Employee Designation : " + emp.getDesignation());
		System.out.println("Employee Insurance Scheme : " + emp.getInsuranceScheme());

	}

}
