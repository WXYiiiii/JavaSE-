package com.java1234.chap07.yun1;

import java.util.LinkedList;
/**
 * 链表
 * @author Administrator
 *
 */
public class Demo {
	
	
	public static void main(String[] args) {
		//用数组定义三个学生
		Student student[]=new Student[3];
		Student s1=new Student("张三", 1);
		Student s2=new Student("minm", 1);
		Student s3=new Student("张三2", 2);
		
		//链表
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//遍历集合，（回去看数据结构）
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			
			System.out.println(s.getName()+":"+s.getAge());
		}
	
	}

}
