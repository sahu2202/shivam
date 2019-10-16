package com.lab4_2;

public class CurrentAccount extends Account {
	private final int overDraftLimit = 9000;

	public CurrentAccount() {
	}

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}

	@Override
	public void withdraw(double withdrawBalance) {

		double limitCheck = withdrawBalance;
		double mainBalance = super.getBalance();
		if (limitCheck > overDraftLimit) {
			System.out.println("Sorry! " + super.getAccHolder().getName()
					+ " your given limit is too higer than existing limits!.");

		} else if (limitCheck < overDraftLimit && withdrawBalance < mainBalance) {
			double checkBal = mainBalance - withdrawBalance;
			super.setBalance(checkBal);
		}
	}

}
