package com.java1234.chap04.sec02;
/**
 * finally����
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
		finally {//finally��Ĵ���һ����ִ�е�
			System.out.println("final end");
		}
		System.out.println("end");//����return��ִ�в�����
		
	}
	
	
	public static void main(String[] args) {
		testFinally();
	}
}
