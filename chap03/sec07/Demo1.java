package com.java1234.chap03.sec07;

public class Demo1 {


	public static void main(String[] args) {
		int a=1;
		/**
		 * 1.普通代码块（意义不是很大）
		 * 构造代码块
		 * 静态代码块
		 */
		{
			a=2;
			System.out.println("普通代码块");
		}
		System.out.println("a="+a);
	}
	
}
