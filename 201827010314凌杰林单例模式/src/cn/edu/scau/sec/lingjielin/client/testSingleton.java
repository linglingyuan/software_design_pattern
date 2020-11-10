package cn.edu.scau.sec.lingjielin.client;

import cn.edu.scau.sec.lingjielin.singleton.Chairman;

public class testSingleton {
	public static void runSingleton() {
		Chairman chairmanFirst = Chairman.getInstance("毛泽东");
		Chairman chairmanSecond = Chairman.getInstance("习近平");
		System.out.println("你实际得到的主席是" + chairmanFirst.getName());
		System.out.println("你实际得到的主席是" +chairmanSecond.getName());
		if (chairmanFirst == chairmanSecond) {
			System.out.println("两次创建的主席实际是同一个对象");
		}else {
			System.out.println("两次创建的主席不是同一个对象");
		}
	}
}
