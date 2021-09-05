package day10;

/**
 * @author rustle
 * @date 2021-09-05 10:45
 * @Description
 * @return
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //实例化线程任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //创建两个线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁呀");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是查水表的");
        }
    }
}
