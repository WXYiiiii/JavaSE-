package com.java1234.chap06.sec01;
/**
 * ��������
 * ���Ʒ���
 * ͨ�������
 * ���ͷ���
 * 
 * @author Administrator
 *
 */
public class C1 {

	private Integer a;

	
	
	public C1(Integer a) {
		super();
		this.a = a;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	
	/**
	 * ��ӡa������
	 */
	public void print(){
		System.out.println("a�������ǣ�"+a.getClass().getName());
	}
	
}
