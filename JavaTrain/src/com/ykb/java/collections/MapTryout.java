package com.ykb.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ykb.java.atm.Account;
import com.ykb.java.atm.Customer;
import com.ykb.java.atm.EAccountType;

public class MapTryout {
	public static void main(final String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("osman", "yaycioglu");
		map.put("ali", "veli");
		map.put("ali", "yaycioglu");
		map.put(null, "yaycioglu");

		String value = map.get("ali");
		System.out.println("ali : " + value);

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("Key : " + key + " Value : " + map.get(key));
		}

		Collection<String> values = map.values();
		for (String mapvalue : values) {
			System.out.println("Value : " + mapvalue);
		}

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		Map<String, Customer> map2 = new HashMap<>();

		Account a1 = new Account();
		a1.setAccountType(EAccountType.TL);
		a1.setAmount(1000);
		Account a2 = new Account();
		a2.setAccountType(EAccountType.TL);
		a2.setAmount(1000);
		if (a1.equals(a2)) {
			System.out.println("Heyoo eşit");
		} else {
			System.out.println("Tüh eşit değil");
		}

	}
}
