package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 子弹 */
public class Bullet extends FlyingObject {
    private double speed; //移动速度
    /** 构造方法 */
    public Bullet(double width,double height,double x,double y,double speed){
        super(width,height,x,y);
        this.speed = speed;
        image = new ImageIcon("images/bullet.png");
    }

    /** 重写move()移动 */
    public void move(){
        y-=speed; //y-(向上)
    }

}













