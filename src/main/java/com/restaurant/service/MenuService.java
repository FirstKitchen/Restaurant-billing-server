package com.restaurant.service;

import java.util.List;

import com.restaurant.bean.MenuBean;

public interface MenuService {
	
	public List<MenuBean> getAllMenu();
	public MenuBean getMenu(String itemName);
	public String addMenu(MenuBean menuBean);
	public String removeMenu(String itemName);
	public String updateMenu(MenuBean menuBean);

}
