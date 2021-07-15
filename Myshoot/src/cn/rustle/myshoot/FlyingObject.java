package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

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

    /**
     * 碰撞方法
     */
    public boolean duang(FlyingObject bu){
        FlyingObject p=this;
        double r1=Math.min(p.width/2,p.height/2);
        double x1=p.x+width/2;
        double y1=p.y+height/2;

        double r2=Math.min(bu.width/2, bu.height/2);
        double x2= bu.x+ bu.width/2;
        double y2=bu.y+bu.height/2;

        double a=y2-y1;
        double b=x2-x1;
        double c=Math.sqrt(a*a+b*b);
        return c<r1+r2;
    }

    @Override
    public String toString() {
        return "FlyingObject{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", step=" + step +
                ", image=" + image +
                ", images=" + Arrays.toString(images) +
                ", bom=" + Arrays.toString(bom) +
                ", index=" + index +
                '}';
    }
}
