package cn.edu.scau.sec.lingjielin.factoryPattern.factory;

import cn.edu.scau.sec.lingjielin.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.lingjielin.factory.bean.Watch;

public class watchFactory extends ConsumerElectronicsFactory{
	public ConsumerElectronics getConsumerElectronics() {
		return new Watch();
	}
}
