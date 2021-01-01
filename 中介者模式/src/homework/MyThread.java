package homework;

import java.util.concurrent.Callable;

class MyThread implements Runnable { // 线程的主体类
    private int ticket = 5; // 定义总票数
    @Override
    public void run() { // 线程的主体方法
        for (int x = 0; x < 100; x++) { // 进行100次的卖票处理
            if (this.ticket > 0) { // 有剩余票
                System.out.println("卖票，ticket = " + this.ticket--);
            }
        }
    }
}



