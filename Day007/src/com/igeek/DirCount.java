package com.igeek;

import java.io.File;

public class DirCount {

	private long len;
	private String path;
	private File src;
	
	//�ļ��ĸ���
	private int fileSize;
	//�ļ��еĸ���
	private int dirSize;
	
	public DirCount(String path){
		super();
		this.path = path;
		this.src = new File(path);
		count(src);
	}

	public long getLen() {
		return len;
	}
	
	
	public int getFileSize() {
		return fileSize;
	}

	public int getDirSize() {
		return dirSize;
	}

	//ͳ���ļ��еĴ�С�����ļ��Ż�ͳ�ƣ�����ļ��м�����������
	public void count(File src) {
		//����
		if(src.exists() && null != src){
			if(src.isFile()){
				len += src.length();	
				fileSize++;
			}else{
				dirSize++;
				for(File file : src.listFiles()){
					count(file);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DirCount dirCount = new DirCount("C:/Users/admin/workspace/Day007");
		System.out.println(dirCount.getFileSize()+";"+dirCount.getDirSize());
		
		DirCount dirCount2 = new DirCount("C:/Users/admin/workspace/Day007/1.jpg");
		System.out.println(dirCount2.getFileSize()+";"+dirCount2.getDirSize());
	}
}
