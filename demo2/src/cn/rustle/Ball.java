package cn.rustle;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-05 21:49
 */

public class Ball extends App {
    //声明两个变量x,y
    int x=0,y=0;

    //创建窗体
    public static void main(String[] args) {
        Ball ball = new Ball();
         ball.start();
    }

    //绘制方法
    @Override
    public void painting(Graphics2D g) {
        //小球横向移动
        x=x+1;
        y= y+1;
        g.setColor(new Color(200,211,2));
        g.fillOval(x,y,60,60);
    }
}
