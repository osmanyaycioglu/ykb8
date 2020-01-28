package com.ykb.java.training;

public class Arac {

	private int pencere;
	private int hiz;
	
	public Arac(int pencere, int hiz) {
		super();
		this.pencere = pencere;
		this.hiz = hiz;
	}
	
	public Arac(double abc, int zxc) {
		super();
		this.pencere = (int)abc;
		this.hiz = zxc;
	}

	public Arac(int hiz) {
		super();
		this.hiz = hiz;
	}
	

	public int hizHesapla(int km) {
		return km/hiz;
	}
	
	public int getPencere() {
		return pencere;
	}

	public void setPencere(int pencere) {
		if (pencere > 10) {
			pencere = 10;
		} else {
			this.pencere = pencere;
		}
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	
}
