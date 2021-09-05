package day10;

/**
 * @author rustle
 * @date 2021-09-05 10:38
 * @Description
 * @return
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1=new MyThread1();
        Thread t2=new MyThread2();
        t1.start();
        t2.start();
    }

    static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("你是谁呀");
            }
        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("我是查水表的");
            }
        }
    }
}
