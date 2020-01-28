package com.ykb.java.atm;

import java.util.Scanner;

public interface IMenuItem {
	String menuDesc();

	void execute(Scanner s, Customer customer);
}
