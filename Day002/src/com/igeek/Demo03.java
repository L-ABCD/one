package com.igeek;

/*
 * ���飺
 * ��ʽ1����������[] ������
 * ��ʽ2����������  ������[]
 * 
 * ��������[] ������ = new ��������[]{Ԫ��1��Ԫ��2��������}
 * �򻯸�ʽ��
 * ��������[] ������ = {Ԫ��1��Ԫ��2��...};
 * 
 */
public class Demo03 {
	
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int arr2[] = new int[] {1,2,3,4,5};
		int arr3[] = {1,2,3,4,5};
		
		//java.lang.ArrayIndexOutOfBoundsException: 5
		System.out.println(arr1);
		System.out.println(arr1[0]);
		//System.out.println(arr1[5]);
		
		System.out.println(arr1[arr1.length-1]);
	}

}
