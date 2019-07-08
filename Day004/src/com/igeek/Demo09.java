package com.igeek;

/**
 * 
 * ¶Ô×Ö·û´®²Ù×÷£º
 * 
 * @author admin
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		
		String str = "   hi  hello         ";
		String str1 = "hi   hello";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println("------------------");
		System.out.println(str.trim());
		System.out.println(str1.trim());
		System.out.println("-------------------");
		String str2 = "11,22,33,44,55";
		String[] strs = str2.split(",");
		System.out.println(strs);
	}
}
