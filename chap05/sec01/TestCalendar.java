package com.java1234.chap05.sec01;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar calerdar=Calendar.getInstance();
		System.out.println(calerdar.get(Calendar.YEAR));
		System.out.println(calerdar.get(Calendar.MONTH)+1);
		
		
		System.out.println("�����ǣ�"+Calendar.YEAR+"��"
		+Calendar.MONTH+1+"��"
		+Calendar.DAY_OF_MONTH+"��"
		+Calendar.HOUR_OF_DAY+"ʱ"
		+Calendar.MINUTE+"��"
		+Calendar.SECOND+"��"
		+Calendar.DAY_OF_WEEK		
				
				);
		
	}
}
	