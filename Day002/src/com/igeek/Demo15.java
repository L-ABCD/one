package com.igeek;


/**    ��װ����������
 * 1���ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 * 2���ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 * 3��дһ�����������ڶ����������ͣ������÷���
 * @author admin
 *
 */
public class Demo15 {
	
	public static void main(String[] args) {
		int[] arr = {11,23,4,6,45,212};
		for(int i = 0;i<arr.length;i++){
			System.out.println("����ĵ�"+i+"��Ԫ����"+arr[i]);
		}
		System.out.println("-------------------");
		
		int[] arr2 = {11,23,4,6,45,212,54,97};
		//���÷���
		printArray(arr2);
		System.out.println("-----------------");
		compareMax(arr2);
		System.out.println("-----------------");
		compareMin(arr2);
		System.out.println("------------------");
		sum(arr2);
	}
	
	//�ѱ��������ʵ�ֹ��̣���װ�ɷ���
	public static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			System.out.println("����ĵ�"+i+"��Ԫ���ǣ�"+arr[i]);
		}	
	}
	
	//����������ֵ
	public static void compareMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	//���������Сֵ
	public static void compareMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	//������������
	public static void sum(int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			count += arr[i];
		}
		System.out.println(count);
	}

}
