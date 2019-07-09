package com.igeek;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
		//Â·¾¶·Ö¸ô·û
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//·Ö¸ô·û
		String path = "/Day007/1.jpg";
		String path2 = "C:+"+File.pathSeparator+"/Day007/1.jpg";
		
	}
}
