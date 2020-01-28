package com.ykb.java.atm;

import java.util.Scanner;

public class MenuItemParaCek implements IMenuItem {

	@Override
	public String menuDesc() {
		return "Para Çek";
	}

	@Override
	public void execute(final Scanner s, final Customer customer) {
		System.out.println("çekeceğiniz para miktarı :");
		int amount = s.nextInt();
		Account tlAccount = customer.getAccounts().get(0);
		int withdraw = tlAccount.withdraw(amount);
		System.out.println("Paranız : " + withdraw);

	}

}
