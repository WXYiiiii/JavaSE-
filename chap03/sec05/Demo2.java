package com.java1234.chap03.sec05;
//包的定义，

import com.java1234.chap03.sec04.People;//导入所需要的包

public class Demo2 {

	public static void main(String[] args) {
		// 不同包，则需要导入相关类
		People people=new People();
	
		// 在同一个包，则不需要导入相关类
		Demo1 demo1=new Demo1();
	}
}
