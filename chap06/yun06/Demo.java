package com.java1234.chap06.yun06;
/**
 *  ��������
 * @author Administrator
 *
 * @param <T>
 */
public class Demo <T extends Animal>{ //����ΪAnmial��
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public Demo(T ob) {
		super();
		this.ob = ob;
	}
	
	public void print() {
		System.out.println("T��������"+ob.getClass().getName());
	}
}
