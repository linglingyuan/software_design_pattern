package cn.edu.scau.sec.lingjielin.client;

import cn.edu.scau.sec.lingjielin.adapter.ClassAdapter;
import cn.edu.scau.sec.lingjielin.adapter.ObjectAdapter;
import cn.edu.scau.sec.lingjielin.adapter.calendarOp;

public class AdapterClient {
	public static void main(String[] args) {
		new ObjectAdapter(new calendarOp()).op("2020.11.11");
		new ClassAdapter(new calendarOp()).op("2020.12.12");
	}
}
