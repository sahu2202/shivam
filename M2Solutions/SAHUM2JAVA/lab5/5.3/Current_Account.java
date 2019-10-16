package com.cg.lab7;

public class Current_Account extends Account {
	final double overdraft_limit = 40000;
	boolean limit_reached = false;
	double overdraft_check = 0.0;

	public Current_Account(double balance) {
		super();
	}

	public Current_Account(double balance, long accNum) {
		super(balance, accNum);
	}

	public Current_Account(String name, Float age) {
		super(name, age);
	}
	//overloaded abstract method withdraw
	@Override
	public void withdraw(double balance) {
		overdraft_check = 0.0;
		if (balance < overdraft_limit && limit_reached == false) {
			this.balance -= balance;
			overdraft_check += balance;
			if (this.balance < 500) {
				this.balance += balance;
				overdraft_check -= balance;
				System.out.println("low account balance..");
			} else if (overdraft_check > 35000) {
				limit_reached = true;
				System.out.println("Overdraft limit is reached try tomorrow.");
			}

		} else
			System.out.println("withdrew " + balance + "from account");

	}

}
