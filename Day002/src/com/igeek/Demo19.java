package com.igeek;


/**
 * 
 * (1)����һ��int���͵�һά���飬���ݰ���{171,72,19,16,118,532}
 * ��1������������������Ԫ�غ�
 * Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7������ֻ��Ϊż��
 * @author admin
 *
 */
public class Demo19 {

	public static void main(String[] args) {
		int[] arr = {171,72,19,16,118,532};
		int sum = 0;
		for(int i =0 ;i<arr.length;i++){
			if((arr[i]%10!=7)&&(arr[i]/10%10!=7)&&(arr[i]%2==0)){
				sum +=arr[i];  
			}
		}
			
		System.out.println(sum);
	}
}
