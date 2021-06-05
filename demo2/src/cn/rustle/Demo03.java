package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-05 20:51
 * 用于演示变量的初始化
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * 在声明的同时初始化
         * 声明变量类型 值为20
         */
        //声明并初始化
        int a=20;

        //先声明，再初始化
        int b;
        b=20;

        //未经初始化的变量不能使用
        //表示声明了3的整数类型的变量c,d,e，并e赋值10
        int c,d,e=10;
        //int f=c+d; //会有编译错误，c，d没有赋值

        //变量的类型必须和初始化的值的类型保持一致
        //int f1="2.3";

        //变量初始化的时候一个变量对应一个值
        int c1,d1,e1=10;
        c1=d1=e1;
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
    }
}
