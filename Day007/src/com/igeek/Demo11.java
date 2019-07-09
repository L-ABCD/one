package com.igeek;

import java.io.File;

public class Demo11 {

	public static long len = 0;
	
	public static void main(String[] args) {
		File file = new File ("");
        count(file);
        System.out.println(len);
	}
	
	
	//统计文件夹的大小，有文件才会统计，如果文件夹继续往里面走
	public static void count(File src) {
		//存在
		if(src.exists() && null != src){
			if(src.isFile()){
				len += src.length();
			}else{
				for(File file : src.listFiles()){
					count(file);
				}
			}
		}
	}
}
