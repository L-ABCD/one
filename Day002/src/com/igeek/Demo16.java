package com.igeek;

import java.util.Scanner;


/**
 * 
 * ��������һ���·ݣ�������·ݶ�Ӧ�ļ���
 *    3,4,5  ����
 *    6��7,8  �ļ�
 *    9,10,11  �＾
 *    12,1,2  ����
 * ������
 *    A����������һ���·ݣ���Scnnerʵ��
 *    B���жϸ��·��Ǽ��£������·������Ӧ�ļ���
 *      if
 *      switch
 *      
 * @author admin
 *
 */
public class Demo16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ���·ݣ�1��12����");
		int month = scanner.nextInt();
		
		//case��͸����
		switch(month){
		case 1:
		case 2:
		case 12:
		
			System.out.println("����");
			break;
		case 3: 
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
			default:
				System.out.println("�������");
		}
	}
}
