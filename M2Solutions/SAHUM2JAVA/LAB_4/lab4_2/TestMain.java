package com.lab4_2;

public class TestMain {
	public static void main(String[] args) {

		Person p1 = new Person("Smith", 25);
		Person p2 = new Person("Kathy", 23);

		Account a1 = new SavingsAccount(2000, p1);
		Account a2 = new SavingsAccount(3000, p2);
		
		a1.deposit(2000);
		a2.withdraw(4000);
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println();
		
		Account a3 = new CurrentAccount(5000, p1);
		Account a4 = new CurrentAccount(10000, p2);
		
		a4.withdraw(10000);
		System.out.println(a4);
	}
}
