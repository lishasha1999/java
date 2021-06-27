package cn.rustle.Ball;

import java.awt.*;

public class Ball {
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
            x=800-d;
        }
        //下边界
        else if(y>600-d){
            offsetY=-offsetY;
            y=600-d;
        }
        //左边界
        else if(x<0){
            offsetX=-offsetX;
            x=0;
        }
        //上边界
        else if(y<0){
            offsetY=-offsetY;
            y=0;
        }
    }

    public void paint(Graphics2D g){
        g.setColor(color);
        g.fillOval(x,y,d,d);
    }

    public boolean eat(Ball ball){
        //大球坐标
        double X =this.x;
        double Y=this.y;
        double D=this.d;

        //小球坐标
        double x=ball.x;
        double y= ball.y;
        double d= ball.d;

        //检查球的直径是否合理
        if(d>D){
            return false;//不进行下一步比较
        }

        //计算两球之间的距离
        double a=x-x;
        double b=Y-y;
        double c=Math.sqrt(a*a+b*b);
        boolean eaten=c<(D/2-d/2);

        //如果发生了“吃”，就将两球合并
        if(eaten){
            //计算吃掉后的圆面积
            double R=D/2;
            double r=d/2;
            double area=Math.PI*R*R+Math.PI*r*r;
            //计算半径
            double rx =Math.sqrt(area/Math.PI);
            this.d=(int) rx/2;
        }
        return eaten;
    }
}
