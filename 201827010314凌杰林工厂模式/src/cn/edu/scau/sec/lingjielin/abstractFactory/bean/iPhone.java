package cn.edu.scau.sec.lingjielin.abstractFactory.bean;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.Phone;
import cn.edu.scau.sec.lingjielin.abstractFactory.interfaceClass.Apple;

public class iPhone extends Phone implements Apple{

	@Override
	public void recreation() {
		// TODO Auto-generated method stub
		System.out.println(name+productName);
	}

}
