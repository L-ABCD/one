package com.igeek;

/*
 * 
 * ��ȡ��������ֵ����Сֵ
 * 
 */

public class Demo05 {
	
	public static void main(String[] args) {
		//��������
		int arr[] = {12,98,45,64,14};
		int max=arr[0];
		int min = arr[0];
		//��������
		for(int i = 0;i<arr.length;i++){
			//�жϴ�С
			if(arr[i]>max){
				max = arr[i];
				System.out.println("���ֵ��:"+max);
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("��Сֵ�ǣ�"+min);
	}
	
	//bubbleSore(ð������)
	public static void bubbleSore(int[] arr) {  
		
		int temp;
		
		//����ѭ�������Ծ���һ���߼���
		for(int i = 0; i< arr.length;i++){
			//�ڲ�ѭ��������Ƚ�
			for(int j = 0;j<arr.length-1-i;j++){
				//�����Ƚ�
				if(arr[j] > arr[j+1]){
					//��λ
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("***************");
		for(int i:arr){
			System.out.println(i+"\t");
		}
	}
}
