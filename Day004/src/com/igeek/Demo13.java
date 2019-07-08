package com.igeek;

import java.util.Scanner;

/**
 * 
 * 判断一个字符串是否是对称字符
 * 例如："abc"不是对称字符，"aba","abba","aaa","mnanm"是对称字符
 * @author admin
 *
 */
public class Demo13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = scanner.nextLine();
		
		boolean flag = isSymmetry(str);
		System.out.println(flag);
	}
	
	/*
	 * 把字符串反转，和原先的字符串内容比较
	 * 
	 */
	public static boolean isSymmetry(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String res = sb.toString();
		return res.equals(str);
	}
}
