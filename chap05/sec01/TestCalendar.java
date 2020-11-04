package com.java1234.chap05.sec01;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar calerdar=Calendar.getInstance();
		System.out.println(calerdar.get(Calendar.YEAR));
		System.out.println(calerdar.get(Calendar.MONTH)+1);
		
		
		System.out.println("现在是："+Calendar.YEAR+"年"
		+Calendar.MONTH+1+"月"
		+Calendar.DAY_OF_MONTH+"日"
		+Calendar.HOUR_OF_DAY+"时"
		+Calendar.MINUTE+"分"
		+Calendar.SECOND+"秒"
		+Calendar.DAY_OF_WEEK		
				
				);
		
	}
}
	