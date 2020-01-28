package com.ykb.java.calculator;

public class HesapMakinesi extends Object {

	private IslemGecmisi[] ig = new IslemGecmisi[10];
	private int index;
	private Integer index2;

	public int topla(final int val1, final int val2) {
		IslemGecmisi gecmisi = this.islemiGesmiseEkle(val1, val2, EIslemTipi.TOPLA);
		int sonuc = val1 + val2;
		gecmisi.setSonuc(sonuc);
		return sonuc;
	}

	private IslemGecmisi islemiGesmiseEkle(final int val1, final int val2, final EIslemTipi eit) {
		IslemGecmisi gecmisi = new IslemGecmisi();
		gecmisi.setGirdi1(val1);
		gecmisi.setGirdi2(val2);
		gecmisi.setIslemTipi(eit);
		this.ig[this.index % 10] = gecmisi;
		this.index++;
		return gecmisi;
	}

	public void sonOnİslemiYazdir() {
		for (int i = this.index; i < (this.index + 10); i++) {
			System.out.println(this.ig[i % 10]);
		}
	}

	public int cikar(final int val1, final int val2) {
		IslemGecmisi gecmisi = this.islemiGesmiseEkle(val1, val2, EIslemTipi.CIKAR);
		int sonuc = val1 - val2;
		gecmisi.setSonuc(sonuc);
		return sonuc;
	}

	public int carp(final int val1, final int val2) {
		IslemGecmisi gecmisi = this.islemiGesmiseEkle(val1, val2, EIslemTipi.CARP);
		int sonuc = val1 * val2;
		gecmisi.setSonuc(sonuc);
		return sonuc;
	}

	public int bol(final int val1, final int val2) {
		IslemGecmisi gecmisi = this.islemiGesmiseEkle(val1, val2, EIslemTipi.BOL);
		int sonuc = val1 / val2;
		gecmisi.setSonuc(sonuc);
		return sonuc;
	}

}
