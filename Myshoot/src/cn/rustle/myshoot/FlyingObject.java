package cn.rustle.myshoot;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/**
 * @author Administrator
 */
public abstract class FlyingObject {
    /**
     * 静态常量：飞行物的状态
     * 1：活着 0：死亡 -1：僵尸
     */
    public static final int LIVING = 1;
    public static final int DEAD = 0;
    public static final int ZOMBIE = -1;
    /**
     * 设置飞行物的初始状态
     */
    protected int state = LIVING;
    /**
     * 设置飞行物的生命值
     */
    protected int life = 1;
    private int i = 0;
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

    /**
     * 飞行物移动方法
     */
    public abstract void move();

    /**
     * 动画帧
     * 定义一个变量用于控制爆炸图片
     */
    public void nextImage() {
        switch (state) {
            case LIVING:
                if (images == null) {
                    return;
                }
                image = images[(index++) / 20 % images.length];
                break;
            case DEAD:
                index = i++ / 30;
                if (bom == null) {
                    return;
                }
                if (index == bom.length) {
                    state = ZOMBIE;
                    return;
                }
                image = bom[index];
        }
    }

    public void paintObject(Graphics g) {
        nextImage();
        image.paintIcon(null, g, (int) x, (int) y);
    }

    /**
     * 碰撞方法
     */
    public boolean duang(FlyingObject bu) {
        FlyingObject p = this;
        double r1 = Math.min(p.width / 2, p.height / 2);
        double x1 = p.x + width / 2;
        double y1 = p.y + height / 2;

        double r2 = Math.min(bu.width / 2, bu.height / 2);
        double x2 = bu.x + bu.width / 2;
        double y2 = bu.y + bu.height / 2;

        double a = y2 - y1;
        double b = x2 - x1;
        double c = Math.sqrt(a * a + b * b);
        return c < r1 + r2;
    }

    /**
     * 打击方法
     */
    public boolean hit() {
        if (life > 0) {
            life--;
            if (life == 0) {
                state = DEAD;
            }
            return true;
        }
        return false;
    }

    /**
     * 英雄机死亡方法
     * @return
     */
    public boolean goDead() {
        if (state == LIVING) {
            life = 0;
            state = DEAD;
            return true;
        } else {
            return false;
        }
    }

    ;

    public boolean isLiving() {
        return state == LIVING;
    }

    public boolean isDead() {
        return state == DEAD;
    }

    public boolean isZombie() {
        return state == ZOMBIE;
    }

    /**
     * 判断飞行物及子弹是否出界
     * @return true：出界 false:未出界
     */
    public boolean outOfBounds(){
        if(y<-height-50){
            return true;
        }else if(y>700+50){
            return true;
        }else {
            return false;
        }
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
