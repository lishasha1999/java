package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-05 21:19
 * 变量数据的存取
 */
public class Demo04 {
    public static void main(String[] args) {
        int a=10;
        a=6;
        System.out.println(a);

        int c=a+10;
        System.out.println(c);

        //需求 输出a1=20,b1=10
        int a1=10,b1=20;
        int tmp;
        tmp=a1;
        a1=b1;
        b1=tmp;
        System.out.println(a1);
        System.out.println(b1);

        //变量的好处就是可以实现数据的变化
        int i=5;
        System.out.println(i++);
        System.out.println(i);
    }
}
