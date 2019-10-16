package com.lab3_7;import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person("Michael", "Jordan", 'M');
		System.out.println("Enter Date of Birth in(dd-MM-yyyy) format: ");
		String date_of_birth = sc.next();
		
		System.out.println(p.getFullName());
		System.out.println(p.getGender());
		p.calculateAge(date_of_birth);
	}
}
