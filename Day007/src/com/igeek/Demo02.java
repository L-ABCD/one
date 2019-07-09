package com.igeek;

import java.io.File;

public class Demo02 {

	public static void main(String[] args) {
		//1、构造File对象
		//File（String pathname）
		String path = "C:/Users/admin/workspace/Day007/1.jpg";
		File file = new File(path);
		System.out.println(file.length());;
		//2、File(String parent,String child)	
		file = new File("IMG_20190304_224221.jpg");
		System.out.println(file.length());
		
		//3、File（File parent，String child）
		file = new File(new File("IMG_20190304_224221.jpg"),"img.jpg");
		System.out.println(file.length());
		
	}
}
