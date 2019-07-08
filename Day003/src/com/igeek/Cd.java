package com.igeek;

public class Cd extends Item{

	//成员属性
	private String artist;
	
	
	//构造函数 source-
	public Cd(String title,String artist){
		super(title);
		this.artist = artist;
	}
	

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	// 成员方法
		
	
	@Override
	public void print() {
		System.out.println(getTitle() + ";" + artist);
	}

	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", title=" + title + "]";
	}
	
	
}
