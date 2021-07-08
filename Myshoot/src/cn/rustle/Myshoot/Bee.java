package cn.rustle.myshoot;

import javax.swing.ImageIcon;

/**
 * 小蜜蜂
 *
 * @author Administrator
 */

public class Bee extends FlyingObject {
    private double speed;
    private double direction;

    /**
     * 构造方法
     */
    public Bee(double width, double height, double x, double y, double speed, double direction) {
        super(width, height, x, y);
        this.speed = speed;
        this.direction = direction;
        image = Images.bee[0];
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    /**
     * 重写move()移动
     */
    @Override
    public void move() {
        y += speed;
        x += direction;
        if (x <= 0) {
            direction = 1;
        }
        if (x >= 400 - width) {
            direction = -1;
        }
    }
}










