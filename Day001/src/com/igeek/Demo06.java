package com.igeek;

/*
 * 用while循环实现1——100偶数和
 * 
 * 
 */
public class Demo06 {
	
	public static void main(String[] args) {
		//while循环
		int x = 1;
		int result = 0;
		while (x<=100){
			result += x;
			x++;
		}
		
		System.out.println(result);
		System.out.println("-------------");
		//do...while循环
		x=1;
		result = 0;
		do{
			result += x;
			x++;
		}while(x <= 100);
		
		System.out.println(result);
		System.out.println("-------------");
		//foreach循环
		int[] arry = {1,2,3,4,5};
		for(int i:arry){
			System.out.println(i);
		}
	}

}
