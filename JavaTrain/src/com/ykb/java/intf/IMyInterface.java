package com.ykb.java.intf;

public interface IMyInterface {

	String sesCikar();

	String yuru();

	String yemekYe();

	default void islemYap() {
		System.out.println(this.yemekYe());
		System.out.println(this.yuru());
		System.out.println(this.sesCikar());
	}

}
