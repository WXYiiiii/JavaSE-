package com.java1234.chap03.sec10;

public class Test extends People{

	@SuppressWarnings("unused")
	private final int a=1;
	public void action(){
		//a=2;
		System.out.println("��һ�����û�����");
	}
	
	public static void main(String[] args) {
		System.out.println(Common.SOMETILE);
	}
}
