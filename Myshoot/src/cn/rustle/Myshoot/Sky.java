package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;

public class Sky extends FlyingObject {
    double speed;
    double y1;


    Sky(double width, double heidgt, double x, double y, double speed, double y1) {
        super(width, heidgt, x, y);
        this.speed = speed;
        this.y1 = y1;
        image = new ImageIcon("images/background.png");
    }

    void move() {
        y += speed;
        y1 += speed;
        if (y >= 700) {
            y = -700;
        }
        if (y1 >= 700) {
            y1 = -700;
        }
    }

    void paintObject(Graphics g) {
        super.paintObject(g);
        image.paintIcon(null, g, (int) x, (int) y1);
    }
}
