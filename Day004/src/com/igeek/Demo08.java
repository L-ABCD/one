package com.igeek;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，把该字符串的首字母转成大写，其余的为小写（只考虑英文字母）
 * @author admin
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		
		//输入字符
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入字符：");
//		String str = scanner.nextLine();
		String str = "ascWJSSaq12";
		
		//获取首字符,并将获取的首字符转化成大写
		String s1 = str.substring(0,1);
		s1 = s1.toUpperCase();
		
		//获取除首字符其余的字符，并将此字符转化成小写
		String s2 = str.substring(1,str.length());
		s2 = s2.toLowerCase();
		
		//将s1与s2连接起来并赋值给str
		str = s1.concat(s2);
		System.out.println(str);
		}
		
	}
