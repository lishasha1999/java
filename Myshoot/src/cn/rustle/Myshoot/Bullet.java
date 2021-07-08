package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 子弹
 * @author Administrator*/
public class Bullet extends FlyingObject {
    private double speed;
    /** 构造方法 */
    public Bullet(double width,double height,double x,double y,double speed){
        super(width,height,x,y);
        this.speed = speed;
        image = Images.bullet;
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y-=speed;
    }

}













