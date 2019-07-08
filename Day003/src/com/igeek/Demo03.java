package com.igeek;

import java.util.Scanner;

/**
 * 
 * 需求:键盘录入一个数据，要求数据是四位的整数，现需要对数据进行加密，加密规则如下：
 *     每位数字都加上五，然后除以10的玉树代替该数字，
 *     再将第一位和第四位交换，第二位和第三位交换
 *     请把加密后的数据输出到控制台
 *     
 * @author admin
 *
 */
public class Demo03 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入四位整数：");
		int number = scanner.nextInt();
		
		int ge = number%10;
		int shi = number/10%10;
		int bai = number/10/10%10;
		int qian = number/10/10/10%10;
		
		int[] arr = new int[4];
		arr[0] = ge;
		arr[1] = shi;
		arr[2] = bai;
		arr[3] = qian;
		
		//每位数字都加上五，然后除以10的余数代替该数

		for(int i = 0;i<arr.length;i++){
			arr[i] +=5;
			arr[i] %=10;
		}
		
		//再将第一位数与第四位交换，第二位和第三位交换
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] =temp;
		
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] =temp2;
		
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}
