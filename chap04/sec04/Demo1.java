package com.java1234.chap04.sec04;

import javax.management.RuntimeErrorException;

public class Demo1 {

	/**
	 * RuntimeException���Ҳ��try����catch����
	 * ����ʱ�쳣������ʱ����飬���Բ�ʹ��try..catch����
	 * @throws RuntimeException
	 */
	public static void testRuntimeException() throws RuntimeException {
		throw new RuntimeException( "����ʱ�쳣");
	}
	
	public static void testException() throws Exception {
		throw new Exception("Exception�쳣");
	}
	
	public static void main(String[] args) {
		
		try {
			testRuntimeException();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			testException();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
}
