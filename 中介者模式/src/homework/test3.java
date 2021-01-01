package homework;

public class test3 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //clerk
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {
                        if (c.product_num == 4) {
                            System.out.println("商品库存数为4！");
                            while (c.product_num > 0) {
                                c.product_num--;
                                System.out.println("开始消费，库存"+c.product_num);
                            }
                            System.out.println("消费完成，结束消费");
                            c.notify();//唤醒生产
                        } else {
                            try {
                                c.wait();//消费者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            }
        }, "消费者").start();

        //productor
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {
                        if (c.product_num == 0) {
                            System.out.println("商品库存数为0！");
                            while (c.product_num < 4) {
                                c.product_num++;
                                System.out.println("开始生产"+c.product_num);
                            }
                            System.out.println("生产完成，结束生产");
                            c.notify();//唤醒消费
                        } else {
                            try {
                                c.wait();//生产者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            }
        }, "生产者").start();
    }
}

class Clerk{
    public static int product_num = 4;//商品库存
}

