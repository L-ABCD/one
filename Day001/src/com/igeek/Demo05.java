package com.igeek;

/*
 * ͳ��ˮ�ɻ��ĸ�����153=1*1*1+5*5*5+3*3*3
 * 
 */
public class Demo05 {
	public static void main(String[] args) {
		
		int geshu = 0;
		
		//��ȡ���ݵĸ�λ��ʮλ����λ
		for(int i = 100;i<=999;i++){
			int ge = i%10;  
			int shi = 1%100/10;  
			int bai = i/100;   
			
			//�ж��Ƿ�Ϊˮ�ɻ���
			if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println(i);
				geshu ++;
			}
			
		}
		//���ˮ�ɻ�����
		System.out.println("ˮ�ɻ�����"+geshu);
		
	}

}
