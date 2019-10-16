package com.cg.lab6.p1;

import com.cg.lab6.NameInvalidException;
import java.util.*;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname = "";
		String lname = "";
		System.out.print("Enter First Name: ");
		fname = sc.next();
		System.out.print("Enter Last Name: ");
		lname = sc.next();
		System.out.print("Choose Gender [M/F/O]: ");
		String gen = sc.next();
		char gender = gen.charAt(0);
		Person pr = new Person(fname, lname, gender);

		try {

			if (pr.firstName.isEmpty() == true || pr.lastName.isEmpty() == true) {
				System.out.println("Entered name is empty......");
				throw new NameInvalidException();

			} else {
				System.out.println("Person Details:");
				System.out.println("-----------------------");
				System.out.println();
				System.out.println("First Name: " + pr.firstName);
				System.out.println("Last Name: " + pr.lastName);
				System.out.println("Gender: " + pr.gender);
			}

		} catch (NameInvalidException e) {
			e.printStackTrace();
		}

	}

}
