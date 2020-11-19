package cn.edu.scau.sec.lingjielin.abstractFactory;

import cn.edu.scau.sec.lingjielin.abstractFactory.abstractClass.ConsumerElectronics;

public abstract class AbstractFactory {
	
	public static AbstractFactory getFactory(String factoryName) {
		AbstractFactory factory = null;
		switch(factoryName) {
			case "Apple":
				factory = new AppleFactory(); 
				break;
			case "Huawei":
				factory = new HuaweiFactory(); 
				break;
			case "Mi":
				factory = new MiFactory(); 
				break;
		}
		return factory;
	}
	
	public abstract ConsumerElectronics getPad();
	public abstract ConsumerElectronics getPhone();
	public abstract ConsumerElectronics getWatch();
}
