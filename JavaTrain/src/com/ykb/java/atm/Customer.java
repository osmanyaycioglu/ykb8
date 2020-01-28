package com.ykb.java.atm;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String surname;
	private String username;
	private String password;
	private List<Account> accounts;

	public void addAccount(final Account account) {
		if (this.accounts == null) {
			this.accounts = new ArrayList<>();
		}
		this.accounts.add(account);
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(final List<Account> accounts) {
		this.accounts = accounts;
	}

}
