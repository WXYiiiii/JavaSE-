package com.java1234.chap06.yun06;
/**
 *  限制类型
 * @author Administrator
 *
 * @param <T>
 */
public class Demo <T extends Animal>{ //限制为Anmial类
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
		System.out.println("T的类型是"+ob.getClass().getName());
	}
}
