package com.cg.eis.bean;

public class Employee {
	int id;
	String name;
	double salary;
	String designation;
	String insuranceScheme;

	public Employee() {
		super();
		this.id = 0;
		this.name = "";
		this.salary = 0.0;
		this.designation = "";
		this.insuranceScheme = "";
	}

	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation() {
		double sal = this.getSalary();
		if (sal > 5000 && sal < 20000)
			this.designation = "System Associate";
		if (sal >= 20000 && sal < 40000)
			this.designation = "Programmer";
		if (sal >= 40000)
			this.designation = "Manager";
		if (sal <= 5000)
			this.designation = "Clerk";

	}

	public void setInsuranceScheme() {
		String desg = this.getDesignation();
		if (desg == "System Associate")
			this.insuranceScheme = "Scheme C";
		if (desg == "Programmer")
			this.insuranceScheme = "Scheme B";
		if (desg == "Manager")
			this.insuranceScheme = "Scheme A";
		if (desg == "Clerk")
			this.insuranceScheme = "No Scheme";
	}

	public String getInsuranceScheme() {
		return this.insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
}
