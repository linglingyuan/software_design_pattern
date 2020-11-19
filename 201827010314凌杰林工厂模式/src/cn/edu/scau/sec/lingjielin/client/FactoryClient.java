package cn.edu.scau.sec.lingjielin.client;

import cn.edu.scau.sec.lingjielin.abstractFactory.AbstractFactory;
import cn.edu.scau.sec.lingjielin.factory.bean.ConsumerElectronics;
import cn.edu.scau.sec.lingjielin.simpleFactoryMethod.factory.ConsumerElectronicsFactory;

public class FactoryClient {
	public static void main(String[] args) {
		System.out.println("--简单工厂方法抽象：");
		testSimpleFactoryMethod();
		System.out.println();
		System.out.println("--工厂模式：");
		testFactoryMethod();
		System.out.println();
		System.out.println("--抽象工厂模式：");
		testAbstractFactory();
	}	
 	
	public static void testSimpleFactoryMethod() {
		//生产平板，手机，手表
		ConsumerElectronics pad = ConsumerElectronicsFactory.getElectronic("Pad");
		ConsumerElectronics phone = ConsumerElectronicsFactory.getElectronic("Phone");
		ConsumerElectronics watch = ConsumerElectronicsFactory.getElectronic("Watch");
		pad.recreation();
		phone.recreation();
		watch.recreation();
	}
	
	public static void testFactoryMethod() {
		 String[] electronicName = {"Pad","Phone","Watch"};
		 //生产平板，手机，手表
		 for (String item : electronicName) {
			 //得到电子产品的工厂
			 cn.edu.scau.sec.lingjielin.factoryPattern.factory.ConsumerElectronicsFactory factory = cn.edu.scau.sec.lingjielin.factoryPattern.factory.ConsumerElectronicsFactory.getConsumerElectronicsFactory(item);
		     ConsumerElectronics electronic = factory.getConsumerElectronics();
		     electronic.recreation();
		 }		
	}
	
	 public static void testAbstractFactory() {
		 String[] name = {"Apple","Huawei","Mi"};
		 for (String item : name) {
			  //得到一个品牌的工厂
			  AbstractFactory factory = AbstractFactory.getFactory(item);
			  //生产某一品牌平板
			  factory.getPad().recreation();
			  //生产某一品牌手机
		      factory.getPhone().recreation();
		      //生产某一品牌手表
		      factory.getWatch().recreation();
		 }
	 }
}
