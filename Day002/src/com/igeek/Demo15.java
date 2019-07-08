package com.igeek;


/**    封装方法并调用
 * 1、把遍历数组改进为方法实现，并调用方法
 * 2、把获取数组最值改进为方法实现，并调用方法
 * 3、写一个方法，用于对数组进行求和，并调用方法
 * @author admin
 *
 */
public class Demo15 {
	
	public static void main(String[] args) {
		int[] arr = {11,23,4,6,45,212};
		for(int i = 0;i<arr.length;i++){
			System.out.println("数组的第"+i+"个元素是"+arr[i]);
		}
		System.out.println("-------------------");
		
		int[] arr2 = {11,23,4,6,45,212,54,97};
		//调用方法
		printArray(arr2);
		System.out.println("-----------------");
		compareMax(arr2);
		System.out.println("-----------------");
		compareMin(arr2);
		System.out.println("------------------");
		sum(arr2);
	}
	
	//把遍历数组的实现过程，封装成方法
	public static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			System.out.println("数组的第"+i+"个元素是："+arr[i]);
		}	
	}
	
	//求数组的最大值
	public static void compareMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	//求数组的最小值
	public static void compareMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	//对数组进行求和
	public static void sum(int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			count += arr[i];
		}
		System.out.println(count);
	}

}
