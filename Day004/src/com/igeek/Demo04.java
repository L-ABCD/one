package com.igeek;

import java.util.Scanner;

/**
 * 需求：模拟登录，给三次机会，并提示还有几次机会
 * 分析：A:定义用户名和密码
 *    B：键盘输入用户名和密码 		
 * 	Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

 *    C：比较用户名和密码
 *    三次机会：用循坏改进：for
 * @author admin
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String username = "gu";
		String password = "123";
		
		//根据用户的输入比较用户名和密码
		for(int x = 0;x<3;x++){
			//键盘输入用户名和密码
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码");
			String pwd = sc.nextLine();
			
			
			//比较用户名和密码
			if(name.equals(username)&& pwd.equals(password)){
				System.out.println("登录成功");
				break;
			}else{
				//System.out.println("登录失败");
			}
			if((2-x) == 0){
				System.out.println("账号被锁，请与系统管理员联系");
				
			}else{
				System.out.println("登录失败，你还有"+(2-x)+"次机会");
			}
		}
	}
}
