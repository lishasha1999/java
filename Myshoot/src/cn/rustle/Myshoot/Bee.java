package cn.rustle.myshoot;
import javax.swing.ImageIcon;

/** 小蜜蜂 */
public class Bee extends FlyingObject {
    private double speed; //移动速度
    private double direction; //移动方向
    /** 构造方法 */
    public Bee(double width,double height,double x,double y,double speed,double direction){
        super(width,height,x,y);
        this.speed = speed;
        this.direction = direction;
        image = new ImageIcon("images/bee0.png");
    }

    /** 重写move()移动 */
    public void move(){
        y+=speed; //y+(向下)
        x+=direction; //direction为1表示向右，direction为-1表示向左
        if(x<=0){          //若x<=0，表示到最左边了
            direction = 1; //则direction为1，即向右
        }
        if (x>=400-width) { //若x>=窗口宽-小蜜蜂宽，表示到最右边了
            direction = -1; //则direction为-1，即向左
        }
    }
}










