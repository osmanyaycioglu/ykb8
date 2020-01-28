package com.ykb.java.intf;

import java.util.Scanner;

public class Calistirici {

	public static void main(final String[] args) {
		try (Scanner s = new Scanner(System.in);) {
			HayvanFabrikasi fabrikasi = new HayvanFabrikasi();
			System.out.println(fabrikasi.menuAl());
			int nextInt = s.nextInt();
			IMyInterface imi = fabrikasi.hayvanYarat(nextInt);
			imi.islemYap();
		}
	}
}
