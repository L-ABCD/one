package com.igeek;

import java.io.File;

public class Demo01 {

	public static void main(String[] args) {
		//·���ָ���
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//�ָ���
		String path = "/Day007/1.jpg";
		String path2 = "C:+"+File.pathSeparator+"/Day007/1.jpg";
		
	}
}
