package com.igeek;

import java.util.Scanner;

/**
 * ����ģ���¼�������λ��ᣬ����ʾ���м��λ���
 * ������A:�����û���������
 *    B�����������û��������� 		
 * 	Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

 *    C���Ƚ��û���������
 *    ���λ��᣺��ѭ���Ľ���for
 * @author admin
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String username = "gu";
		String password = "123";
		
		//�����û�������Ƚ��û���������
		for(int x = 0;x<3;x++){
			//���������û���������
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("����������");
			String pwd = sc.nextLine();
			
			
			//�Ƚ��û���������
			if(name.equals(username)&& pwd.equals(password)){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				//System.out.println("��¼ʧ��");
			}
			if((2-x) == 0){
				System.out.println("�˺ű���������ϵͳ����Ա��ϵ");
				
			}else{
				System.out.println("��¼ʧ�ܣ��㻹��"+(2-x)+"�λ���");
			}
		}
	}
}
