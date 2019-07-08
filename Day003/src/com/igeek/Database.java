package com.igeek;


import java.util.ArrayList;
import java.util.List;

public class Database {

	List<Item> items = new ArrayList<Item>();
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void list() {
		for (Item item : items) {
			item.print();
		}
	}

	
	public static void main(String[] args) {
		Database database = new Database();
		database.add(new Cd("干杯","五月天"));
		database.add(new Cd("成都","赵雷"));
		database.add(new Dvd("千与千寻","宫崎骏"));
		database.list();
	}
}
