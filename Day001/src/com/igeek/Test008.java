package com.igeek;

import java.util.Scanner;

/*
 * ¼��ѧ���ɼ��������ж�ѧ�������ĸ����
 * 
 * 90-100	����
 * 80-90	��
 * 70-80	��
 * 60-70	����
 * 60����	������
 * 
 * 
 * ������
 * 		A:����¼��ѧ�����Գɼ�
 * 			������
 * 		B:ͨ���򵥵ķ��������Ǿ�������if����ʽ3��ʵ��
 * 
 * ����һ��Ҫ������ȫ�ˡ�
 * 		��ȫ����
 * 		�߽�����
 * 		��������
 * 
 */

public class Test008 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int score = scanner.nextInt();
		
		if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80 && score <90){
			System.out.println("����");
		}else if(score>=70 && score <80){
			System.out.println("�е�");
        }else
			System.out.println("������");
        }
}
