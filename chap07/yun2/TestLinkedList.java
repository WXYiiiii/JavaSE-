package com.java1234.chap07.yun2;

import java.util.LinkedList;

public class TestLinkedList {
	//��ӡ
	private static void printLinkedList(LinkedList<String> linkedList) {
		System.out.println("��ǰ�ļ���Ԫ�أ�");
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("����");
		linkedList.add("����");
		linkedList.add("����");
		linkedList.add("����");
		linkedList.add("����");
		
		printLinkedList(linkedList);
		
		//���ش��б���ָ��Ԫ�صĵ�һ�γ��ֵ�������������б�����Ԫ�أ��򷵻�-1�� 
		System.out.println(linkedList.indexOf("����"));
		printLinkedList(linkedList);//�б�û�б��ı�
		//��������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		System.out.println(linkedList.peekFirst());
		printLinkedList(linkedList);
		//��������ɾ�����б�����һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		System.out.println(linkedList.peekLast());
		printLinkedList(linkedList);
		//������ɾ�����б�ĵ�һ��Ԫ�أ�������б�Ϊ�գ��򷵻� null
		System.out.println(linkedList.pollFirst());
		printLinkedList(linkedList);
		
	}
	
}
