package com.igeek;

/*
 * 求1——100的偶数和,用for循环
 */
public class Demo04 {

	public static void main(String[] args) {
		
		int result = 0;
		for(int i = 1;i <= 100;i++){
			if(i%2 == 0){
				result +=i;
			}
		}
		System.out.println(result);
	}
}
