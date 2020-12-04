package cn.edu.scau.sec.lingjielin.adapter;

import java.util.Calendar;

public class ClassAdapter extends Adaptee implements Target{
	private calendarOp calendarOpDemo;
	public ClassAdapter(calendarOp calendarOpDemo) {
		this.calendarOpDemo = calendarOpDemo;
	}
	@Override
	public void op(String calendarString) {
		// TODO Auto-generated method stub
		Calendar calendar = calendarOpDemo.opCalender(calendarString);
		System.out.println("类适配器：");
		op(calendar);
	}
}
