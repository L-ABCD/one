package com.igeek;

import java.util.Scanner;


/**
 * 
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个评委打分的平均值。
 * 请写代码实现。(不考虑小数部分)
 * @author admin
 *
 */
public class Demo20 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		//使用Scanner类创建一个对象
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < arr.length;i++){
			System.out.println("请"+(i+1)+"评委打分：");
			int number = scanner.nextInt();
			arr[i] = number;
		}
		
		int max = getMax(arr);
		int min = getMin(arr);
		int sum = sum(arr);
		
		int avg = (sum-max-min)/(arr.length-2);
		System.out.println("最后得分"+avg);
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;	
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(min<arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			count +=arr[i];
		}
		return count;
	}
}
