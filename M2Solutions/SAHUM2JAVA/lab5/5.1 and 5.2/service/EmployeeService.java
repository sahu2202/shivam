package com.cg.eis.service;

import com.cg.eis.bean.*;

public interface EmployeeService {
	public abstract void getEmployeeDetails(Employee emp, int id, String name, double salary);

	public abstract void getInsuranceScheme(Employee employee);

	public abstract void DisplayEmployeeDetails(Employee employee);

}
