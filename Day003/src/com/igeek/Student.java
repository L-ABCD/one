package com.igeek;

public class Student {
	
	private String name;
	int age = 12;
	
	public Student(){
		super();
		System.out.println("student");
	}
	
	public Student (String name,int age){
		//����оֲ��������ͳ�Ա��������ͬ���ھֲ�ʹ�õ�ʱ�򣬲��õ��Ǿͽ�ԭ��
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Student eat");
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.eat();
		
	}

}
