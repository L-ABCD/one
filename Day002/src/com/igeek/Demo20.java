package com.igeek;

import java.util.Scanner;


/**
 * 
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ����4����ί��ֵ�ƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 * @author admin
 *
 */
public class Demo20 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		//ʹ��Scanner�ഴ��һ������
		Scanner scanner = new Scanner(System.in);
		for(int i = 0;i < arr.length;i++){
			System.out.println("��"+(i+1)+"��ί��֣�");
			int number = scanner.nextInt();
			arr[i] = number;
		}
		
		int max = getMax(arr);
		int min = getMin(arr);
		int sum = sum(arr);
		
		int avg = (sum-max-min)/(arr.length-2);
		System.out.println("���÷�"+avg);
	}
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;	
	}
	
	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(min<arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int sum(int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			count +=arr[i];
		}
		return count;
	}
}
