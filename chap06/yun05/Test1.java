package com.java1234.chap06.yun05;

public class Test1 {
	public static void main(String[] args) {
		//begin test c1;
		C1 c1=new C1(1);
		c1.print();
		int i=c1.getA();
		System.out.println("i="+i);
		//end test c1
		
		//begin test c2;
				C2 c2=new C2("hi");
				c2.print();
				String  s=c2.getA();
				System.out.println("s="+s);
		//end test c2
				
				
		//begin test C12
				
				C12 c12=new C12(1); //����ת��
				c12.print();
				int i12=(Integer)c12.getObject(); //����ת��
				System.out.println(i12);
				
				C12 c122=new C12("���");
				c122.print();
				String s122=(String)c122.getObject();
				System.out.println(s122);
		System.out.println("\n");//  (\n����������������)
			
				
		//end test C12
	

		
				
				
				
		//begin test CC		
		CC<Integer>	cc=new CC<Integer>(1);
		cc.print();
		int icc=cc.getOb();	
		System.out.println("icc="+icc);
		
		CC<String> cc2=new CC<String>("���Ƿ��ͺü򵥰�");
		cc2.print();
		String icc2=cc2.getOb();
		System.out.println("icc2"+icc2);
		
		//end test CC
		
		
		
		
	}

}
