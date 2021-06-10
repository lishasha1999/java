package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 20:35
 * 四则运算--减法，除法
 */
public class Demo02 {
    public static void main(String[] args) {
        //减法
        double a1=4.0;
        double b1=3.9;
        System.out.println(a1-b1);//0.10000000000000009

        String s1="1";
        String s2="2";
//        System.out.println(s1-s2);编译错诶，字符串只能凭借，不能用于相减
        System.out.println(s1+s2);//字符串拼接
//        System.out.println(s1*s2);编译错诶，字符串只能凭借，不能用于相乘
//        System.out.println(s1/s2);编译错诶，字符串只能凭借，不能用于相除

        //除法
        //两个整数相除，结果是整数
        System.out.println(12/3);
        System.out.println(13/3);
        //既有整数又有小数，会将整数转换为小数
        System.out.println(13.0/4);
        System.out.println(12D/4);
    }
}
