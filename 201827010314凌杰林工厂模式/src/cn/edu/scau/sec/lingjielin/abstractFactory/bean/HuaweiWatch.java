package cn.edu.scau.sec.lingjielin.abstractFactory.bean;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.Watch;
import cn.edu.scau.sec.lingjielin.abstractFactory.interfaceClass.Huawei;

public class HuaweiWatch extends Watch implements Huawei{

	@Override
	public void recreation() {
		// TODO Auto-generated method stub
		System.out.println(name+productName);
	}

}
