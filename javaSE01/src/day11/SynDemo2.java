package day11;

/**
 * @author rustle
 * @date 2021-09-05 16:41
 * @Description
 * @return
 */
public class SynDemo2 {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Shop shop1=new Shop();
        Thread t1=new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                shop.buy();
            }
        };

        t1.start();
        t2.start();
    }

    static class Shop {
        public void buy() {
            Thread t = Thread.currentThread();
            try {
                System.out.println(t.getName() + "正在挑衣服...");
                Thread.sleep(5000);

                synchronized ("abc") {
                    System.out.println(t.getName() + "正在试衣服...");
                    Thread.sleep(5000);
                }

                System.out.println(t.getName() + "正在结账离开！！！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
