package com.igeek;

import java.util.Scanner;

/**
 * 统计一个字符串中大小写字母字符，以及数字字符出现的次数（不考虑其他字符）
 * @author admin
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		//输入一串字符
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符:");
        String str = scanner.nextLine();
        
		int da = 0;
		int xiao = 0;
		int shu = 0;
		
		//循环
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				da++;
			}else if(ch >= 'a' && ch <= 'z'){
				xiao++;
				
			}else if(ch >= '0' && ch <= '9'){
				shu++;
			}
//			System.out.println("大写字母的个数是："+da);
//			System.out.println("小写字母的个数是："+xiao);
//			System.out.println("数字字母的个数是："+shu);

		}
		System.out.println("大写字母的个数是："+da);
		System.out.println("小写字母的个数是："+xiao);
		System.out.println("数字字母的个数是："+shu);
	}
}
