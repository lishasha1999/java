package day12;

/**
 * @author rustle
 * @date 2021-09-05 17:31
 * @Description
 * @return
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
    static class Boo{
        public static void dosome(){
            synchronized (Boo.class){
                try {
                    Thread t=Thread.currentThread();
                    System.out.println(t.getName()+"：正在执行dosome方法。。");
                    Thread.sleep(5000);
                    System.out.println(t.getName()+":执行dosome方法完毕！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
