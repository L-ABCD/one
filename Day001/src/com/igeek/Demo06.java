package com.igeek;

/*
 * ��whileѭ��ʵ��1����100ż����
 * 
 * 
 */
public class Demo06 {
	
	public static void main(String[] args) {
		//whileѭ��
		int x = 1;
		int result = 0;
		while (x<=100){
			result += x;
			x++;
		}
		
		System.out.println(result);
		System.out.println("-------------");
		//do...whileѭ��
		x=1;
		result = 0;
		do{
			result += x;
			x++;
		}while(x <= 100);
		
		System.out.println(result);
		System.out.println("-------------");
		//foreachѭ��
		int[] arry = {1,2,3,4,5};
		for(int i:arry){
			System.out.println(i);
		}
	}

}
