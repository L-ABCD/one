package com.igeek;

import java.io.File;

public class Demo11 {

	public static long len = 0;
	
	public static void main(String[] args) {
		File file = new File ("");
        count(file);
        System.out.println(len);
	}
	
	
	//ͳ���ļ��еĴ�С�����ļ��Ż�ͳ�ƣ�����ļ��м�����������
	public static void count(File src) {
		//����
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
