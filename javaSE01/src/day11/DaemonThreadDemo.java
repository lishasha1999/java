package day11;

/**
 * @author rustle
 * @date 2021-09-05 16:54
 * @Description
 * @return
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread() {
            @Override
            public void run() {
                System.out.println("rose:" + Thread.currentThread());
                for (int i = 0; i < 5; i++) {
                    System.out.println("rose: let me go!");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("rose:啊啊啊啊...噗通....");
            }
        };

        Thread jack = new Thread() {
            public void run() {
                System.out.println("jack:" + Thread.currentThread());
                while (true) {
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        jack.setDaemon(true);
        jack.start();

    }
}
