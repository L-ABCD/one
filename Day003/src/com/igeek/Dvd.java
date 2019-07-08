package com.igeek;

public class Dvd extends Item{

	//��Ա����
	private String director ;
	
	//���캯�� source-
		public Dvd(String title,String director){
			super(title);
			this.director = director;
		}
	
	public String getdirector() {
		return director;
	}
	
	
	public void setdirector(String director) {
		this.director = director;
	}

	@Override
	public void print() {
		System.out.println(getTitle()+";"+director);
	}
	
	
	@Override
	public String toString() {
		return "Dvd [director="+director+",title="+title+"]";
	
	}
	
}
