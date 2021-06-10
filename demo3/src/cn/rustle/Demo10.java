package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-08 21:36
 * 类型转换
 */
public class Demo10 {
    public static void main(String[] args) {
        //整数和整数
        int i=5;
        long l=i;//int 转long

        //小数和小数
        float f =1.0f;
        double d=f;//float转double

        //整数和小数
        int k=10;
        double d1=2.6;
        double k2=k+d1;//int转double

        //强制类型转换
        //整数和整数之间
        short s1=120;
        byte b1= (byte) s1;
        System.out.println(b1);

        //在强制转换的过程中，如果超过了有效范围，会发生溢出
        short s2=200;
        byte b2=(byte) s2;
        System.out.println(b2);

        long l1=123456l;
        int i1= (int) l1;
        System.out.println(i1);

        long l2=1000000000000l;
        int i2=(int) l2;
        System.out.println(i2);

        //小数和小数之间:在合理范围内可以转换成功，但会精度缺失
        double d2=2.5;
        float f1= (float) d2;
        System.out.println(f1);

        double d3=1.0/3;
        float f2=(float) d3;
        System.out.println(f2);
    }
}
