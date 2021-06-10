package cn.rustle.day01;

/**
 * @author rustle
 * @date 2021-06-10 21:17
 * 自增自减运算
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
         * a++是一个表达式
         * 后加加，先赋值，后运算
         */
        int a=1;
        System.out.println(a++);
        System.out.println(a);

        /*
         * ++b是一个表达式
         * 前加加，先运算，后赋值
         */
        int b=2;
        System.out.println(++b);
        System.out.println(b);

        /*
         * c--是一个表达式
         * 后减减，先赋值，后运算
         */
        int c=5;
        System.out.println(c--);
        System.out.println(c);

        /*
         * --c是一个表达式
         * 前减减，先运算，后赋值
         */
        int d=6;
        System.out.println(--d);
        System.out.println(d);
    }
}
