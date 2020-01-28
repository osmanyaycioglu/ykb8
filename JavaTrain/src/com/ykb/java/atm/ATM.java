package com.ykb.java.atm;

import java.util.List;
import java.util.Scanner;

public class ATM {
	public static void main(final String[] args) {
		Customer customer = new Customer();
		customer.setName("osman");
		customer.setSurname("Yaycıoğlu");
		customer.setUsername("osman");
		customer.setPassword("1234a");

		Account account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setAmount(1_000);
		customer.addAccount(account);
		MenuFactory factory = new MenuFactory();
		List<IMenuItem> menu = factory.getMenu();
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("username : ");
			String username = s.next();
			System.out.println("password : ");
			String password = s.next();

			if ((username != null) && username.equals(customer.getUsername())) {
				if ((password != null) && password.equals(customer.getPassword())) {
					System.out.println("Hoş geldin " + customer.getName() + " " + customer.getSurname());
					atmEnd: while (true) {
						int i = 0;
						for (i = 0; i < menu.size(); i++) {
							IMenuItem iMenuItem = menu.get(i);
							System.out.println((i + 1) + "-" + iMenuItem.menuDesc());
						}
						System.out.println((i + 1) + "-Exit");
						System.out.println("Seçiminiz : ");
						int nextInt = s.nextInt();
						if (nextInt < (menu.size() + 1)) {
							IMenuItem iMenuItem = menu.get(nextInt - 1);
							iMenuItem.execute(s, customer);
						} else {
							break;
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
