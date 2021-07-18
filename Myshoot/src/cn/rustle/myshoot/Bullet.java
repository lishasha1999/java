package cn.rustle.myshoot;

/** 子弹
 * @author Administrator*/
public class Bullet extends FlyingObject {

    /** 构造方法 */
    public Bullet(double x,double y){
        super(x,y,Images.bullet,null,null);
        this.step = 4;
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y-=step;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}













