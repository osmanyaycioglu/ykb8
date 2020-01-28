package com.ykb.java.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionTryout {
	public static void main(final String[] args) {
		List<Integer> a = new ArrayList<>();
		// List<Integer> synchronizedList = Collections.synchronizedList(a);
		long delta = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++) {
			a.add(i);
		}
		System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++) {
			a.get(i);
		}
		System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000; i++) {
			a.remove(0);
		}
		System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

	}
}
