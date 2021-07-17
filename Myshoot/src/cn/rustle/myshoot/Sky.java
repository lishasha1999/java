package cn.rustle.myshoot;

import java.awt.*;

/**
 * @author Administrator
 */
public class Sky extends FlyingObject {
    private double y0;

    public Sky(){
        super(0,0,Images.sky,null,null);
        step=0.8;
        y0=-height;
    }

    @Override
    public void move() {
        y += step;
        y0 += step;
        if (y >= 700) {
            y = -700;
        }
        if (y0 >= 700) {
            y0 = -700;
        }
    }

    @Override
    public void paintObject(Graphics g) {
        super.paintObject(g);
        image.paintIcon(null, g, (int) x, (int) y0);
    }
}
