package cn.rustle.Day01;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-17 21:38
 * 随机绘制小球
 */
public class Demo03 extends App {
    //小球直径
    int d=(int)(Math.random()*50+10);
    int d1=(int)(Math.random()*50+10);

    //设置小球坐标 x [0,800-直径） y=x [0,600-直径）
    double x=(Math.random()*(800-d));
    double y=(Math.random()*(600-d));

    double x1=(Math.random()*(800-d1));
    double y1=(Math.random()*(600-d1));

    //随机数生成小球的颜色
    int r=(int)(Math.random()*256);
    int g=(int)(Math.random()*256);
    int b=(int)(Math.random()*256);
    Color color=new Color(r,g,b);

    int r1=(int)(Math.random()*256);
    int g1=(int)(Math.random()*256);
    int b1=(int)(Math.random()*256);
    Color color1=new Color(r1,g1,b1);

    //随机数生成小球的偏移量[1,6)
    double offsetX=Math.random()*(6-1)+1;
    double offsetY=Math.random()*(6-1)+1;

    public static void main(String[] args) {
        Demo03 demo03=new Demo03();
        demo03.start();
    }

    @Override
    public void painting(Graphics2D g) {
        /*
         * +=包含了强制类型转换，小数被截取为整数，会丧失精度
         */
        x += offsetX;
        y += offsetY;
        g.setColor(color);
        g.fillOval((int) x, (int) y, d, d);

        x1 += offsetX;
        y1 += offsetY;
        g.setColor(color1);
        g.fillOval((int) x1, (int) y1, d1, d1);
    }
}
