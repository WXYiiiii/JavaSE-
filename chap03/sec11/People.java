package com.java1234.chap03.sec11;

/**
 * ����һ��������People
 * �����಻��ʵ�������������ɶ��������ĸ��ࡣר�Ÿ�������õ�
 * ���󷽷�ֻ��Ҫ����������Ҫʵ��
 * �������ʵ�ֳ�����
 * @author caofeng
 *
 */
public abstract class People {

	private String name;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("�ҵ������ǣ�"+this.getName());
	}
	
	/**
	 * ����һ�����󷽷� ְҵ
	 * ���������ȥʵ��
	 * 
	 */
	public abstract void profession();
}
