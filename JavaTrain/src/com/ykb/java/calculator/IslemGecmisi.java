package com.ykb.java.calculator;

public class IslemGecmisi {
	private int sonuc;
	private int girdi1;
	private int girdi2;
	private EIslemTipi islemTipi;

	public int getSonuc() {
		return this.sonuc;
	}

	public void setSonuc(final int sonuc) {
		this.sonuc = sonuc;
	}

	public int getGirdi1() {
		return this.girdi1;
	}

	public void setGirdi1(final int girdi1) {
		this.girdi1 = girdi1;
	}

	public int getGirdi2() {
		return this.girdi2;
	}

	public void setGirdi2(final int girdi2) {
		this.girdi2 = girdi2;
	}

	public EIslemTipi getIslemTipi() {
		return this.islemTipi;
	}

	public void setIslemTipi(final EIslemTipi islemTipi) {
		this.islemTipi = islemTipi;
	}

	@Override
	public String toString() {
		return "IslemGecmisi [sonuc=" + this.sonuc + ", girdi1=" + this.girdi1 + ", girdi2=" + this.girdi2
				+ ", islemTipi=" + this.islemTipi + "]";
	}

}
