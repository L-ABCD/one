package com.igeek;

public class Test002 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("------------");
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println("------------");
		System.out.println(a == b);
		System.out.println(b != c);
		System.out.println("------------");
		System.out.println(b == c);
		System.out.println(a != c);
		System.out.println("------------");
		
		int x = 3;
		int y = 4;
		//System.out.println(x==y);
		//System.out.println(x=y); //��y��ֵ��x����x��ֵ���
		boolean bb = (x==y);
		//����
		//boolean cc = (x=y);
		int cc = (x=y);

	}

}
