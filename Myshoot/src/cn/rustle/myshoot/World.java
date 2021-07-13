package cn.rustle.myshoot;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.StreamSupport;

/**
 * 整个游戏窗口
 *
 * @author Administrator
 */
public class World extends JPanel {
    /**
     * 如下为窗口中所显示的对象
     */
    private Sky s;
    private Hero h;
//    private Airplane[] as;
//    private Bigplane[] bas;
//    private Bee[] bs;

    private Bullet[] bts;
    private FlyingObject[] planes;
    private int index = 0;

    /**
     * 构造方法
     */
    public World() {
        s = new Sky();
        h = new Hero(150, 400);
        planes = new FlyingObject[6];
        planes[0] = new Airplane();
        planes[1] = new Airplane();
        planes[2] = new Bigplane();
        planes[3] = new Bigplane();
        planes[4] = new Bee();
        planes[5] = new Bee();
        bts = new Bullet[2];
        bts[0] = new Bullet(200, 400);
        bts[1] = new Bullet(200, 600);
    }

    /**
     * 启动程序的执行
     */
    public void action() {
        //1)创建定时器对象
        Timer timer = new Timer();
        //2)创建定时任务对象
        LoopTask task = new LoopTask();
        //3)将定时任务添加到定时器中
        timer.schedule(task, 1000, 10);

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                h.move(x,y);
            }
        });

    }

    public class LoopTask extends TimerTask { //定时任务类
        /**
         * 重写run()方法
         */
        @Override
        public void run() { //定时干的事(每10毫秒自动执行)
            index++;
            creatPlane();
            s.move(); //天空动
            for (int i = 0; i < planes.length; i++) {
                planes[i].move();
            }
            for (int i = 0; i < bts.length; i++) { //遍历所有子弹
                bts[i].move(); //子弹动
            }
            repaint(); //重新调用paint()方法
        }
    }

    /**
     * 重写paint()画  g:画笔
     */
    @Override
    public void paint(Graphics g) {
        s.paintObject(g);
        h.paintObject(g);
        for (int i = 0; i < planes.length; i++) {
            planes[i].paintObject(g);
        }

        for (int i = 0; i < bts.length; i++) {
            bts[i].paintObject(g);
        }
    }

    /**
     * 绘制飞行物
     */
    public void creatPlane() {
        Plane plane;
        if (index % 16 == 0) {
            Random random = new Random();
            int n = random.nextInt(10);
            switch (n) {
                case 7:
                case 8:
                    plane = new Bigplane();
                    break;
                case 9:
                    plane = new Bee();
                    break;
                default:
                    plane = new Airplane();
            }
            planes = Arrays.copyOf(planes, planes.length + 1);
            planes[planes.length - 1] = plane;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        frame.add(world);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        world.action();
    }
}
















