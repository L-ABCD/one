package com.igeek;


public class Demo06 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<5;j++){
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("----------------");
			jiu();
		}
	}
	
	//¾Å¾Å³Ë·¨±í
	
	public static void jiu( ) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+j*i+"  ");
			}
			System.out.println();
		}
	}
	}

