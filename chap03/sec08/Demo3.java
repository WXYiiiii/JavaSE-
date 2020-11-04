package com.java1234.chap03.sec08;

public class Demo3 {

	public static void main(String[] args) {
		String name1="张三";//在对象池中创建张三
		String name2="张三";//对象池中已经有张三，直接指向张三，共享空间，
		String name3=new String("张三");//new一个张三
		String name4=new String("张三");//也是自己new一个张三
		
		System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name1==name3:"+(name1==name3));
		System.out.println("name3==name4:"+(name3==name4));
	}
}
