package com.igeek;

/**
 * getName()
 * getPath()
 * getAbsolutePath()
 * 
 */
import java.io.File;

public class Demo04 {

	public static void main(String[] args) {
		String path = "1.jpg";
		File file = new File(path);
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		
		System.out.println();
	}
}
