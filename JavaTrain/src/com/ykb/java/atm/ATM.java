package com.ykb.java.atm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class ATM {
	public static void main(final String[] args) {
		Map<String, Customer> customersMap = new HashMap<>();

		Customer customer = new Customer();
		customer.setName("osman");
		customer.setSurname("Yaycıoğlu");
		customer.setUsername("osman");
		customer.setPassword("1234a");

		Account account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setAmount(1_000);
		customer.addAccount(account);

		Gson gson = new Gson();
		String json = gson.toJson(customer);
		System.out.println(json);

		try {
			Files.write(Paths.get("customer.json"), json.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		customersMap.put(customer.getUsername(), customer);

		customer = new Customer();
		customer.setName("ali");
		customer.setSurname("Yaycıoğlu");
		customer.setUsername("ali");
		customer.setPassword("1234a");

		account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setAmount(2_000);
		customer.addAccount(account);

		customersMap.put(customer.getUsername(), customer);

		customer = new Customer();
		customer.setName("veli");
		customer.setSurname("Yaycıoğlu");
		customer.setUsername("veli");
		customer.setPassword("1234a");

		account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setAmount(3_000);
		customer.addAccount(account);

		customersMap.put(customer.getUsername(), customer);

		MenuFactory factory = new MenuFactory();
		List<IMenuItem> menu = factory.getMenu();
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("username : ");
			String username = s.next();
			System.out.println("password : ");
			String password = s.next();

			Customer customerFromMap = customersMap.get(username);
			if (customerFromMap != null) {
				if ((password != null) && password.equals(customerFromMap.getPassword())) {
					System.out.println("Hoş geldin " + customerFromMap.getName() + " " + customerFromMap.getSurname());
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
							iMenuItem.execute(s, customerFromMap);
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
