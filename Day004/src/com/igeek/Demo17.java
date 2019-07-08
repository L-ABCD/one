package com.igeek;

import java.util.ArrayList;

/**
 * 给定一个字符串数组：{“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}，
 * 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上
 * 
 * @author admin
 *
 */
public class Demo17 {

	public static void main(String[] args) {
		//定义一个字符串
		String[] strs = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		//定义一个数组
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0 ;i<strs.length;i++){
			arr.add(strs[i]);
		}
		//遍历输出
		for(String name :arr){
			System.out.println(name);
		}
	}
}
