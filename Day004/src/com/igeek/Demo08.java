package com.igeek;

import java.util.Scanner;

/**
 * ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д�������ΪСд��ֻ����Ӣ����ĸ��
 * @author admin
 *
 */
public class Demo08 {

	public static void main(String[] args) {
		
		//�����ַ�
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("�������ַ���");
//		String str = scanner.nextLine();
		String str = "ascWJSSaq12";
		
		//��ȡ���ַ�,������ȡ�����ַ�ת���ɴ�д
		String s1 = str.substring(0,1);
		s1 = s1.toUpperCase();
		
		//��ȡ�����ַ�������ַ����������ַ�ת����Сд
		String s2 = str.substring(1,str.length());
		s2 = s2.toLowerCase();
		
		//��s1��s2������������ֵ��str
		str = s1.concat(s2);
		System.out.println(str);
		}
		
	}
