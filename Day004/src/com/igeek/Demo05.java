package com.igeek;

public class Demo05 {

	public static void main(String[] args) {
		
		String str = "hiString";
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		System.out.println("i");
		System.out.println("----------------");
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 5));
		
		//����
		for(int i = 0;i < str.length();i++){
			System.out.println(str.charAt(i)+" ");
		}
	}
}
