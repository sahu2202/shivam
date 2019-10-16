package com.cg.lab7;

public class Savings_Account extends Account {

	final double minimum_balance = 500;

	public Savings_Account(double balance) {
		super();
	}

	public Savings_Account(double balance,long accNum) {
		super(balance,accNum);
	}

	public Savings_Account(String name, Float age) {
		super(name, age);
	}
	//overloaded abstract method withdraw
	@Override
	public void withdraw(double balance) {
		if (super.balance > minimum_balance && (super.balance -= balance) > minimum_balance){
			super.balance -= balance;
			System.out.println("withdrew " + balance + " from " + super.accNum);
		}else{
			System.out.println("Sorry! you don't have enough balance."+super.accNum);
		}
	}
}
// (balance -= balance) > minimum_balance