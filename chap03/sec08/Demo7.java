package com.java1234.chap03.sec08;
/**
 * substring
 * @author Administrator
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		// subString��ʽʹ��
		String str="������ÿһ��,������";
		String newStr=str.substring(1);//�ӵ�һ����ʼ��ȡ
		
		String newStr2=str.substring(1, 6);//��һ��ʼ��ȡ����������
		System.out.println(str);//�ַ���������
		System.out.println(newStr);
		System.out.println(newStr2);
	}
}
