package com.java1234.chap03.sec08;
/*
 * 
 * toUpperCase();
 * toLOwerCase();
 */
public class Demo8 {

	public static void main(String[] args) {
		String str="I'm a boy!";
		String upStr=str.toUpperCase(); // ת���ɴ�д
		System.out.println("str="+str);
		System.out.println("upStr="+upStr);
		
		String lowerStr=upStr.toLowerCase(); // ת����Сд
		System.out.println("lowerStr="+lowerStr); 
	}
}