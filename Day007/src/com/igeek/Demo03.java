package com.igeek;

import java.io.File;

public class Demo03 {

	public static void main(String[] args) {
		String path = "C:/Users/admin/workspace/Day007/1.jpg";
		//绝对路径
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
		System.out.println("------------------");
		System.out.println(System.getProperty("user.dir"));
		System.out.println("-------------------");
		//相对路径
		file = new File("img.jpg");
		System.out.println(file.getAbsolutePath());
		
		//
		File file2 = new File("aa/img22.jpg");
		System.out.println(file2.getAbsolutePath());
		
	}
}
