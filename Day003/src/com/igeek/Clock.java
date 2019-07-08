package com.igeek;

public class Clock {
	
	Display hour = new Display(24);
	
	Display minute = new Display(60);
	
	private void start() {

		while (true){
			minute.increase();
			if(minute.getValue() == 0){
				hour.increase();
			}
			System.out.println(hour.getValue()+":"+minute);
		}
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.start();
	}

}
