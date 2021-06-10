package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 20:13
 * 四则运算--加法
 */
public class Demo01 {
    public static void main(String[] args) {
        //一般情况，基本数据类型做加法运算
        int a=50;
        int b=100;
        int c=a+b; //整数+整数，结果是整数
        System.out.println(c);

        a=Integer.MAX_VALUE;
        b=8;
        c=a+b;//两个整数做运算，如果超过范围会溢出
        System.out.println(c);

        a=Integer.MAX_VALUE;
        b=5;
        long l =a+b;//溢出
        System.out.println(l);
        l=(long) a+b;//不会溢出
        System.out.println(l);

        a=5;
        l=1000;
        l=a;//自动类型转换

        /*
        *byte,short,char 在做运算时，一律按照int计算
         */
        byte  b1=5;
        short s1=6;
        short s2= (short) (b1+s1);

        //字符串使用加号实现字符串拼接
        System.out.println("520"+"1314");
    }
}
