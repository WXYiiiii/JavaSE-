package com.java1234.chap04.sec02;
/**
 * 异常
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		String str="123a";
		try{
			int a=Integer.parseInt(str);	//可能有异常		
		}catch(NullPointerException e){
			e.printStackTrace();//捕获
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("aa");
	}
}
