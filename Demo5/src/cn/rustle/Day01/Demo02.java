package cn.rustle.Day01;

import java.util.Random;

/**
 * @author rustle
 * @date 2021-06-17 21:14
 * �����  java.util.Random
 */
public class Demo02 {
    public static void main(String[] args) {
        //ʵ��������
        Random random =new Random();
        //���÷������������
        int n=random.nextInt();//����21��
        System.out.println(n);

        //0-10֮����������[0,10)
        n= random.nextInt(10);
        System.out.println(n);
        //[5,10)
        n= random.nextInt(10-5)+5;
        System.out.println(n);

        //�������С��[0,1)
        System.out.println(random.nextDouble());
        //[0,5)
        double d= random.nextDouble()*5;
        System.out.println(d);
    }
}
