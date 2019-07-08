package com.igeek;

public class PhoneDemo3 {

	public static void main(String[] args) {
		// 创建对象
		Phone p = new Phone();

		// 给成员变量赋值
		p.brand = "OPPO";
		p.price = 2999;
		p.color = "白色";

		// 输出成员变量
		System.out.println(p.brand + "---" + p.price + "---" + p.color);

		// 把p对象赋值给p2
		Phone p2 = p;

		// 给成员变量赋值
		p2.brand = "魅族";
		p2.price = 1999;
		p2.color = "蓝色";

		// 再次输出成员变量
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);
		System.out.println(p);
		System.out.println(p2);

	}

}
