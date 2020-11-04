package com.java1234.chap04.sec03;

public class Demo1 {

	/**
	 * throws当前不处理异常，把异常向外抛
	 * 把异常向外面抛
	 * @throws NumberFormatException
	 */
	
	public static void testThrows()throws NumberFormatException{
		String str="123a";
		int a=Integer.parseInt(str);
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		
		try {
			testThrows();
			System.out.println("here");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("在这里处理异常");
			e.printStackTrace();
		}
		System.out.println("i am here");
	}
	
}
