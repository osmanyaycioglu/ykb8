package com.ykb.java.atm;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {

	public List<IMenuItem> getMenu() {
		List<IMenuItem> menuItems = new ArrayList<>();
		menuItems.add(new MenuItemParaYatir());
		menuItems.add(new MenuItemParaCek());
		menuItems.add(new MenuItemParaGoruntule());
		return menuItems;

	}

}
