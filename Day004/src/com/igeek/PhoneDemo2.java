package com.igeek;

public class PhoneDemo2 {

	public static void main(String[] args) {
		// 创建对象
		Phone p = new Phone();

		// 给成员变量赋值
		p.brand = "小米5s";
		p.price = 1999;
		p.color = "银色";

		// 输出成员变量
		System.out.println(p.brand + "---" + p.price + "---" + p.color);

		// 调用成员方法
		p.call("林青霞");
		p.sendMessage();

		// 创建对象
		Phone p2 = new Phone();

		// 给成员变量赋值
		p2.brand = "IPhone7S";
		p2.price = 7999;
		p2.color = "土豪金";

		// 输出成员变量
		System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);

		// 调用成员方法
		p2.call("张曼玉");
		p2.sendMessage();

	}
}
