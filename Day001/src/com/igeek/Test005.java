package com.igeek;

public class Test005 {
	
	public static void main(String[] args) {
		
		//��ȡ�������еĴ���
		int a = 10;
		int b = 20;
		
		int c = (a>b) ? a:b;
		System.out.println(c);
		
		boolean d = (a==b) ?true:false;
		System.out.println(d);
		
		//�Ƚ������������ֵ
		int e =30;
		int temp = (a>b)?a:b;
		int max = (temp>e)?temp:e;
		System.out.println(max);
		
	
	}

}
