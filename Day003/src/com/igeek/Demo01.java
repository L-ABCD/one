package com.igeek;

import java.util.Scanner;


/**
 * (1)�������������int���͵����ݴ洢����arr��
 * ��2�������巽����arr�����е����ݷ�ת
 * ��3�������巽���Է�ת���������б���
 * @author admin
 *
 */
public class Demo01 {
	
public static void main(String[] args) {
	
	//
	int[] arr = new int[5];
	
	Scanner scanner = new Scanner(System.in);
	for(int i = 0;i<arr.length;i++){
		System.out.println("�������"+(i+1)+"������");
		arr[i] = scanner.nextInt();
	}
	
	System.out.println("��תǰ");
	printArray(arr);
	System.out.println("-----------");
	//��ת����
	//���÷���
	reverse(arr);
	printArray(arr);
}

public static void printArray(int[] arr) {
	for(int i :arr){
		System.out.print(i+" ");
	}
	System.out.println();
}


//��ת����
public static void reverse(int[] arr) {
	for(int i = 0,j = arr.length-1;i<=j;i++,j--){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
}
