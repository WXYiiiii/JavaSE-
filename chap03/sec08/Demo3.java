package com.java1234.chap03.sec08;

public class Demo3 {

	public static void main(String[] args) {
		String name1="����";//�ڶ�����д�������
		String name2="����";//��������Ѿ���������ֱ��ָ������������ռ䣬
		String name3=new String("����");//newһ������
		String name4=new String("����");//Ҳ���Լ�newһ������
		
		System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name1==name3:"+(name1==name3));
		System.out.println("name3==name4:"+(name3==name4));
	}
}
