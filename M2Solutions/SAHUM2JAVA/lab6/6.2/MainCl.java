package com.cg.lab6;

public class MainCl {

	public static void main(String[] args) {
		long acc = 1000;
		Person smith = new Person("Smith", 14.0f);
		Person kathy = new Person("Kathy", 29.0f);
		Account hold1 = new Account(++acc, 2000, smith);
		Account hold2 = new Account(++acc, 3000, kathy);
		hold1.deposite(2000);
		hold2.withdraw(2000);
		System.out.println("Balance for "+ hold1.accNum +" is " + hold1.getBalance());
		System.out.println("Balance for "+ hold2.accNum +" is " +hold2.getBalance());
		System.out.println();
		System.out.println(hold1);
		System.out.println();
		System.out.println(hold2);
	
		hold1.deposite(15000);
		System.out.println("Balance for "+ hold1.accNum +" is " + hold1.getBalance());
		
	}

}
