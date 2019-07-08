package com.igeek;

/*
 * 
 * 获取数组的最大值和最小值
 * 
 */

public class Demo05 {
	
	public static void main(String[] args) {
		//定义数组
		int arr[] = {12,98,45,64,14};
		int max=arr[0];
		int min = arr[0];
		//遍历数组
		for(int i = 0;i<arr.length;i++){
			//判断大小
			if(arr[i]>max){
				max = arr[i];
				System.out.println("最大值是:"+max);
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("最小值是："+min);
	}
	
	//bubbleSore(冒泡排序)
	public static void bubbleSore(int[] arr) {  
		
		int temp;
		
		//外层的循环，可以决定一共走几趟
		for(int i = 0; i< arr.length;i++){
			//内层循环，逐个比较
			for(int j = 0;j<arr.length-1-i;j++){
				//两两比较
				if(arr[j] > arr[j+1]){
					//换位
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("***************");
		for(int i:arr){
			System.out.println(i+"\t");
		}
	}
}
