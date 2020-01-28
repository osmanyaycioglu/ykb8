package com.ykb.java.intf;

public class HayvanFabrikasi {

	public IMyInterface hayvanYarat(final int index) {
		IMyInterface imi = null;
		switch (index) {
		case 1:
			imi = new Kopek();
			break;
		case 2:
			imi = new Kedi();
			break;
		case 3:
			imi = new Aslan();
			break;
		case 4:
			imi = new Kanguru();
			break;

		default:
			imi = new Kopek();
			break;
		}
		return imi;
	}

	public String menuAl() {
		return "Hayvan seç : 1-Kopek 2-Kedi 3-Aslan 4-Kanguru";
	}

}
