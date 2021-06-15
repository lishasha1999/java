package cn.rustle.day02;

/**
 * @author rustle
 * @date 2021-06-15 19:49
 * 取余
 */
public class Demo01 {
    public static void main(String[] args) {
        //当除数是正数的时候，余数是介于0到除数之间的数
        //余数呈周期性变化
        //生成[0,4)之间的余数
        System.out.println(0%4);
        System.out.println(1%4);
        System.out.println(2%4);
        System.out.println(3%4);
        System.out.println(4%4);
        System.out.println(5%4);
        System.out.println(6%4);
        System.out.println(7%4);

        //生成[0,9)之间的余数
        System.out.println(0%9);
        System.out.println(1%9);
        System.out.println(2%9);
        System.out.println(3%9);
        System.out.println(4%9);
        System.out.println(5%9);
        System.out.println(6%9);
        System.out.println(7%9);
    }
}
