package com.cg.eis.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl {
	HashMap<String, Employee> list = new HashMap<String, Employee>();

	public void addEmployee(Employee emp) {
		String name = emp.getName();
		list.put(name, emp);
	}

	public void showEmployee() {
		System.out.println(list.values());
	}

	public void displayEmployeeBasedInsurence(String insurence) {
		Iterator itr = list.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mapent = (Map.Entry) itr.next();
			Employee ins = (Employee) mapent.getValue();
			if (ins.getInsuranceScheme() == insurence) {
				System.out.println(ins);
			}
		}

	}

	public boolean deleteEmployee(int id) {
		boolean fl = false;
		Iterator itr = list.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry mapent = (Map.Entry) itr.next();
			Employee ins = (Employee) mapent.getValue();
			if (ins.getId() == id) {
				list.remove(ins.getName());
				fl = true;
			} else {
				System.out.println("Record not present in the list.");
			}
		}
		return fl;
	}

	public void sortOnSalary() {
		
		Set<Employee> list1 = new TreeSet<Employee>(new SortOnSal());
		Set<Entry<String,Employee>> set1 = list.entrySet();
			for(Map.Entry<String, Employee> it : set1)
			{
				Employee temp = it.getValue();
				list1.add(temp);
			}
		
		for (Employee e : list1)
			System.out.println(list1);
	}
}
