package cn.edu.scau.sec.lingjielin.simpleFactoryMethod.factory;

import cn.edu.scau.sec.lingjielin.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.lingjielin.factory.bean.Pad;
import cn.edu.scau.sec.lingjielin.factory.bean.Phone;
import cn.edu.scau.sec.lingjielin.factory.bean.Watch;

public class ConsumerElectronicsFactory {
	public static ConsumerElectronics getElectronic(String electronicType) {
		ConsumerElectronics electronics = null;
		switch(electronicType) {
		case "Pad": 
			 electronics = new Pad();
			break;
		case "Phone":
			 electronics = new Phone();
			 break;
		case "Watch":
			 electronics = new Watch();
			 break; 
		}		
		//以超类ConsumerElectronics返回给用户，所以不必关心返回的具体的对象类型
		return electronics;
	}
}
