package cn.rustle.myshoot;
import javax.swing.ImageIcon;
import java.util.Random;

/** 大敌机
 * @author Administrator*/
public class Bigplane extends Plane {

    public Bigplane(){
        super(Images.bigplane[0],Images.bigplane,Images.bom);
        step=Math.random()*3+0.5;
    }
    /** 构造方法 */
    public Bigplane(double x,double y,double speed){
        super(x,y,Images.bigplane[0],Images.bigplane,Images.bom);
        this.step = speed;
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y+=step;
    }
}













