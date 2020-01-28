package com.ykb.java.general;

import java.util.Random;

public class RandomTry {
	public static void main(final String[] args) {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int nextInt = random.nextInt(100);
			System.out.println("num : " + nextInt);
		}

		int counter = 0;
		dis: while (true) {
			ic: while (counter <= 100) {
				if (counter == 10) {
					continue dis;
				}
				counter++;
			}
			counter++;
			if (counter == 9) {
				break;
			}
		}

		do {

		} while (true);
	}
}
