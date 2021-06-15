package cn.rustle.day02;

/**
 * @author rustle
 * @date 2021-06-15 20:39
 * 与或非
 */
public class Demo03 {
    public static void main(String[] args) {
        /*
         *与运算符，两边为真则为真，见false为false
         */
        int age=18;
        boolean b=age>=20 & age<30;
        //         false  &     true
        System.out.println(b);//false

        /*
         * 与运算，有一边为真则为真
         */
        boolean flag=true;
        int n=200;
        boolean b1 = flag | n<100;
        //          true  | false 多个条件只要一个条件满足结果为真
        System.out.println(b1);

        /*
         *非运算 只有一个Boolean参与运算，值取反
         */
        boolean flag1=true;
        boolean b2=!flag1;
        System.out.println(b2);
    }
}
