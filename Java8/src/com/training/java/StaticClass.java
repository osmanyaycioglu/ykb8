package com.training.java;

public class StaticClass {

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public static class InnerClass {
		private int xyz;

		public void test(final StaticClass sc) {
			sc.name = "tests";
		}

		public int getXyz() {
			return this.xyz;
		}

		public void setXyz(final int xyz) {
			this.xyz = xyz;
		}

	}

}
