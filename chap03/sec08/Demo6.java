package com.java1234.chap03.sec08;
/*
 * indexOF（"d"）
 * indexOF("d"，4)//这是个重载
 */
public class Demo6 {

	public static void main(String[] args) {
		// indexOf方法使用示例
		String str="abcdefghdijklmnopqrstuvwxyz";
		System.out.println("d在字符串str中第一次出现的索引位置："+str.indexOf("d"));
		System.out.println("d在字符串str中第一次出现的索引位置,从索引4开始："+str.indexOf("d",4));
		
	}
}
