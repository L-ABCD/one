package com.igeek;

import java.util.Scanner;

/**
 * 
 * ����:����¼��һ�����ݣ�Ҫ����������λ������������Ҫ�����ݽ��м��ܣ����ܹ������£�
 *     ÿλ���ֶ������壬Ȼ�����10��������������֣�
 *     �ٽ���һλ�͵���λ�������ڶ�λ�͵���λ����
 *     ��Ѽ��ܺ���������������̨
 *     
 * @author admin
 *
 */
public class Demo03 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������λ������");
		int number = scanner.nextInt();
		
		int ge = number%10;
		int shi = number/10%10;
		int bai = number/10/10%10;
		int qian = number/10/10/10%10;
		
		int[] arr = new int[4];
		arr[0] = ge;
		arr[1] = shi;
		arr[2] = bai;
		arr[3] = qian;
		
		//ÿλ���ֶ������壬Ȼ�����10�������������

		for(int i = 0;i<arr.length;i++){
			arr[i] +=5;
			arr[i] %=10;
		}
		
		//�ٽ���һλ�������λ�������ڶ�λ�͵���λ����
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] =temp;
		
		int temp2 = arr[1];
		arr[1] = arr[2];
		arr[2] =temp2;
		
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}
