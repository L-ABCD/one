package com.igeek;

import java.util.Scanner;


/*
 * ���ݼ���¼�����ֵ1��2��3...7��Ӧ������һ�����ڶ���������������
 * 
 * 
 */
public class Demo03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������֣�1����7����");
		int week = scanner.nextInt();
				
		switch (week){
		case 1:
			System.out.println("����һ");
		    break;
		case 2:
			System.out.println("���ڶ�");
		    break;
		case 3:
			System.out.println("������");
		    break;
		case 4:
			System.out.println("������");
		    break;
		case 5:
			System.out.println("������");
		    break;
		case 6:
			System.out.println("������");
		    break;
		case 7:
			System.out.println("������");
		    break;
		default:
			System.out.println("������������");
			break;
		}
	}
}
