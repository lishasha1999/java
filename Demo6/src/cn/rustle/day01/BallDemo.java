package cn.rustle.day01;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-20 10:52
 */
public class BallDemo {
    public static void main(String[] args) {
        Ball ball01=new Ball();
        Ball ball02=new Ball();
    }
}

class Ball{
    int d;
    double x,y;
    int r,g,b;
    Color color;
    double offsetX,offsetY;
}
