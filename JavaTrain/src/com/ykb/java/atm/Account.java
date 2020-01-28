package com.ykb.java.atm;

public class Account {
	private EAccountType accountType;
	private int amount;

	public int withdraw(final int amount) {
		this.amount -= amount;
		return this.amount;
	}

	public int deposit(final int amount) {
		this.amount += amount;
		return this.amount;
	}

	public EAccountType getAccountType() {
		return this.accountType;
	}

	public void setAccountType(final EAccountType accountType) {
		this.accountType = accountType;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(final int amount) {
		this.amount = amount;
	}

}
