package com.igeek;


/**
 * 
 * (1)定义一个int类型的一维数组，内容包括{171,72,19,16,118,532}
 * （1）求出该数组中满足的元素和
 * 要求：求和的元素的个位和十位不能包含7，并且只能为偶数
 * @author admin
 *
 */
public class Demo19 {

	public static void main(String[] args) {
		int[] arr = {171,72,19,16,118,532};
		int sum = 0;
		for(int i =0 ;i<arr.length;i++){
			if((arr[i]%10!=7)&&(arr[i]/10%10!=7)&&(arr[i]%2==0)){
				sum +=arr[i];  
			}
		}
			
		System.out.println(sum);
	}
}
