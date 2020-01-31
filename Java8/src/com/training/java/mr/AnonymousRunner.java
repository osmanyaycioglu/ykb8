package com.training.java.mr;

import java.util.Scanner;

public class AnonymousRunner {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seçiminiz : ");
		int nextInt = sc.nextInt();
		IMyProcess mp = null;
		switch (nextInt) {
		case 1:
			mp = new IMyProcess() {
				@Override
				public String abc(final String s, final String k) {
					return s + " " + k;
				}
			};
			break;
		case 2:
			mp = new IMyProcess() {
				@Override
				public String abc(final String s, final String k) {
					return "sayın " + s + " " + k;
				}
			};
			break;
		case 3:
			mp = new IMyProcess() {
				@Override
				public String abc(final String s, final String k) {
					return "paşa hazretleri " + s + " " + k;
				}
			};
			break;

		default:
			mp = new IMyProcess() {
				@Override
				public String abc(final String s, final String k) {
					return s;
				}
			};
			break;
		}

		String abc = mp.abc("my", "first");
		System.out.println(abc);
	}
}
