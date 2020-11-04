package com.java1234.chap03.sec08;
/**
 * String类的常用方法和基本使用
 * @author Administrator
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		String name="张三";
		char ming=name.charAt(1);
		System.out.println(ming);
		
		String str="我是中国人";
		// 遍历字符串
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
	}
}
