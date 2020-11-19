package cn.edu.scau.sec.lingjielin.factoryPattern.factory;

import cn.edu.scau.sec.lingjielin.factory.bean.ConsumerElectronics;

public abstract class ConsumerElectronicsFactory {
	public static ConsumerElectronicsFactory getConsumerElectronicsFactory(String consumerFactoryType) {
		ConsumerElectronicsFactory factory = null;
		switch (consumerFactoryType) {
		case "Pad":
			factory = new padFactory();
			break;
		case "Phone":
			factory = new phoneFactory();
			break;
		case "Watch":
			factory = new watchFactory();
			break;
		}
		return factory;
	}
	public abstract ConsumerElectronics getConsumerElectronics();
}
