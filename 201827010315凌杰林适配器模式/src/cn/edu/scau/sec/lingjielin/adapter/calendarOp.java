package cn.edu.scau.sec.lingjielin.adapter;

import java.util.Calendar;

public class calendarOp {
	
	/*
	 * 该类的函数是负责把输入的表示年月日的字符串转化为日期对象
	 */
	public Calendar opCalender(String calendarString) {
		Calendar calendar = Calendar.getInstance();
		String[] calendarStrings = calendarString.split("\\.");
		int year = Integer.parseInt(calendarStrings[0]);
		int month = Integer.parseInt(calendarStrings[1]) - 1;
		int day = Integer.parseInt(calendarStrings[2]);
		calendar.set(year,month,day);
		return calendar;
	}
}
