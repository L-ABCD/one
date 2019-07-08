package com.igeek;

/*
 * 输入两个数据，返回两个数中的最大值
 * 
 * 
 */
public class Demo10 {
	
	public static void main(String[] args) {
		int max = getMax(10,20);
		System.out.println(max);
		System.out.println("-------");
		System.out.println(compare(10,20));
		System.out.println("-------");
		System.out.println(getMax(1,2,4));
		
	}
	
	public static int getMax(int a,int b){
		int max = 0;
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		return max;
	}
	
	//比较a和b等不等，若不等则返回false，相等则返回true
	public static boolean compare(int a,int b) {
		return a==b;	
	}

	//比较三个数中的最大值
	public static int getMax(int a,int b,int c){
		int max = a;
		if(max < b){
			max = b;
		}
		if(max <c){
			max = c;
		}
		return max;
	}
}
