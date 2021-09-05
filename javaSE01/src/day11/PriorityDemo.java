package day11;

/**
 * @author rustle
 * @date 2021-09-05 17:02
 * @Description
 * @return
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };
        Thread min = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread norm = new Thread(){
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("norm");
                }
            }
        };
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }
}
