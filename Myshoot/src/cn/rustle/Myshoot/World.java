package cn.rustle.myshoot;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;
/** 整个游戏窗口
 * @author Administrator
 *
 */
public class World extends JPanel {
    /**如下为窗口中所显示的对象*/
    private Sky s;
    private Hero h;
    private Airplane[] as;
    private Bigplane[] bas;
    private Bee[] bs;
    private Bullet[] bts;
    /** 构造方法 */
    public World(){
        s = new Sky(400,700,0,0,1,-700);
        h = new Hero(65,50,140,400,0);
        as = new Airplane[2];
        as[0] = new Airplane(45,45,10,30,2);
        as[1] = new Airplane(45,45,300,30,2);
        bas = new Bigplane[2];
        bas[0] = new Bigplane(80,80,20,100,2);
        bas[1] = new Bigplane(80,80,200,100,2);
        bs = new Bee[2];
        bs[0] = new Bee(30,30,80,100,2,1);
        bs[1] = new Bee(30,30,150,300,2,1);
        bts = new Bullet[2];
        bts[0] = new Bullet(8,8,200,400,3);
        bts[1] = new Bullet(8,8,200,600,3);
    }

    /** 启动程序的执行 */
    public void action(){
        //1)创建定时器对象
        Timer timer = new Timer();
        //2)创建定时任务对象
        LoopTask task = new LoopTask();
        //3)将定时任务添加到定时器中
        timer.schedule(task,1000,10);
    }

    public class LoopTask extends TimerTask{ //定时任务类
        /** 重写run()方法 */
        @Override
        public void run(){ //定时干的事(每10毫秒自动执行)
            s.move(); //天空动
            for(int i=0;i<as.length;i++) { //遍历所有小敌机
                as[i].move(); //小敌机动
            }
            for(int i=0;i<bas.length;i++){ //遍历所有大敌机
                bas[i].move(); //大敌机动
            }
            for(int i=0;i<bs.length;i++){ //遍历所有小蜜蜂
                bs[i].move(); //小蜜蜂动
            }
            for(int i=0;i<bts.length;i++){ //遍历所有子弹
                bts[i].move(); //子弹动
            }
            repaint(); //重新调用paint()方法
        }
    }

    /** 重写paint()画  g:画笔 */
    @Override
    public void paint(Graphics g){
        s.paintObject(g);
        h.paintObject(g);
        for(int i=0;i<as.length;i++){
            as[i].paintObject(g);
        }
        for(int i=0;i<bas.length;i++){
            bas[i].paintObject(g);
        }
        for(int i=0;i<bs.length;i++){
            bs[i].paintObject(g);
        }
        for(int i=0;i<bts.length;i++){
            bts[i].paintObject(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //3.
        World world = new World();
        frame.add(world);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法

        world.action(); //启动程序的执行
    }
}
















