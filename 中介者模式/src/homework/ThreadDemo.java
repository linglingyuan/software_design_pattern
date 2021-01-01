package homework;

import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread(); // 定义资源对象
        new Thread(mt).start(); // 第一个线程启动
        new Thread(mt).start(); // 第二个线程启动
        new Thread(mt).start(); // 第三个线程启动
    }
}
