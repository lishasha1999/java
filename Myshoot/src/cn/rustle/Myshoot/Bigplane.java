package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 大敌机 */
public class Bigplane extends FlyingObject {
    private double speed; //移动速度
    /** 构造方法 */
    public Bigplane(double width,double height,double x,double y,double speed){
        super(width,height,x,y);
        this.speed = speed;
        image = new ImageIcon("images/bigairplane0.png");
    }

    /** 重写move()移动 */
    public void move(){
        y+=speed; //y+(向下)
    }
}













