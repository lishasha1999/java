package cn.rustle.myshoot;
import javax.swing.ImageIcon;
import java.util.Arrays;

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
    public void move() {

    }

    public void move(int x,int y) {
        this.x=x-width/2;
        this.y=y-height/2;
    }

    /** 开火方法
     * 英雄机发射子弹
     */
    public Bullet fire(){
        double x=this.x+width/2-5;
        double y =this.y-15;
        Bullet bullet=new Bullet(x,y);
        return bullet;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", step=" + step +
                ", image=" + image +
                ", images=" + Arrays.toString(images) +
                ", bom=" + Arrays.toString(bom) +
                ", index=" + index +
                ", fire=" + fire +
                '}';
    }
}














