package com.cg.lab7;

public class MainCl {

	public static void main(String[] args) {
		
		Person smith = new Person("Smith", 39.0f);
		Person kathy = new Person("Kathy", 29.0f);
		Savings_Account hold1 = new Savings_Account(40008686);
		Current_Account hold2 = new Current_Account(14900000);
		System.out.println("Balance for "+ hold1.accNum +" is " + hold1.getBalance());
		System.out.println("Balance for "+ hold2.accNum +" is " +hold2.getBalance());
		System.out.println();
		System.out.println(hold1);
		System.out.println();
		System.out.println(hold2);
		hold1.deposite(150000);
		hold2.deposite(200000);
		System.out.println("Balance for "+ hold1.accNum +" is " + hold1.getBalance());
		System.out.println("Balance for "+ hold2.accNum +" is " + hold2.getBalance());
		hold1.withdraw(20000);
		System.out.println("Balance for "+ hold1.accNum +" is " + hold1.getBalance());
		
		
	}

}
