package day11;

/**
 * @author rustle
 * @date 2021-09-05 16:50
 * @Description
 * @return
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread() {
            public void run() {
                System.out.println("林:刚美容完，睡一觉...");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢！干嘛呢！都破了相了~");
                }
                System.out.println("林:醒了!");
            }
        };
        Thread huang = new Thread() {
            public void run() {
                System.out.println("黄:开始砸墙!");
                for (int i = 0; i < 5; i++) {
                    System.out.println("黄：80！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("黄:咣当，搞定!");
                lin.interrupt();//中断lin睡眠阻塞
            }
        };
        lin.start();
        huang.start();
    }
}
