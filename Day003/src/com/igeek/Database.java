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
		database.add(new Cd("�ɱ�","������"));
		database.add(new Cd("�ɶ�","����"));
		database.add(new Dvd("ǧ��ǧѰ","���鿥"));
		database.list();
	}
}
