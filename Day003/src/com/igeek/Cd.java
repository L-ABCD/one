package com.igeek;

public class Cd extends Item{

	//��Ա����
	private String artist;
	
	
	//���캯�� source-
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

	// ��Ա����
		
	
	@Override
	public void print() {
		System.out.println(getTitle() + ";" + artist);
	}

	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", title=" + title + "]";
	}
	
	
}
