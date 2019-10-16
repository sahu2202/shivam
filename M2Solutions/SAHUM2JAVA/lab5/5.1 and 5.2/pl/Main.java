package com.cg.eis.pl;

//import com.cg.eis.exception.*;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		Services ser = new Services();
		//EmployeeServiceImpl hash = new EmployeeServiceImpl();
		int i = 0;

		while (true) {
			System.out.println(
					"\n\n 1. Enter Employee Details. \n 2. Get Insurance Scheme. \n 3. Get Employee Details. \n 4. exit. \n");
			System.out.println();
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter Employee Name -: ");
				String name = sc.next();
				System.out.println("Enter Employee ID  -: ");
				int id = sc.nextInt();
				System.out.println("Enter Employee Salary -: ");
				double sal = 0.0;
				sal = sc.nextDouble();

				ser.getEmployeeDetails(emp, id, name, sal);
				System.out.println(emp);
				
				System.out.println();
				break;
			case 2:
				ser.getInsuranceScheme(emp);
				break;
			case 3:
				ser.DisplayEmployeeDetails(emp);
				break;
			case 4:
				return;
			default:
				System.out.println("Please Select options from below list.....");
				System.out.println();
				break;

			}

		}

	}

}
