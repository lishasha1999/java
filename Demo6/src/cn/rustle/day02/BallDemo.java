package cn.rustle.day02;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-20 16:17
 */
public class BallDemo extends App {

    Ball ball=new Ball();

    public static void main(String[] args) {
        BallDemo ballDemo =new BallDemo();
        ballDemo.start();
    }

    @Override
    public void painting(Graphics2D g) {
       ball.x += ball.offsetX;
       ball.y += ball.offsetY;
        if(ball.x>800-ball.d){
            ball.offsetX=-ball.offsetX;
        }
        //下边界
        else if(ball.y>600-ball.d){
            ball.offsetY=-ball.offsetY;
        }
        //左边界
        else if(ball.x<0){
            ball.offsetX=-ball.offsetX;
        }
        //上边界
        else if(ball.y<0){
            ball.offsetY=-ball.offsetY;
        }
        else{
            System.out.println("111111");
        }
        g.setColor(ball.color);
        g.fillOval(ball.x,ball.y,ball.d,ball.d);
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
}
