package cn.edu.scau.sec.lingjielin.abstractFactory.bean;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.Watch;
import cn.edu.scau.sec.lingjielin.abstractFactory.interfaceClass.Apple;

public class iWatch extends Watch implements Apple{

	@Override
	public void recreation() {
		// TODO Auto-generated method stub
		System.out.println(name+productName);
	}

}
