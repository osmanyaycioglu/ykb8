package com.ykb.java.calculator;

public class A {
	public long a;

	public static int counter = 0;

	public static void method1() {
		System.out.println(A.counter);
	}

	@Override
	public String toString() {
		return "A a : " + this.a;
	}

	public void hello(final int index) throws Exception {
		if (index == 0) {
			throw new Exception("Index 0");
		}
		System.out.println("Hello");
	}

	public void hello2(final int index) {
		if (index == 0) {
			throw new IllegalAccessError("Index 0");
		}
		System.out.println("Hello");
	}

	public void hello3(final int index) throws MyException {
		if (index == 0) {
			throw new MyException("Index 0");
		}
		System.out.println("Hello");
	}

	public static boolean isEmpty(final String str) {
		return (str == null) || str.isEmpty();
	}

	public static void main(final String[] args) {
		A.method1();

		A ao = new A();
		try {
			ao.hello2(0);
			ao.hello3(10);
			ao.hello(10);
		} catch (IllegalAccessError e1) {
			System.out.println("Oh");
		} catch (MyException e1) {
			System.out.println("MyException");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		try {
			System.out.println("A Objesi : " + ao.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
