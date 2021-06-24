package cn.rustle.day03;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-24 21:37
 * 用方法重构小球
 */
public class BallDemo extends App {

    Ball ball=new Ball();
    Ball ball1=new Ball();
    public static void main(String[] args) {
        BallDemo ballDemo =new BallDemo();
        ballDemo.start();
    }

    @Override
    public void painting(Graphics2D g) {
        ball.move();
        ball.paint(g);

        ball1.move();
        ball1.paint(g);
    }
}

class Ball{
    int d;
    int x,y;
    int r,g,b;
    Color color;
    double offsetX,offsetY;

    public Ball(){
        d=(int)(Math.random()*(60-10)+10);
        x=(int)(Math.random()*(800-d));
        y=(int)(Math.random()*(600-d));
        r=(int)(Math.random()*256);
        g=(int)(Math.random()*256);
        b=(int)(Math.random()*256);
        color= new Color(r,g,b);
        offsetX=Math.random()*(6-1)+1;
        offsetY=Math.random()*(6-1)+1;
        offsetX=Math.random()>0.5?offsetX:-offsetX;
        offsetY=Math.random()>0.5?offsetY:-offsetY;
    }

    public void move(){
        x += offsetX;
        y += offsetY;
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
    }

    public void paint(Graphics2D g){
        g.setColor(color);
        g.fillOval(x,y,d,d);
    }
}
