package com.igeek;

public class Item {

	protected String title;
	private int playingTime;
	private String comment;

    //source-	
	public Item(String title) {
		super();
		this.title = title;
	}
	
	//source-
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Item print()....");
	}
	
	
}
