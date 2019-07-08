package com.igeek;

import java.util.Scanner;


/**
 * (1)、键盘输入五个int类型的数据存储数组arr中
 * （2）、定义方法将arr数组中的内容反转
 * （3）、定义方法对反转后的数组进行遍历
 * @author admin
 *
 */
public class Demo01 {
	
public static void main(String[] args) {
	
	//
	int[] arr = new int[5];
	
	Scanner scanner = new Scanner(System.in);
	for(int i = 0;i<arr.length;i++){
		System.out.println("请输入第"+(i+1)+"个数：");
		arr[i] = scanner.nextInt();
	}
	
	System.out.println("反转前");
	printArray(arr);
	System.out.println("-----------");
	//反转数组
	//调用方法
	reverse(arr);
	printArray(arr);
}

public static void printArray(int[] arr) {
	for(int i :arr){
		System.out.print(i+" ");
	}
	System.out.println();
}


//反转数组
public static void reverse(int[] arr) {
	for(int i = 0,j = arr.length-1;i<=j;i++,j--){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
}
