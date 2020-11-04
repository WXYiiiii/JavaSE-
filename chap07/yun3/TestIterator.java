package com.java1234.chap07.yun3;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

import com.java1234.chap07.yun1.Student;

public class TestIterator {
	
	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(new Student("����",10));
		list.add(new Student("����",20));
		list.add(new Student("����",30));
		
		/**
		 * ��Iterator��������
		 */
		Iterator<Student> it=list.iterator();  //����һ��������
		while (it.hasNext()) {
			Student s=it.next();
			System.out.println("����"+s.getName()+"����:"+s.getAge());
			
		}
	}
	
	
	

			

}
