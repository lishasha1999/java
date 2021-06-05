package cn.rustle;

/*引用cn.tedu.util.App*/
import cn.tedu.util.App;
import java.awt.*;

public class Demo01 extends App{
    public static void main(String[] args){
        System.out.println("start Demo");
        //创建DEMO对象
        Demo01 demo=new Demo01();
        //使用start方法
        demo.start();
    }

    /*封装好的绘制方法，来自于APP类
     *Graphics2D是画笔对象，封装了很多绘画功能
     * ;表示一行代码的结束
     */
    @Override//重写的标志
    public void painting(Graphics2D g) {
        /*创建颜色 RGB格式
        * new Color();创建颜色类
        */
        g.setColor(new Color(255,0,255));//给画笔设置颜色
        g.setFont( new Font("黑体",Font.BOLD,30));//给画笔设置字体
        //绘制字符串
        g.drawString("NEW DEMO",90,50);

        g.setColor(new Color(255,0,0));
        g.setFont( new Font("新宋体",Font.BOLD,30));
        g.drawString("DEMO END",150,200);

        //fillOval绘制小球
        g.fillOval(30,50,50,50);

        g.setColor(new Color(200,200,50));
        g.fillOval(80,80,50,50);
    }
}
