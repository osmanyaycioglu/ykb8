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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.accountType == null) ? 0 : this.accountType.hashCode());
		result = (prime * result) + this.amount;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Account other = (Account) obj;
		if (this.accountType != other.accountType) {
			return false;
		}
		if (this.amount != other.amount) {
			return false;
		}
		return true;
	}

}
