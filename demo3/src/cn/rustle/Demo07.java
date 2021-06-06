package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-06 16:11
 * 浮点数计算
 */
public class Demo07 {
    public static void main(String[] args) {
        //小数和小数计算，如果存在整数，则转换为浮点数
        double d1=1.0/3.0;
        d1=3.0/1;
        System.out.println(d1);

        //两个整数相除，直接舍去小数部分，得整数
        int a=1/3;
        System.out.println(a);

        double d2=7/2;
        System.out.println(d2);

        double d3=7.0/2.0;
        System.out.println(d3);

        double d4=7/0D;
        System.out.println(d4);

        double f1=2.6;
        double f2=1.3;
        double f3=2.0;
        double f4=f1-f2;
        double f5=f1-f3;
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f5 == 0.6);
        //对浮点数的精确比较，可以使用绝对值
        System.out.println(Math.abs(f5-0.6)<0.0000001);
    }
}
