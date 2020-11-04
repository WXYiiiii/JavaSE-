package com.java1234.chap05.sec02;

public class TestString {//String本身的值不会变

	public static void main(String[] args) {
		String str="123";
		str+="abc";//重新创建新的123abc对象，并重新指向它
		System.out.println(str);
	}
}
