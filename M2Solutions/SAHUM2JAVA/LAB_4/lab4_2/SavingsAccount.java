package com.lab4_2;

public class SavingsAccount extends Account {
	private final double minBalance = 500;

	public SavingsAccount() {
	}

	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}

	@Override
	public void withdraw(double withdrawBalance) {
		double temp = 0;
		temp = super.getBalance() - withdrawBalance;
		if (temp < minBalance) {
			System.out.println("Sorry! " + super.getAccHolder().getName() + " Minimum balance must be 500.");
		} else {
			double bal = super.getBalance();
			double checkBal = bal - withdrawBalance;
			super.setBalance(checkBal);
		}

	}

}
