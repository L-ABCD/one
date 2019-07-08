package com.igeek;


/*
 * 打印杨辉三角（七行）:二项式系数在三角形中的一种几何排列
 * 
 * 
 */
public class Demo08 {
	
	public static void main(String[] args) {
		//定义一个二维数组
		int length = 7;
		int arr[][] = new int[length][];
		
		//遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		//第一行
		arr[0][0] = 1;
		
		for(int i = 1; i< arr.length; i++){
			//每个数组的第一个元素值1
			arr[i][0] = 1;
			
			for(int j = 0;j<arr.length-1;j++){
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
			//每个数组的最后一个元素是一
			arr[i][arr[i].length-1] = 1;
		}
		
		//遍历打印
		for(int[] is:arr){
			for(int is2:is){
				System.out.println(is2+" ");
			}
			System.out.println();
		}
		
	}

}
