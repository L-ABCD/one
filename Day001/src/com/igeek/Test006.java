package com.igeek;

import java.util.Scanner;

/**
 * 
 * @author zx
 * @date 2019��7��1��
 * @version 1.0
 * @description ������¼��
 *
 */

public class Test006 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a = scanner.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b = scanner.nextInt();

		//�Ƚ��������Ĵ�С
		boolean flag = (a==b);
		System.out.println(flag);
		
		
	}
	

}
