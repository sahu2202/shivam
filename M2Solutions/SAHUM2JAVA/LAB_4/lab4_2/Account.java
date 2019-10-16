package com.lab4_2;

public class Account {
	private long accNum;
	private double balance;
	Person accHolder;
	private static long count = 5024200;

	public Account() {
		this.accNum = ++count;
	}

	public Account(double balance, Person accHolder) {
		this();
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance += balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	// User Created Methods
	public void deposit(double depositBalance) {
		this.balance = this.balance + depositBalance;

	}

	public void withdraw(double withdrawBalance) {
  		double temp = balance;
		temp = getBalance() - withdrawBalance;
		if (temp < 500) {
			System.out.println("Sorry! " + this.accHolder.getName() + " Minimum balance must be 500.");
		} else
			this.balance = getBalance() - withdrawBalance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ","+" account no= "+accNum+ " accHolder " + accHolder + "]";
	}

}
