package cn.rustle.day02;

/**
 * @author rustle
 * @date 2021-06-15 21:58
 * 复合运算
 */
public class Demo07 {
    public static void main(String[] args) {
        //整数和整数间的复合运算
        int n=1;
        n+=5;
        System.out.println(n);

        //整数和小数的复合运算
        n=2;
        n+=9.5;
        System.out.println(n);

        n=1;
        n-=8;
        System.out.println(n);

        n=2;
        n-=9.5;
        System.out.println(n);

        n=1;
        n*=6;
        System.out.println(n);

        double d=3.5;
        d+=4;
        System.out.println(d);
    }
}
