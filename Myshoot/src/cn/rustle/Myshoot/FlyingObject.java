package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;

public class FlyingObject {
    double width, height, x, y;
    ImageIcon image;

    FlyingObject(double width, double heidgt, double x, double y) {
        this.width = width;
        this.height = heidgt;
        this.x = x;
        this.y = y;
    }

    void move() {
        System.out.println("飞行物移动");
    }

    void paintObject(Graphics g) {
        image.paintIcon(null, g, (int) x, (int) y);
    }
}
