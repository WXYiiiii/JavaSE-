package com.java1234.chap03.sec18;
/**
 * 饿汉式，提前写好了
 * 懒汉式，第一次调用的时候实例化
 * @author Administrator
 *
 */
public class TestSingleton {

	public static void main(String[] args) {
	  //	Singleton1 single=new Singleton1();
		
		Singleton1 single1=Singleton1.getInstance();
		Singleton1 single2=Singleton1.getInstance();
		System.out.println("饿汉式 :"+(single1==single2));
		
		TestSingleton t=new TestSingleton();
		TestSingleton t2=new TestSingleton();
		System.out.println(t==t2);
		
		Singleton2 single3=Singleton2.getInstance();
		Singleton2 single4=Singleton2.getInstance();
		System.out.println("懒汉式 :"+(single3==single4));
	}
}
