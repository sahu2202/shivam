package com.lab2_3;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p = new Person("John","Doe",'M');
		System.out.println("First Name: "+p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+p.getGender());
	}
}
