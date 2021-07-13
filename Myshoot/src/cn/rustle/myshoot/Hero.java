package cn.rustle.myshoot;
import javax.swing.ImageIcon;
/** 英雄机
 * @author Administrator*/
public class Hero extends FlyingObject {
    private int fire;
    /** 构造方法 */
    public Hero(double x,double y){
        ///super(width,height,x,y);
        super(x,y,Images.hero[0],Images.hero,Images.bom);
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        //英雄机的移动，后期单独讲解
    }

    public void move(int x,int y) {
        this.x=x-width/2;
        this.y=y-height/2;
    }

    public void fire(){

    }
}














