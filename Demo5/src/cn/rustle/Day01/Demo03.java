package cn.rustle.Day01;

import cn.tedu.util.App;

import java.awt.*;

/**
 * @author rustle
 * @date 2021-06-17 21:38
 * �������С��
 */
public class Demo03 extends App {
    //С��ֱ��
    int d=(int)(Math.random()*50+10);
    int d1=(int)(Math.random()*50+10);

    //����С������ x [0,800-ֱ���� y=x [0,600-ֱ����
    double x=(Math.random()*(800-d));
    double y=(Math.random()*(600-d));

    double x1=(Math.random()*(800-d1));
    double y1=(Math.random()*(600-d1));

    //���������С�����ɫ
    int r=(int)(Math.random()*256);
    int g=(int)(Math.random()*256);
    int b=(int)(Math.random()*256);
    Color color=new Color(r,g,b);

    int r1=(int)(Math.random()*256);
    int g1=(int)(Math.random()*256);
    int b1=(int)(Math.random()*256);
    Color color1=new Color(r1,g1,b1);

    //���������С���ƫ����[1,6)
    double offsetX=Math.random()*(6-1)+1;
    double offsetY=Math.random()*(6-1)+1;

    public static void main(String[] args) {
        Demo03 demo03=new Demo03();
        demo03.start();
    }

    @Override
    public void painting(Graphics2D g) {
        /*
         * +=������ǿ������ת����С������ȡΪ��������ɥʧ����
         */
        x += offsetX;
        y += offsetY;
        g.setColor(color);
        g.fillOval((int) x, (int) y, d, d);

        x1 += offsetX;
        y1 += offsetY;
        g.setColor(color1);
        g.fillOval((int) x1, (int) y1, d1, d1);
    }
}
