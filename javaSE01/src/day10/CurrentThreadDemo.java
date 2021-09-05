package day10;

/**
 * @author rustle
 * @date 2021-09-05 10:32
 * @Description
 * @return
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main=Thread.currentThread();
        System.out.println("运行main方法的线程："+main);

        dosome();
        Thread t=new Thread(){
            public void run(){
                Thread t=Thread.currentThread();
                System.out.println("自定义线程："+t);
                dosome();
            }
        };
        t.start();
    }
    public  static void dosome(){
        Thread t=Thread.currentThread();
        System.out.println("运行dosome方法的线程："+t);
    }
}
