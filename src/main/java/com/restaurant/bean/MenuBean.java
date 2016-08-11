package com.restaurant.bean;

public class MenuBean {
	int id;
	String itemName;
	double price;
	public int getId() {
		return id;
	}
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "MenuBean [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
	public MenuBean(int id, String itemName, double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}
	

}
