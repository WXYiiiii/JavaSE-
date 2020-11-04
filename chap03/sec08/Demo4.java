package com.java1234.chap03.sec08;
/**
 * 字符串的内容不可变性
 * @author Administrator
 *
 */
public class Demo4 {

	public static void main(String[] args) {
		String name="张";
		name+="三";			
		/*改成张三，name不再指向"张"，指向张连接三后的"张三"，
		 * 但是内存池中"三"并没有改变，而是name指向了新的地址
		 */
		
		System.out.println(name);
	}
}
