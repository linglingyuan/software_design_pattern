package cn.edu.scau.sec.lingjielin.adapter;

import java.util.Calendar;

public class Adaptee {
	public void op(Calendar calendar) {
		System.out.println("你好，我是被适配的类，你输入的日期是：" + calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH)+1) +"月" + calendar.get(Calendar.DATE) +"日");
	}
}
