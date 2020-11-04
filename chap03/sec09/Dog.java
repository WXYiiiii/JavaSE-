package com.java1234.chap03.sec09;

/**
 * 定义Dog类，继承自Animal类
 * @author caofeng
 *
 */
public class Dog extends Animal{

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("Pick");//私有属性不能访问，访问的是公有的方法
		dog.setAge(1);
		dog.say();
	}
}
