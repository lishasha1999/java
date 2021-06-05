package cn.rustle;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-05 22:03
 */

public class Ball1 extends App {
    //设置变量
    int x1=310,y1=250;
    int x2=310,y2=250;
    int x3=310,y3=250;
    int x4=310,y4=250;

    //创建窗体
    public static void main(String[] args) {
        Ball1 ball1 =new Ball1();
        ball1.start();
    }

    //绘制小球

    @Override
    public void painting(Graphics2D g) {
        //向上移动
        y1=y1-1;
        g.setColor(new Color(20,20,255));
        g.fillOval(x1,y1,60,60);

        //向下移动
        y2=y2+1;
        g.setColor(new Color(255,20,255));
        g.fillOval(x2,y2,60,60);

        //斜向上移动
        x3=x3-1;
        y3=y3-1;
        g.setColor(new Color(20,255,255));
        g.fillOval(x3,y3,60,60);

        //斜向下移动
        x4=x4+1;
        y4=y4-1;
        g.setColor(new Color(125,125,15));
        g.fillOval(x4,y4,60,60);
    }
}
