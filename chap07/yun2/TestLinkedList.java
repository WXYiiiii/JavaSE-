package com.java1234.chap07.yun2;

import java.util.LinkedList;

public class TestLinkedList {
	//打印
	private static void printLinkedList(LinkedList<String> linkedList) {
		System.out.println("当前的集合元素：");
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("张三");
		linkedList.add("李四");
		linkedList.add("王五");
		linkedList.add("赵六");
		linkedList.add("赵柒");
		
		printLinkedList(linkedList);
		
		//返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。 
		System.out.println(linkedList.indexOf("李四"));
		printLinkedList(linkedList);//列表没有杯改变
		//检索但不删除此列表的第一个元素，如果此列表为空，则返回 null
		System.out.println(linkedList.peekFirst());
		printLinkedList(linkedList);
		//检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null
		System.out.println(linkedList.peekLast());
		printLinkedList(linkedList);
		//检索并删除此列表的第一个元素，如果此列表为空，则返回 null
		System.out.println(linkedList.pollFirst());
		printLinkedList(linkedList);
		
	}
	
}
