package com.igeek;

import java.util.ArrayList;

/**
 * ����һ���ַ������飺{�������ᡱ,����Զ�š�,�����޼ɡ�,������ͤ��,���Ŵ�ɽ��,��Ī���ȡ�}��
 * �������е�Ԫ����ӵ������У������������ŵ���Ա��ӡ������̨��
 * 
 * @author admin
 *
 */
public class Demo17 {

	public static void main(String[] args) {
		//����һ���ַ���
		String[] strs = {"������","��Զ��","���޼�","����ͤ","�Ŵ�ɽ","Ī����"};
		//����һ������
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0 ;i<strs.length;i++){
			arr.add(strs[i]);
		}
		//�������
		for(String name :arr){
			System.out.println(name);
		}
	}
}
