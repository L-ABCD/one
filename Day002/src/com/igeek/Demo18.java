package com.igeek;


/**
 * ��һ�����ӣ��ӳ��������¶���һ�����ӣ�С���ӳ���������������һ������
 * �������Ӷ��������ʵڶ�ʮ���µ����Ӷ����Ƕ���
 * @author admin
 *
 *  ��һ���£�1  
 *  �ڶ����£�1
 *  �������£�1 1 2
 *  ���ĸ��£�1 1 1 3
 *  ������£�1 1 1 1 5
 *  
 *  
 */
public class Demo18 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[19]);
	}
}
