package com.igeek;


/*
 * ��ӡ������ǣ����У�:����ʽϵ�����������е�һ�ּ�������
 * 
 * 
 */
public class Demo08 {
	
	public static void main(String[] args) {
		//����һ����ά����
		int length = 7;
		int arr[][] = new int[length][];
		
		//������ά����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		//��һ��
		arr[0][0] = 1;
		
		for(int i = 1; i< arr.length; i++){
			//ÿ������ĵ�һ��Ԫ��ֵ1
			arr[i][0] = 1;
			
			for(int j = 0;j<arr.length-1;j++){
				arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
			}
			//ÿ����������һ��Ԫ����һ
			arr[i][arr[i].length-1] = 1;
		}
		
		//������ӡ
		for(int[] is:arr){
			for(int is2:is){
				System.out.println(is2+" ");
			}
			System.out.println();
		}
		
	}

}
