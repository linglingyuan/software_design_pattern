package cn.edu.scau.sec.lingjielin.adapter;

import java.util.Calendar;

public class ObjectAdapter implements Target{
	private calendarOp calendarOpDemo;
	public ObjectAdapter(calendarOp calendarOpDemo) {
		this.calendarOpDemo = calendarOpDemo;
	}
	@Override
	public void op(String calendarString) {
		// TODO Auto-generated method stub
		Calendar calandar = calendarOpDemo.opCalender(calendarString);
		Adaptee adaptee = new Adaptee();
		System.out.println("对象适配器：");
		adaptee.op(calandar);
	}
}
