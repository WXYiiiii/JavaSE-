package com.java1234.chap03.sec08;
/**
 * String��ĳ��÷����ͻ���ʹ��
 * @author Administrator
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		String name="����";
		char ming=name.charAt(1);
		System.out.println(ming);
		
		String str="�����й���";
		// �����ַ���
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
	}
}
