package com.java1234.chap03.sec06;

public class Outer {

	private int a=1;
	
	/**
	 * �����ڲ���
	 * ������ڲ�������
	 * �ƻ�����Ļ����ṹ
	 * �����ڲ���
	 * 
	 * @author caofeng
	 *
	 */
	class Inner{					//�ڲ���ֱ�����ⲿ������ԣ�������
		public void show(){
			System.out.println(a);
		}
	}
	
	public void show(){
		Inner inner=new Inner();
		inner.show();
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.show();
	}
}