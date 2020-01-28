package com.ykb.java.training;

public class JavaRunner {

	public static void main(String[] args) {
		Arac a = new Arac(5, 120);
		Arac b = new Arac(120);

		String str = "Arac pencere sayisi : " + a.getPencere() + " hiz : " + a.getHiz();
		
		StringBuilder strb = new StringBuilder();
		strb.append("Arac pencere sayisi : ");
		strb.append(a.getPencere());
		strb.append(" hiz : ");
		strb.append(a.getHiz());
		
		for (int i = 0; i < 100; i++) {
			strb.append(i);
			// str = str + i; yanlış
		}
		System.out.println(strb.toString());
	}

}
