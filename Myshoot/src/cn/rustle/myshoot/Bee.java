package cn.rustle.myshoot;


/**
 * 小蜜蜂
 * @author Administrator
 */

public class Bee extends Plane implements Award {

    private double direction;

    /**
     * 构造方法
     */
    public Bee() {
        super(Images.bee[0], Images.bee, Images.bom);
        step = Math.random() * 5 + 2;
    }

    public Bee(double x, double y, double step) {
        super(x, y, Images.bee[0], Images.bee, Images.bom);
        this.step = step;
    }

    /**
     * 重写move()移动
     */
    @Override
    public void move() {
        y += step;
        x += direction;
        if (x <= 0) {
            direction = 1;
        }
        if (x >= 400 - width) {
            direction = -1;
        }
    }

    @Override
    public int getAward() {
        return Math.random() > 0.5 ? DOUBLE_FIRE : LIFE;
    }
}










