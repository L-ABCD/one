package com.igeek;

/***
 * 
 * 
 * @author admin
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		
		String str = "abcAA";
		
		char[] chs = str.toCharArray();
		for(char c:chs){
			System.out.println(c+" ");
		}
		System.out.println("-----------");
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
}
