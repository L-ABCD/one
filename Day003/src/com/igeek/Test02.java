package com.igeek;


/**
 * ģ�����ʱ����ʾʱ��
 */
import java.text.SimpleDateFormat;

public class Test02 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		while (true){
			try{
				System.out.println(sdf.format(System.currentTimeMillis()));
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
