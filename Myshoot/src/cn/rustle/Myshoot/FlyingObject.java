package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public abstract class FlyingObject {
    protected double width, height, x, y, step;
    protected ImageIcon image;
    protected ImageIcon[] images;
    protected ImageIcon[] bom;
    /**
     * 动画帧计数器
     */
    protected int index = 0;

    public FlyingObject() {
    }

    public FlyingObject(double x, double y, ImageIcon image, ImageIcon[] images, ImageIcon[] bom) {
        this.x = x;
        this.y = y;
        this.image = image;
        this.images = images;
        this.bom = bom;
        width = image.getIconWidth();
        height = image.getIconHeight();
    }

    public abstract void move();

    public void nextImage() {
        if (images == null) {
            return;
        }
///        System.out.println(index + "," + (index % images.length));
        image = images[(index++) / 30 % images.length];
    }

    public void paintObject(Graphics g) {
        nextImage();
        image.paintIcon(null, g, (int) x, (int) y);
    }
}
