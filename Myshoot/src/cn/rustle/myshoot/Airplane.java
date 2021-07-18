package cn.rustle.myshoot;


/** 小敌机
 * @author Administrator*/
public class Airplane extends Plane {


    public Airplane(){
        super(Images.airplane[0],Images.airplane,Images.bom);
        step=Math.random()*4+1.5;
    }
    /** 构造方法 */
    public Airplane(double x,double y,double step){
        super(x,y,Images.airplane[0],Images.airplane,Images.bom);
        this.step = step;
    }

    /** 重写move()移动 */
    @Override
    public void move(){
        y+=step;
        //y+(向下)
    }

}
















