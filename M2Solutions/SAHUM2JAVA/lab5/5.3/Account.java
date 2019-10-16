package com.cg.lab7;

public abstract class Account extends Person {
	static long acc = 1000;
	long accNum ;
	double balance;

	public Account(String name, Float age) {
		super(name, age);
	}

	public Account() {
		super();
		this.accNum = ++acc;
		this.balance = 500.0;
	}
	public Account(double balance) {
		super();
		this.accNum = ++acc;
		this.balance = balance;
	}
	public Account(double balance,long accNum) {
		super();
		this.accNum = ++acc;
		this.balance = balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double balance) {
		this.balance += balance;
		System.out.println("deposited " + balance + " in " + this.accNum);
	}
	//abstract method withdraw
	public abstract void withdraw(double balance); 

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + "]";
	}

}
