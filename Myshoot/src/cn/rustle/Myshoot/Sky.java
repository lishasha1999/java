package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class Sky extends FlyingObject {
    double speed;
    double y1;


    Sky(double width, double height, double x, double y, double speed, double y1) {
        super(width, height, x, y);
        this.speed = speed;
        this.y1 = y1;
        image = Images.sky;
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    @Override
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

    @Override
    void paintObject(Graphics g) {
        super.paintObject(g);
        image.paintIcon(null, g, (int) x, (int) y1);
    }
}
