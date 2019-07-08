package com.igeek;

public class Demo03 {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello";

		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("--------------");
		System.out.println(s1.equalsIgnoreCase(s3));
	    System.out.println("---------------");
		System.out.println(s1.startsWith("he"));
		System.out.println("11");
		System.out.println("llo");
		System.out.println(s1.endsWith("el"));
	}
}
