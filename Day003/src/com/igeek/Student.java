package com.igeek;

public class Student {
	
	private String name;
	int age = 12;
	
	public Student(){
		super();
		System.out.println("student");
	}
	
	public Student (String name,int age){
		//如果有局部变量名和成员变量名相同，在局部使用的时候，采用的是就近原则
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
