package com.java1234.chap03.sec08;
/**
 * 实例化String类
 * 
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		// 实例化String的方式一，直接赋值
		String name1="张三";
		System.out.println("name1="+name1);
		
		// 实例化String的方式二，普通类的new
		String name2=new String("李四");
		System.out.println("name2="+name2);
	}
}
