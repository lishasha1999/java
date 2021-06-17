package cn.rustle.Day01;

import java.util.Random;

/**
 * @author rustle
 * @date 2021-06-17 21:14
 * 随机数  java.util.Random
 */
public class Demo02 {
    public static void main(String[] args) {
        //实例化对象
        Random random =new Random();
        //调用方法生成随机数
        int n=random.nextInt();//正负21亿
        System.out.println(n);

        //0-10之间的随机整数[0,10)
        n= random.nextInt(10);
        System.out.println(n);
        //[5,10)
        n= random.nextInt(10-5)+5;
        System.out.println(n);

        //生成随机小数[0,1)
        System.out.println(random.nextDouble());
        //[0,5)
        double d= random.nextDouble()*5;
        System.out.println(d);
    }
}
