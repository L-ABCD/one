package com.igeek;

import java.io.File;

/**
 * mkdir();
 * mkdirs();
 * @author admin
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		File file = new File("C:/Users/admin/workspace/Day007/1.jpg");
		//´´½¨Ä¿Â¼
//		boolean flag = file.mkdir();
//		boolean flag = file.mkdirs();
//		System.out.println(flag);
		
		File file2 = new File("C:/Users/admin/workspace/Day007/1.jpg");
		boolean flag = file2.mkdir();
		System.out.println(flag);
	}
}
