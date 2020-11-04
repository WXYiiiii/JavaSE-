package com.java1234.chap03.sec06;

public class Outer {

	private int a=1;
	
	/**
	 * 定义内部类
	 * 在类的内部定义类
	 * 破坏了类的基本结构
	 * 慎用内部类
	 * 
	 * @author caofeng
	 *
	 */
	class Inner{					//内部类直接用外部类的属性（变量）
		public void show(){
			System.out.println(a);
		}
	}
	
	public void show(){
		Inner inner=new Inner();
		inner.show();
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.show();
	}
}
