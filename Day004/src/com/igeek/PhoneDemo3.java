package com.igeek;

public class PhoneDemo3 {

	public static void main(String[] args) {
		// ��������
		Phone p = new Phone();

		// ����Ա������ֵ
		p.brand = "OPPO";
		p.price = 2999;
		p.color = "��ɫ";

		// �����Ա����
		System.out.println(p.brand + "---" + p.price + "---" + p.color);

		// ��p����ֵ��p2
		Phone p2 = p;

		// ����Ա������ֵ
		p2.brand = "����";
		p2.price = 1999;
		p2.color = "��ɫ";

		// �ٴ������Ա����
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);
		System.out.println(p);
		System.out.println(p2);

	}

}
