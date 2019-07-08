package com.igeek;

import java.util.Scanner;


/**
 * 
 * 键盘输入一个月份，输出该月份对应的季节
 *    3,4,5  春季
 *    6，7,8  夏季
 *    9,10,11  秋季
 *    12,1,2  冬季
 * 分析：
 *    A：键盘输入一个月份，用Scnner实现
 *    B：判断该月份是几月，根据月份输出对应的季节
 *      if
 *      switch
 *      
 * @author admin
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个月份（1—12）：");
		int month = scanner.nextInt();
		
		//case穿透现象
		switch(month){
		case 1:
		case 2:
		case 12:
		
			System.out.println("冬季");
			break;
		case 3: 
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
			default:
				System.out.println("输入错误");
		}
	}
}
