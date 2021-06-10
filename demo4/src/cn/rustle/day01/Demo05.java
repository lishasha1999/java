package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 21:49
 * ×ÔÔö ×Ô¼õÁ·Ï°
 */
public class Demo05 {
    public static void main(String[] args) {
        int z=1;
        int x=z++;//x=1 z=2
        int c=x++;//c=1 x=2
        int v=c++;//v=1 c=2
        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(v);
    }
}
