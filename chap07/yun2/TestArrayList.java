package com.java1234.chap07.yun2;

import java.util.ArrayList;

public class TestArrayList {
	private static void printArrayList (ArrayList<String> arrayList) {
		System.out.println("��ǰ�ļ���Ԫ�أ�");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i)+" ");
		}
		System.out.println();
			
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
	//���Ԫ��
		arrayList.add("���");
		arrayList.add("ѧ��");
	printArrayList(arrayList);
	
	//��ָ��Ԫ�ز�����б��ָ��λ��
	arrayList.add(1,"С���");
	printArrayList(arrayList);
	
	//��ָ����Ԫ���滻���б���ָ��λ�õ�Ԫ��
	arrayList.set(2,"Сѧ��");
	printArrayList(arrayList);
	
	//ɾ�����б���ָ��λ�õ�Ԫ�ء� 
	arrayList.remove(0);
	printArrayList(arrayList);
	
	
	}
	
	

}
