package com.java1234.chap04.sec03;

public class Demo2 {

	public static void testThrow(int a)throws Exception {
		if(a==1)
		{
			//ֱ���׳�һ���쳣��
			throw new Exception("���쳣");
		}
		System.out.println(a);
		}
	
	public static void main(String[] args) {
		try {
			testThrow(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			testThrow(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
