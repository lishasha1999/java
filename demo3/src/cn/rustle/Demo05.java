package cn.rustle;

/**
 * @author rustle
 * @date 2021-06-06 15:21
 * float类型
 */
public class Demo05 {
    public static void main(String[] args) {
        //float 类型需要在数值后面添加F/f
        float f= 1.5F;
        System.out.println(f);

        //float的两种写法
        //直接写法
        float f1 = 2.4F;
        //指数写法
        //float类型不能精确的存取小数，会有误差0
        float f2 = 3.14E10F;
        float f3=3.14E-10F;
        System.out.println(f2);
        System.out.println(f3);
    }
}
