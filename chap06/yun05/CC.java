package com.java1234.chap06.yun05;
/**
 * ���巺����
 * @author Administrator
 *
 * @param <T>
 */
public class CC<T> {
	

	private T ob;
	
	public CC(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	//��ӡT������
	public void print()
{
		System.out.println("T��ʵ��������"+ob.getClass().getName());
	}
}
