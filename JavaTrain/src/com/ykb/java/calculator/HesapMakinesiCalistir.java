package com.ykb.java.calculator;

public class HesapMakinesiCalistir {
	public static void main(final String[] args) {
		HesapMakinesi h = new HesapMakinesi();
		int topla = h.topla(100, 200);
		int cikar = h.cikar(200, 20);
		int carp = h.carp(100, 10);
		int bol = h.bol(100, 10);
		h.sonOnİslemiYazdir();
	}
}
