package com.igeek;

import java.util.Scanner;


/*
 * 根据键盘录入的数值1、2、3...7对应的星期一，星期二，。。。星期天
 * 
 * 
 */
public class Demo03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字（1——7）：");
		int week = scanner.nextInt();
				
		switch (week){
		case 1:
			System.out.println("星期一");
		    break;
		case 2:
			System.out.println("星期二");
		    break;
		case 3:
			System.out.println("星期三");
		    break;
		case 4:
			System.out.println("星期四");
		    break;
		case 5:
			System.out.println("星期五");
		    break;
		case 6:
			System.out.println("星期六");
		    break;
		case 7:
			System.out.println("星期天");
		    break;
		default:
			System.out.println("输入数据有误");
			break;
		}
	}
}
