package com.cg.lab6.p1;

public class Person extends Exception{

	String firstName;
	String lastName;
	char gender;
	public Person() {
		super();
		this.firstName = null;
		this.lastName = null;
		this.gender = 0; 
	}
	
	public Person(String firstName, String lastName, char gender) {
		super();
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
}
