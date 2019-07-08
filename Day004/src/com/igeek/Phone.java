package com.igeek;

public class Phone {

	String brand;
	
	int price;
	
	String color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * call
	 * 打电话
	 * name
	 */
	
	public  void call(String name) {
		System.out.println("给"+name+"打电话");
	}
	
	/**
	 * sendMessage
	 * 发短信
	 */
	public void sendMessage(){
		System.out.println("群发短信");
	}
}
