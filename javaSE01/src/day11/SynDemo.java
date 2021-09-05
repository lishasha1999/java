package day11;

/**
 * @author rustle
 * @date 2021-09-05 16:34
 * @Description
 * @return
 */
public class SynDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1=new Thread(){
          @Override
          public void run(){
              while (true){
                  int bean=table.getBeans();
                  Thread.yield();
                  System.out.println(getName()+":"+bean);
              }
          }
        };
        Thread t2=new Thread(){
            @Override
            public void run(){
                while (true){
                    int bean=table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        t1.start();
        t2.start();
    }

    static class Table {
        private int beans = 20;

        public synchronized int getBeans() {
            if (beans == 0) {
                throw new RuntimeException("桌上没有豆子了！");
            }
            Thread.yield();
            return beans--;
        }
    }
}
