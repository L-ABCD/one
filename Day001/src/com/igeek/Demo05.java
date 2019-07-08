package com.igeek;

/*
 * 统计水仙花的个数：153=1*1*1+5*5*5+3*3*3
 * 
 */
public class Demo05 {
	public static void main(String[] args) {
		
		int geshu = 0;
		
		//获取数据的个位、十位、百位
		for(int i = 100;i<=999;i++){
			int ge = i%10;  
			int shi = 1%100/10;  
			int bai = i/100;   
			
			//判断是否为水仙花数
			if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println(i);
				geshu ++;
			}
			
		}
		//输出水仙花个数
		System.out.println("水仙花数："+geshu);
		
	}

}
