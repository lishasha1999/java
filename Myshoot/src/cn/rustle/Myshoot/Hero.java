package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 英雄机 */
public class Hero extends FlyingObject {
    private int fire; //火力值
    /** 构造方法 */
    public Hero(double width,double height,double x,double y,int fire){
        super(width,height,x,y);
        this.fire = fire;
        image = new ImageIcon("images/hero0.png");
    }

    /** 重写move()移动 */
    public void move(){
        //英雄机的移动，后期单独讲解
    }
}














