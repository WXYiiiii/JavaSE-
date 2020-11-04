package com.java1234.chap03.sec08;
/**
 * substring
 * @author Administrator
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		// subString方式使用
		String str="不开心每一天,不可能";
		String newStr=str.substring(1);//从第一个开始截取
		
		String newStr2=str.substring(1, 6);//从一开始截取，到六结束
		System.out.println(str);//字符串不变性
		System.out.println(newStr);
		System.out.println(newStr2);
	}
}
