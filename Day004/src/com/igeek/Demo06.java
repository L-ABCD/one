package com.igeek;

import java.util.Scanner;

/**
 * ͳ��һ���ַ����д�Сд��ĸ�ַ����Լ������ַ����ֵĴ����������������ַ���
 * @author admin
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		//����һ���ַ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ַ�:");
        String str = scanner.nextLine();
        
		int da = 0;
		int xiao = 0;
		int shu = 0;
		
		//ѭ��
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				da++;
			}else if(ch >= 'a' && ch <= 'z'){
				xiao++;
				
			}else if(ch >= '0' && ch <= '9'){
				shu++;
			}
//			System.out.println("��д��ĸ�ĸ����ǣ�"+da);
//			System.out.println("Сд��ĸ�ĸ����ǣ�"+xiao);
//			System.out.println("������ĸ�ĸ����ǣ�"+shu);

		}
		System.out.println("��д��ĸ�ĸ����ǣ�"+da);
		System.out.println("Сд��ĸ�ĸ����ǣ�"+xiao);
		System.out.println("������ĸ�ĸ����ǣ�"+shu);
	}
}
