package com.igeek;

import java.util.Scanner;

/*
 * 录入学生成绩，并且判断学生属于哪个类别
 * 
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 * 
 * 
 * 分析：
 * 		A:键盘录入学生考试成绩
 * 			三步骤
 * 		B:通过简单的分析，我们决定采用if语句格式3来实现
 * 
 * 程序一定要考虑周全了。
 * 		安全数据
 * 		边界数据
 * 		错误数据
 * 
 */

public class Test008 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int score = scanner.nextInt();
		
		if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score <90){
			System.out.println("良好");
		}else if(score>=70 && score <80){
			System.out.println("中等");
        }else
			System.out.println("不及格");
        }
}
