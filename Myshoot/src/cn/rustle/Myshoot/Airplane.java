package cn.rustle.myshoot;

import javax.swing.ImageIcon;
/** 小敌机
 * @author Administrator*/
public class Airplane extends FlyingObject {
    private double speed;
    //移动速度
    /** 构造方法 */
    public Airplane(double width,double height,double x,double y,double speed){
        super(width,height,x,y);
        this.speed = speed;
        image = Images.airplane[0];
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y+=speed;
        //y+(向下)
    }
}
















