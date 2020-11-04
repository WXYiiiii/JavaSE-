package com.java1234.chap02.sec05;

public class Demo7 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i==4){
				continue;//跳过本次然后继续
			}
			System.out.print("i="+i+" ");
		}
	}
}
