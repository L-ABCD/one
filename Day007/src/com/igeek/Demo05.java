package com.igeek;

/**
 * 
 */
import java.io.File;

public class Demo05 {

	public static void main(String[] args) {
	
		String path = "1.jpg";
		File file = new File(path);
		System.out.println(file.getAbsolutePath());
	    System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("******************");
		File file2 = new File("D:/eclipse-workspace/day07");

		System.out.println(file2.getAbsolutePath());

		System.out.println(file2.exists());

		System.out.println(file2.isFile());

		System.out.println(file2.isDirectory());
		
		//
		file = new File("xxx");
		if(!file.exists()){
			System.out.println("不存在");
		}else if(file.isFile()){
			System.out.println("文件");
		}
	}
	
	
}
