package com.igeek;

import java.util.Scanner;

/**
 * 
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ�
 * ���磺"abc"���ǶԳ��ַ���"aba","abba","aaa","mnanm"�ǶԳ��ַ�
 * @author admin
 *
 */
public class Demo13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = scanner.nextLine();
		
		boolean flag = isSymmetry(str);
		System.out.println(flag);
	}
	
	/*
	 * ���ַ�����ת����ԭ�ȵ��ַ������ݱȽ�
	 * 
	 */
	public static boolean isSymmetry(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String res = sb.toString();
		return res.equals(str);
	}
}
