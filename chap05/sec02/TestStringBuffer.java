package com.java1234.chap05.sec02;

public class TestStringBuffer {//String拼接，始终指向的时同一个对象

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("123");
		sb.append("abc");
		System.out.println(sb);
	}
}
