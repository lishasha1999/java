package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-06 10:51
 * int类型
 */
public class Demo03 {
    public static void main(String[] args) {
        int max_value = Integer.MAX_VALUE;
        int min_value = Integer.MIN_VALUE;
        System.out.println("int的最大值：" + max_value);
        System.out.println("int的最小值：" + min_value);

        int b = 100;
        System.out.println(b);

        int c=0x186e4;
        int d=01257;
        System.out.println(c);
        System.out.println(d);
        int e=7/2;
        System.out.println(e);

        //溢出显示
        System.out.println(max_value+1);
        System.out.println(min_value-1);
    }
}
