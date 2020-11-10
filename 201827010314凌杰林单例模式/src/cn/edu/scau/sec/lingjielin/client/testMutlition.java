package cn.edu.scau.sec.lingjielin.client;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import cn.edu.scau.sec.lingjielin.singleton.Marshall;

public class testMutlition {
	public static void runMutlition() {
	    final String[] NAME = {"朱德","彭德怀","林彪","刘伯承","贺龙","陈毅","罗荣桓","徐向前","聂荣臻","叶剑英"};
		for (String item : NAME) {
			Marshall.getInstance(item);
			System.out.print("元帅名字:");
			for (Marshall item1 : Marshall.getMarshallSet()) {			
			System.out.print(" " + item1.getName());
			}
			System.out.println();
		}	
		
	}
}
