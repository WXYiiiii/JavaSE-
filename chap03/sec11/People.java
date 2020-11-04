package com.java1234.chap03.sec11;

/**
 * 定义一个抽象类People
 * 抽象类不能实例化，不能生成对象，真正的父类。专门给子类调用的
 * 抽象方法只需要声明，不需要实现
 * 子类必须实现抽象类
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
		System.out.println("我的姓名是："+this.getName());
	}
	
	/**
	 * 定义一个抽象方法 职业
	 * 让子类具体去实现
	 * 
	 */
	public abstract void profession();
}
