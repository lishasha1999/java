package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 英雄机
 * @author Administrator*/
public class Hero extends FlyingObject {
    private int fire;
    /** 构造方法 */
    public Hero(double width,double height,double x,double y,int fire){
        super(width,height,x,y);
        this.fire = fire;
        image = Images.hero[0];
        width= image.getIconWidth();
        height= image.getIconHeight();
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        //英雄机的移动，后期单独讲解
    }
}














