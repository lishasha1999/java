package cn.rustle.myshoot;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 整个游戏窗口
 *
 * @author Administrator
 */
public class World extends JPanel {
    public static final int READY = 0;
    public static final int RUNNING = 1;
    public static final int PAUSE = 2;
    public static final int GAME_OVER = 3;
    private int state = READY;
    /**
     * 如下为窗口中所显示的对象
     */
    private Sky s;
    private Hero h;
    private Bullet[] bts;
    private FlyingObject[] planes;
    private int index = 0;
    private int score = 0;
    private int life = 3;

    /**
     * 构造方法
     */
    public World() {
        s = new Sky();
        h = new Hero(150, 400);
        planes = new FlyingObject[0];
        bts = new Bullet[0];

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
                if (state == RUNNING) {
                    int x = e.getX();
                    int y = e.getY();
                    h.move(x, y);
                }
            }
        });
        this.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                if (state == READY) {
                    state = RUNNING;
                }else if (state==GAME_OVER){
                    score=0;
                    life=3;
                    planes=new FlyingObject[0];
                    bts=new Bullet[0];
                    h=new Hero(140,388);
                    state=READY;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (state == PAUSE) {
                    state = RUNNING;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (state == RUNNING) {
                    state = PAUSE;
                }
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
            if (state == RUNNING) {
                fireAction();
                creatPlane();
                objectMove();
                hitDetection();
                runAway();
                clean();
            }
            s.move(); //天空动
            repaint(); //重新调用paint()方法
        }
    }

    /**
     * 飞行物和子弹移动
     */
    public void objectMove() {
        for (FlyingObject plane : planes) {
            if (plane.isLiving()) {
                plane.move();
            }
        }
        for (Bullet bt : bts) {
            if (bt.isLiving()) {
                bt.move();
            }
        }
    }

    /**
     * 重写paint()画  g:画笔
     */
    @Override
    public void paint(Graphics g) {
        s.paintObject(g);
        h.paintObject(g);
        for (FlyingObject plane : planes) {
            plane.paintObject(g);
        }
        for (Bullet bt : bts) {
            bt.paintObject(g);
        }
        g.setColor(Color.white);
        g.setFont(new Font("宋体", Font.BOLD, 20));
        g.drawString("Score:" + score, 20, 40);
        g.drawString("Life:" + life, 20, 60);
        if (state == READY) {
            Images.start.paintIcon(this, g, 0, 0);
        }
        if (state == PAUSE) {
            Images.pause.paintIcon(this, g, 0, 0);
        }
        if (state == GAME_OVER) {
            Images.gameover.paintIcon(this, g, 0, 0);
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

    /**
     * 绘制子弹
     */
    public void fireAction() {
        if(!h.isLiving()){
            return;
        }
        if (index % 15 == 0) {
            Bullet[] double_bullet = h.openFire();
            int len = bts.length;
            Bullet[] arr = Arrays.copyOf(bts, len + double_bullet.length);
            System.arraycopy(double_bullet, 0, arr, len, double_bullet.length);
            bts = arr;
        }
    }

    /**
     * 碰撞检测
     */
    public void hitDetection() {
        for (Bullet bt : bts) {
            if (!bt.isLiving()) {
                continue;
            }
            for (FlyingObject plane : planes) {
                if (!plane.isLiving()) {
                    continue;
                }
                if (plane.duang(bt)) {
                    bt.goDead();
                    plane.hit();
                    score(plane);
                }
            }
        }
    }

    /**
     * 清理掉被打掉和飞出范围的飞机和子弹
     */
    public void clean() {
        FlyingObject[] living = new FlyingObject[planes.length];
        int index = 0;
        for (FlyingObject plane : planes) {
            if (plane.isZombie() || plane.outOfBounds()) {
                continue;
            }
            living[index++] = plane;
        }
        planes = Arrays.copyOf(living, index);

        Bullet[] arr = new Bullet[bts.length];
        index = 0;
        for (Bullet bt : bts) {
            if (bt.isDead() || bt.outOfBounds()) {
                continue;
            }
            arr[index++] = bt;
        }
        bts = Arrays.copyOf(arr, index);
    }

    /**
     * 封装计分方法
     */
    public void score(FlyingObject plane) {
        if (plane.isDead()) {
            if (plane instanceof Airplane) {
                Enemy enemy = (Enemy) plane;
                score += enemy.getSorce();
            } else if (plane instanceof Bigplane) {
                Enemy enemy = (Enemy) plane;
                score += enemy.getSorce();
            } else if (plane instanceof Bee) {
                Award award = (Award) plane;
                int type = award.getAward();
                if (type == Award.DOUBLE_FIRE) {
                    h.doubleFire();
                } else if (type == 2) {
                    life++;
                }
            }
        }
    }

    public void runAway() {
        if (h.isLiving()) {
            for (FlyingObject plane : planes) {
                if (!plane.isLiving()) {
                    continue;
                }
                if (h.duang(plane)) {
                    h.goDead();
                    plane.goDead();
                    break;
                }
            }
        }else if(h.isZombie()){
            if(life>0) {
                h = new Hero(138, 380);
                for (FlyingObject plane : planes) {
                    plane.goDead();
                }
                life--;
            }else{
                state=GAME_OVER;
            }
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
















