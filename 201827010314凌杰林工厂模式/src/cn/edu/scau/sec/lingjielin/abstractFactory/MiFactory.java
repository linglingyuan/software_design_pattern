package cn.edu.scau.sec.lingjielin.abstractFactory;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.ConsumerElectronics;
import cn.edu.scau.sec.lingjielin.abstractFactory.bean.*;

public class MiFactory extends AbstractFactory{

	@Override
	public ConsumerElectronics getPad() {
		// TODO Auto-generated method stub
		return new HuaweiPad();
	}

	@Override
	public ConsumerElectronics getPhone() {
		// TODO Auto-generated method stub
		return new HuaweiPhone();
	}

	@Override
	public ConsumerElectronics getWatch() {
		// TODO Auto-generated method stub
		return new HuaweiWatch();
	}

}
