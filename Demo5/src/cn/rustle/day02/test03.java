package cn.rustle.day02;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-20 8:02
 */
public class test03 extends App {
    //小球直径
    int d = (int) (Math.random() * 50 + 10);
    int d1 = (int) (Math.random() * 50 + 10);

    //设置小球坐标 x [0,800-直径） y=x [0,600-直径）
    double x = (Math.random() * (800 - d));
    double y = (Math.random() * (600 - d));

    double x1 = (Math.random() * (800 - d1));
    double y1 = (Math.random() * (600 - d1));

    //随机数生成小球的颜色
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    Color color = new Color(r, g, b);

    int r1 = (int) (Math.random() * 256);
    int g1 = (int) (Math.random() * 256);
    int b1 = (int) (Math.random() * 256);
    Color color1 = new Color(r1, g1, b1);

    //随机数生成小球的偏移量[1,6)
    double offsetX = Math.random() * (6 - 1) + 1;
    double offsetY = Math.random() * (6 - 1) + 1;
    double offsetX1 = Math.random() * (6 - 1) + 1;
    double offsetY1 = Math.random() * (6 - 1) + 1;

    {
        offsetX = Math.random() > 0.5 ? offsetX : -offsetX;
        offsetY = Math.random() > 0.5 ? offsetY : -offsetY;
        offsetX1 = Math.random() > 0.5 ? offsetX1 : -offsetX1;
        offsetY1 = Math.random() > 0.5 ? offsetY1 : -offsetY1;
    }

    public static void main (String[]args){
        test03 test03 = new test03();
        test03.start();
    }

    @Override
    public void painting (Graphics2D g){
        /*
         * +=包含了强制类型转换，小数被截取为整数，会丧失精度
         */
        x += offsetX;
        y += offsetY;
        //右边界
        if(x>800-d){
            offsetX=-offsetX;
        }
        //下边界
        else if(y>600-d){
            offsetY=-offsetY;
        }
        //左边界
        else if(x<0){
            offsetX=-offsetX;
        }
        //上边界
        else if(y<0){
            offsetY=-offsetY;
        }
        else{
            System.out.println("111111");
        }
        g.setColor(color);
        g.fillOval((int) x, (int) y, d, d);

        x1 += offsetX1;
        y1 += offsetY1;
        if(x1>800-d){
            offsetX1=-offsetX1;
        }
        if(y1>600-d){
            offsetY1=-offsetY1;
        }
        if(x1<0){
            offsetX1=-offsetX1;
        }
        if(y1<0){
            offsetY1=-offsetY1;
        }
        g.setColor(color1);
        g.fillOval((int) x1, (int) y1, d1, d1);
    }
}
