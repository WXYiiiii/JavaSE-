package com.java1234.chap07.yun1;

import java.util.LinkedList;
/**
 * ����
 * @author Administrator
 *
 */
public class Demo {
	
	
	public static void main(String[] args) {
		//�����鶨������ѧ��
		Student student[]=new Student[3];
		Student s1=new Student("����", 1);
		Student s2=new Student("minm", 1);
		Student s3=new Student("����2", 2);
		
		//����
		LinkedList<Student> list=new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//�������ϣ�����ȥ�����ݽṹ��
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			
			System.out.println(s.getName()+":"+s.getAge());
		}
	
	}

}
