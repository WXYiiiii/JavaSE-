package com.java1234.chap06.yun05;

import javax.lang.model.type.PrimitiveType;

public class C2 {
	
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public C2(String a) {
		super();
		this.a = a;
	}
	//��ӡa������
	public  void print() {
		System.out.println("a�������ǣ�"+a.getClass().getSimpleName());
		
	}

}
