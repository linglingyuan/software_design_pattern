package cn.edu.scau.sec.lingjielin.factoryPattern.factory;

import cn.edu.scau.sec.lingjielin.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.lingjielin.factory.bean.Pad;

public class padFactory extends ConsumerElectronicsFactory{

	public ConsumerElectronics getConsumerElectronics() {
		return new Pad();
	}
}
