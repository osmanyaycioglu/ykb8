package com.ykb.java.atm;

import java.util.Scanner;

public class MenuItemParaGoruntule implements IMenuItem {

	@Override
	public String menuDesc() {
		return "Para görüntüle";
	}

	@Override
	public void execute(final Scanner s, final Customer customer) {
		System.out.println("Paranız : " + customer.getAccounts().get(0).getAmount());
	}

}
