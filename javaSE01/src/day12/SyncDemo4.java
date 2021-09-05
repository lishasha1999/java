package day12;

/**
 * @author rustle
 * @date 2021-09-05 17:35
 * @Description
 * @return
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                foo.methodA();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                foo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo{
    public synchronized void methodA(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行A方法。。。");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行A方法完毕！");
        }catch (Exception e){
        }
    }
    public synchronized void methodB(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行B方法。。。");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行B方法完毕！");
        }catch (Exception e){
        }
    }
}
