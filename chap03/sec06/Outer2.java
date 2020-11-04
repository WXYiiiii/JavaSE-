package com.java1234.chap03.sec06;

public class Outer2 {

	private int a=1;
	
	/**
	 * 定义内部类
	 * @author caofeng
	 *
	 */
	class Inner{
		public void show(){
			System.out.println(a);
		}
	}
	
	//实例化内部类
	public static void main(String[] args) {
		Outer2 outer2=new Outer2();  // 先实例化外部类对象
		Outer2.Inner inner=outer2.new Inner();  // 实例化内部类对象（语法规则）
		inner.show();
	}
}
