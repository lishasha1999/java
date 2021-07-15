package cn.rustle.myshoot;

import javax.swing.*;
import java.util.Random;

/**
 * @author rustle
 * @date 2021-07-09 20:21
 */
public abstract class Plane extends FlyingObject{
    public Plane(){
    }

    public Plane(double x, double y, ImageIcon image, ImageIcon[] images, ImageIcon[] bom){
        super(x, y, image, images, bom);
    }

    public Plane(ImageIcon image, ImageIcon[] images, ImageIcon[] bom){
        Random random=new Random();
        this.image=image;
        width=image.getIconWidth();
        height=image.getIconHeight();
        x= random.nextInt(400-(int)width);
        y=-height;
        this.images=images;
        this.bom=bom;
    }

    @Override
    public void move() {
        y+=step;
    }

}
