package com.igeek;

/**
 * ������Ĳ���
 */
import java.util.ArrayList;

public class Demo15 {

	public static void main(String[] args) {
		//����һ������
		ArrayList<String> arrayList = new ArrayList();
		//���Ԫ��
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add(0,"hi");
		arrayList.add("nihao");
		//��˳����������ֵ
		System.out.println(arrayList);
		//����Ԫ������
		System.out.println(arrayList.size());
		//��ȡ
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
//		System.out.println(arrayList.get(3));
//		//ɾ��
//		String ele = arrayList.remove(3);
//		System.out.println(ele);
//		System.out.println(arrayList);
//		System.out.println(arrayList.remove("world"));
//		System.out.println(arrayList);
		//�޸�
		arrayList.set(2, "android");
		System.out.println(arrayList);

	}
}
