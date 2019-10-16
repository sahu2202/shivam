package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import java.util.Comparator;

public class SortOnSal implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.getSalary() < e2.getSalary()) ? -1 :(e1.getSalary() < e2.getSalary()) ? -1 : 0 ;
	}

}
