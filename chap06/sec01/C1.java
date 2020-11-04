package com.java1234.chap06.sec01;
/**
 * 泛型引入
 * 限制泛型
 * 通配符泛型
 * 泛型方法
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
	 * 打印a的类型
	 */
	public void print(){
		System.out.println("a的类型是："+a.getClass().getName());
	}
	
}
