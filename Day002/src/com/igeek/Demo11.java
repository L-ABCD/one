package com.igeek;

public class Demo11 {

	public static void main(String[] args){
		System.out.println(sum(12.4f,13.8f));
	    System.out.println(sum(1.2f,1.4f));
	    System.out.println(sum(12,43));
	}
	
	public static float sum(float a,float b) {
		return a+ b;
	}
	
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
}
