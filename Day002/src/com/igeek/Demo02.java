package com.igeek;

import java.util.Random;
import java.util.Scanner;


/*
 *ϵͳ����һ��1����100֮�����������²���������Ƕ���
 *������
 *A��ϵͳ����һ�������1����100֮��ġ�
 *  int number = r.nextInt��100��+1��
 *B������¼������Ҫ���������
 *  ��Scannerʵ��
 *C���Ƚ����������ݣ���if��䣩
 *   ���ˣ�������ʾ����
 *   С�ˣ�������ʾС��
 *   �����ˣ�������ʾ����ϲ�㣬������
 *D����β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô���أ�       
 * 
 * 
 */
public class Demo02 {
	
	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(100)+1;
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("�����������1����100��");
			int guessNumber = scanner.nextInt();
			
			if(guessNumber > number){
				System.out.println("̫����");
			}else if(guessNumber < number){
				System.out.println("̫С��");
			}else{
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}

}
