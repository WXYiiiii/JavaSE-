package com.java1234.chap07.yun3;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

import com.java1234.chap07.yun1.Student;

public class TestIterator {
	
	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student("张三",10));
		list.add(new Student("李四",20));
		list.add(new Student("王五",30));
		
		/**
		 * 用Iterator遍历集合
		 */
		Iterator<Student> it=list.iterator();  //返回一个迭代器
		while (it.hasNext()) {
			Student s=it.next();
			System.out.println("姓名"+s.getName()+"年龄:"+s.getAge());
			
		}
	}
	
	
	

			

}
