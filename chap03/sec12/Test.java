package com.java1234.chap03.sec12;

public class Test extends C implements A,B {
	//多个接口加逗号，接口为了维护的方便。扩展

	@Override
	public void a() {
		System.out.println("a方法");
	}
	
	@Override
	public void b() {
		System.out.println("b方法");
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.a();
		t.b();
		t.c();
		System.out.println(Test.TITLEA);
		System.out.println(Test.TITLEB);
	}
}
