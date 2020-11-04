package com.java1234.chap03.sec12;

/**
 * 接口是更高的抽象层次
 * 接口是一种特殊的抽象类
 * 全是抽象方法，由全局常量和抽象方法组成
 * 定义一个接口A
 * @author caofeng
 *
 */
public interface A {

	/**
	 * 全局常量
	 */
	public static final String TITLEA="www.java1234.com";
	
	/**
	 * 定义一个抽象方法   ，在接口中 abstract可以省略，加上也没事
	 * 
	 */
	public void a();
	
}
