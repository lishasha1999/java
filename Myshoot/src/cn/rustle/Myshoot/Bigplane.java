package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 大敌机
 * @author Administrator*/
public class Bigplane extends FlyingObject {
    private double speed;
    /** 构造方法 */
    public Bigplane(double width,double height,double x,double y,double speed){
        super(width,height,x,y);
        this.speed = speed;
        image = Images.bigplane[0];
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y+=speed;
    }
}













