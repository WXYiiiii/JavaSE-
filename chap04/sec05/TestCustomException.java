package com.java1234.chap04.sec05;

import javax.print.attribute.standard.MediaName;

public class TestCustomException {

	public static void test() throws CustomException {
		throw new CustomException("�Զ����쳣");
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (CustomException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
