package cn.edu.scau.sec.lingjielin.abstractFactory.bean;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.Pad;
import cn.edu.scau.sec.lingjielin.abstractFactory.interfaceClass.Apple;

public class iPad extends Pad implements Apple{

	@Override
	public void recreation() {
		// TODO Auto-generated method stub
		System.out.println(name+productName);
	}

}
