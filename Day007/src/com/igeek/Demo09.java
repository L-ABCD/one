package com.igeek;

import java.io.File;

public class Demo09 {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/admin/workspace/Day007");
		String[] fStrings = file.list();
		
		for(String string : fStrings){
			System.out.println(string);
			
		}
		
		File[] files = file.listFiles();
		for(File file2:files){
			System.out.println(file2.getAbsolutePath());
		}
		
		File[] files2 = file.listRoots();
		for(File file2 : files2){
			System.out.println(file2.getAbsolutePath());
		}
	}
}
