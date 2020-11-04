package com.java1234.chap02.sec05;

public class Demo8 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1){
					return; //i==1时结束，后面的也不不执行了
				}
				System.out.print("i="+i+" "+"j="+j+" ");
			}
			System.out.println();
		}
		System.out.println("执行到这里了！");
	}
}
