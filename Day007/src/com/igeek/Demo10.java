package com.igeek;

import java.io.File;

/**
 * �ݹ����Recurison
 * �Լ������Լ�
 * @author admin
 *
 */
public class Demo10 {

	public static void main(String[] args) {
	
		File file = new File ("1.jpg");
		printName(file);
	}
	
	//��ӡ1����10����
	public static void printNumber(int n){
		if(n>10){
			return;
		}
		System.out.println(n);
		printNumber(n+1);
	}
	
	
	
	
	//��ӡ����Ŀ¼���ļ�������
	public static void printName(File src) {
		System.out.println(src.getName());
		if(null == src || !src.exists()){
			return;
		}else if(src.isDirectory()){//Ŀ¼
			for(File file : src.listFiles()){
				printName(file);
			}
		}
	}
}
