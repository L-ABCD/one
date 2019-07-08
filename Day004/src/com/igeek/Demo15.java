package com.igeek;

/**
 * 对数组的操作
 */
import java.util.ArrayList;

public class Demo15 {

	public static void main(String[] args) {
		//定义一个数组
		ArrayList<String> arrayList = new ArrayList();
		//添加元素
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add(0,"hi");
		arrayList.add("nihao");
		//按顺序输出数组的值
		System.out.println(arrayList);
		//返回元素数量
		System.out.println(arrayList.size());
		//获取
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));
//		//删除
//		String ele = arrayList.remove(3);
//		System.out.println(ele);
//		System.out.println(arrayList);
//		System.out.println(arrayList.remove("world"));
//		System.out.println(arrayList);
		//修改
		arrayList.set(2, "android");
		System.out.println(arrayList);

	}
}
