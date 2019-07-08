package com.igeek;

public class Demo12 {

	public static void main(String[] args) {
		System.out.println(compare(10,20));
		System.out.println("--------");
		System.out.println(compare((byte)10,(byte)20));
		System.out.println("--------");
		System.out.println(compare((short)10,(short)20));
		System.out.println("--------");
		System.out.println(compare(10L,20L));
	}
	
	//两个byte类型的
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a==b;
	}
	
	//两个short类型的
	public static boolean compare(short a,short b) {
		
		System.out.println("short");
		return a==b;
	}
	
	//两个int类型的
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a==b;
	}
	
	//两个long类型的
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a==b;
	}
}

