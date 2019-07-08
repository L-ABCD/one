package com.igeek;

import java.util.Arrays;

/**
 * 
 * 把数组中的数据按照指定格式拼接成一个字符串:
 *   Arrays.toString();
 * 例子：int[] arr = {1,2,3};
 * 输出结果： [1;2;3]
 * @author admin
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String str = Arrays.toString(arr);
		System.out.println(str);
		
	}
}
