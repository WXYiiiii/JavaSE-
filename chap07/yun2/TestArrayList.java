package com.java1234.chap07.yun2;

import java.util.ArrayList;

public class TestArrayList {
	private static void printArrayList (ArrayList<String> arrayList) {
		System.out.println("当前的集合元素：");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i)+" ");
		}
		System.out.println();
			
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
	//添加元素
		arrayList.add("雨杰");
		arrayList.add("学云");
	printArrayList(arrayList);
	
	//将指定元素插入此列表的指定位置
	arrayList.add(1,"小雨杰");
	printArrayList(arrayList);
	
	//用指定的元素替换此列表中指定位置的元素
	arrayList.set(2,"小学云");
	printArrayList(arrayList);
	
	//删除该列表中指定位置的元素。 
	arrayList.remove(0);
	printArrayList(arrayList);
	
	
	}
	
	

}
