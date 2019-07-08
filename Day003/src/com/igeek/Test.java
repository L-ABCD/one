package com.igeek;

public class Test {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		
		Student student2 = new Student("zs", 18);
		System.out.println(student2);
		//The field Student.name is not visible
		System.out.println(student2.age);
		student2.eat();
	}
}
