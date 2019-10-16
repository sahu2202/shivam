package com.lab4_1;

public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person("Smith", 20);
		Person p2 = new Person("Kathy",25);
		Account a1 = new Account(2000, p1);
		Account a2 = new Account(3000, p2);
		
		a1.deposit(2000);
		a2.withdraw(2000);
		
		a2.withdraw(1000);
		
		System.out.println(a1);
		System.out.println(a2);
	}
}
