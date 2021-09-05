package day11;

/**
 * @author rustle
 * @date 2021-09-05 17:01
 * @Description
 * @return
 */
public class JoinDemo {
    //做标记：标识图片下载完毕
    private static boolean isFinish = false;

    public static void main(String[] args) {
        /*
        JDK8之前有一个强制要求（JDK8不强制要求，但是若使用不当，编译器仍会编译错误）

        当一个方法的局部内部类中引用了这个方法的其他局部变量时，要求这个变量必须声明为final的。
        (源于JVM内存分配的问题)
         */
        //下载图片的线程
        final Thread download = new Thread() {
            public void run() {
                System.out.println("down:开始下载图片...");
                for (int i = 0; i <= 100; i++) {
                    System.out.println("down:" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("down:下载成功!");
                isFinish = true;
            }
        };
        Thread show = new Thread() {
            public void run() {
                try {
                    System.out.println("show:开始显示文字...");
                    Thread.sleep(1000);
                    System.out.println("show:显示文字完毕!!!");

                    System.out.println("show:等待download下载图片...");
                    download.join();
                    System.out.println("show:download下载图片完毕!!!");
                    if (!isFinish) {
                        throw new RuntimeException("图片加载失败");
                    }
                    System.out.println("show:显示图片完毕!!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        download.start();
        show.start();
    }
}
