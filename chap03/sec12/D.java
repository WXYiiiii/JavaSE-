package com.java1234.chap03.sec12;

/**
 * 定义接口D，继承A,B接口
 * 接口可以实现多继承，类不行
 * （封装继承多态）
 * @author caofeng
 *
 */
public interface D extends A,B{

	/**
	 * 定义一个抽象方法    abstract可以省略
	 */
	public void d();
}
