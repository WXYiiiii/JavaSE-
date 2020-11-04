package com.java1234.chap04.sec02;
/**
 * finally函数
 * @author Administrator
 *
 */
public class Demo2 {

	
	public static void testFinally() {
		String str="123a";
		
		try {
			int a=Integer.parseInt(str);
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("exception");
			return;
		}
		finally {//finally类的代码一定会执行到
			System.out.println("final end");
		}
		System.out.println("end");//加了return就执行不到了
		
	}
	
	
	public static void main(String[] args) {
		testFinally();
	}
}
