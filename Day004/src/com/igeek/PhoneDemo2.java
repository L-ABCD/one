package com.igeek;

public class PhoneDemo2 {

	public static void main(String[] args) {
		// ��������
		Phone p = new Phone();

		// ����Ա������ֵ
		p.brand = "С��5s";
		p.price = 1999;
		p.color = "��ɫ";

		// �����Ա����
		System.out.println(p.brand + "---" + p.price + "---" + p.color);

		// ���ó�Ա����
		p.call("����ϼ");
		p.sendMessage();

		// ��������
		Phone p2 = new Phone();

		// ����Ա������ֵ
		p2.brand = "IPhone7S";
		p2.price = 7999;
		p2.color = "������";

		// �����Ա����
		System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);

		// ���ó�Ա����
		p2.call("������");
		p2.sendMessage();

	}
}
