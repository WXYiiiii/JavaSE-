package com.java1234.chap03.sec08;
/*
 * indexOF��"d"��
 * indexOF("d"��4)//���Ǹ�����
 */
public class Demo6 {

	public static void main(String[] args) {
		// indexOf����ʹ��ʾ��
		String str="abcdefghdijklmnopqrstuvwxyz";
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã�"+str.indexOf("d"));
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ��,������4��ʼ��"+str.indexOf("d",4));
		
	}
}