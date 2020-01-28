package com.ykb.java.atm;

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
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("username : ");
			String username = s.next();
			System.out.println("password : ");
			String password = s.next();

			if ((username != null) && username.equals(customer.getUsername())) {
				if ((password != null) && password.equals(customer.getPassword())) {
					System.out.println("Hoş geldin " + customer.getName() + " " + customer.getSurname());
					atmEnd: while (true) {
						System.out.println("1-Para Yatır");
						System.out.println("2-Para Çek");
						System.out.println("3-Exit");
						System.out.println("Seçiminiz : ");
						int nextInt = s.nextInt();
						switch (nextInt) {
						case 1: {
							System.out.println("yatıracağınız para miktarı :");
							int amount = s.nextInt();
							Account tlAccount = customer.getAccounts().get(0);
							int deposit = tlAccount.deposit(amount);
							System.out.println("Paranız : " + deposit);
						}
							break;
						case 2: {
							System.out.println("çekeceğiniz para miktarı :");
							int amount = s.nextInt();
							Account tlAccount = customer.getAccounts().get(0);
							int withdraw = tlAccount.withdraw(amount);
							System.out.println("Paranız : " + withdraw);
						}
							break;

						default:
							break atmEnd;
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
