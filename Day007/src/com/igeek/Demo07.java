package com.igeek;


/**
 * createNewFile();
 * delete();
 */
import java.io.File;
import java.io.IOException;

public class Demo07 {

	public static void main(String[] args) throws IOException {
		File file = new File("1.jpg");
		//Å×³öÒì³£
		//boolean flag = file.createNewFile();
		//System.out.println(flag);
		boolean flag = file.delete();
		System.out.println(flag);
	}
}
