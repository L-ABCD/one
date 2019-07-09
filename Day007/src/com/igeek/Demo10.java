package com.igeek;

import java.io.File;

/**
 * 递归调用Recurison
 * 自己调用自己
 * @author admin
 *
 */
public class Demo10 {

	public static void main(String[] args) {
	
		File file = new File ("1.jpg");
		printName(file);
	}
	
	//打印1——10的数
	public static void printNumber(int n){
		if(n>10){
			return;
		}
		System.out.println(n);
		printNumber(n+1);
	}
	
	
	
	
	//打印子孙目录和文件的名称
	public static void printName(File src) {
		System.out.println(src.getName());
		if(null == src || !src.exists()){
			return;
		}else if(src.isDirectory()){//目录
			for(File file : src.listFiles()){
				printName(file);
			}
		}
	}
}
