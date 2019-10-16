package com.lab3_7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;

	public Person() {
	}

	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void calculateAge (String dateOfBirth){
		
		DateTimeFormatter df = null;
		df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate d1 = LocalDate.parse(dateOfBirth, df);
		LocalDate d2 = LocalDate.now();
		
		Period p1 = Period.between(d1, d2);
		
		System.out.println("Age of the Person: "+p1.getYears());
	}
	
	public String getFullName(){
		String fullName = getFirstName()+" "+getLastName();
		return fullName;
	}
	
}